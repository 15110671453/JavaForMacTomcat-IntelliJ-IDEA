package com.demo.common.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("blog", "id", Blog.class);
		arp.addMapping("t_AServerList", "SN", AServerList.class);
		arp.addMapping("t_AServerRoutes", "appeui", AServerRoutes.class);
		arp.addMapping("t_JiZhanXinTiao", "EUI", JiZhanXinTiao.class);
		arp.addMapping("t_NSServerPara", "SN", NSServerPara.class);
		arp.addMapping("t_NServerList", "SN", NServerList.class);
		arp.addMapping("t_NServerRoutes", "appeui", NServerRoutes.class);
		arp.addMapping("t_dimmenu", "MenuID", Dimmenu.class);
		arp.addMapping("t_dimuser", "UserID", Dimuser.class);
		arp.addMapping("t_jizhanlist", "EUI", Jizhanlist.class);
		arp.addMapping("t_jizhanpara", "EUI", Jizhanpara.class);
	}
}

