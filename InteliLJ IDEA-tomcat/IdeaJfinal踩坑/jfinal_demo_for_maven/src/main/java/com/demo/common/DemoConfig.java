package com.demo.common;

import com.demo.HLLayout.LayoutController;
import com.demo.blog.BlogController;
import com.demo.common.model._MappingKit;
import com.demo.index.IndexController;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.kit.PathKit;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;

/**
 * 本 demo 仅表达最为粗浅的 jfinal 用法，更为有价值的实用的企业级用法
 * 详见 JFinal 俱乐部: http://jfinal.com/club
 * 
 * API引导式配置
 */
public class DemoConfig extends JFinalConfig {
	
	/**
	 * 运行此 main 方法可以启动项目，此main方法可以放置在任意的Class类定义中，不一定要放于此
	 * 
	 * 使用本方法启动过第一次以后，会在开发工具的 debug、run config 中自动生成
	 * 一条启动配置，可对该自动生成的配置再添加额外的配置项，例如 VM argument 可配置为：
	 * -XX:PermSize=64M -XX:MaxPermSize=256M
	 */
	public static void main(String[] args) {
		/**
		 * 特别注意：Eclipse 之下建议的启动方式
		 */
		//这里 需要针对自己的项目修改 第一端口号 第二 对应的服务器 应用目录参数context /jfinalserver idea创建的工程取消最后的参数 热加载参数
		//JFinal.start("src/main/webapp", 8080, "/jfinalserver", 5);
		JFinal.start("src/main/webapp", 8080, "/jfinalserver");
		
		/**
		 * 特别注意：IDEA 之下建议的启动方式，仅比 eclipse 之下少了最后一个参数
		 */
		// JFinal.start("src/main/webapp", 80, "/");
	}
	
	/**
	 * 配置常量
	 */
	public void configConstant(Constants me) {

		//这里为PropKit配置指明 可以全局获取的属性文件
		// 加载少量必要配置，随后可用PropKit.get(...)获取值
		PropKit.use("a_little_config.txt");
		me.setDevMode(PropKit.getBoolean("devMode", false));
	}
	
	/**
	 * 配置路由
	 */
	public void configRoute(Routes me) {
		me.add("/", IndexController.class, "/index");	// 第三个参数为该Controller的视图存放路径
		me.add("/blog", BlogController.class,
				"/blog");			// 第三个参数省略时默认与第一个参数值相同，在此即为 "/blog"
		me.add("/layout", LayoutController.class,"/common");
	}
	
	public void configEngine(Engine me) {
		me.addSharedFunction("/common/_layout.html");
		me.addSharedFunction("/common/_paginate.html");
		me.addSharedFunction("/common/_nav.html");
		me.addSharedFunction("/common/_navleft.html");
	}
	
	/**
	 * 配置插件
	 */
	public void configPlugin(Plugins me) {

		//针对自己的数据库插件配置 我们需要修改 这个Jfinal数据库插件的默认配置文件 在 resources目录下 有一个a_little_config.txt文件
		//其中针对自己在本机创建的数据库名字 和用户名 与 密码  更改配置 即可
		// 配置 druid 数据库连接池插件
		DruidPlugin druidPlugin = new DruidPlugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password").trim());
		me.add(druidPlugin);
		
		// 配置ActiveRecord插件
		ActiveRecordPlugin arp = new ActiveRecordPlugin(druidPlugin);
		//arp.setBaseSqlTemplatePath(...)设置了 sql 文件存放的基础路径，注意上例代 码将基础路径设置为了 classpath 的根，
		// 可以将 sql 文件放在 maven 项目下的 resources 之下， 编译器会自动将其编译至 classpath 之下，该路径可按喜好自由设置。
		arp.setBaseSqlTemplatePath(PathKit.getRootClassPath());
		arp.addSqlTemplate("demo.sql");
		//添加外部 sql 模板文件，可以通过多次调用 addSqlTemplate 来添加任意多个外部 sql 文件，
		// 并且对于不同的 ActiveRecordPlugin 对象都是彼 此独立配置的，有利于多数据源下对 sql 进行模块化管理。


		// 所有映射在 MappingKit 中自动化搞定
		_MappingKit.mapping(arp);
		me.add(arp);
	}
	
	public static DruidPlugin createDruidPlugin() {
		return new DruidPlugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password").trim());
	}
	
	/**
	 * 配置全局拦截器
	 */
	public void configInterceptor(Interceptors me) {
		
	}
	
	/**
	 * 配置处理器
	 */
	public void configHandler(Handlers me) {
		
	}
}
