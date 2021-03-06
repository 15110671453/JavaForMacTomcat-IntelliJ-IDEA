package IndexServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ServletBasic1 extends HttpServlet {

    //处理Get方法 请求的方法

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException

    {


        //设置刷新自动加载时间为5 秒

        response.setIntHeader("Refresh" ,5);

        //设置响应内容类型

        response.setContentType("text/html;charset=UTF-8");

        //使用默认时区和语言环境获得一个日历

        Calendar cale = Calendar.getInstance();

        //将Calendar 类型 转换成Date类型


        Date tasktime = cale.getTime();


        //设置日期输出的格式

        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //格式输出

        String nowTime = df.format(tasktime);


        PrintWriter out = response.getWriter();

        String title = "自动刷新 Header 设置 - 菜鸟教程实例";

        String docType = "<!DOCTYPE html>\n";




        out.println(docType + "<html>\n"+"<head><title>"+title+"</title></head>\n"+"<body bgcolor=\"#f0f0f0\">\n"+
        "<h1 align=\"center\">"+title+"</h1>\n"+"<p>当前时间是:"+nowTime+"</p>\n"


        );




    }


    //处理POST 方法请求的方法

    public  void  doPost(HttpServletRequest request,HttpServletResponse response) throws  ServletException,IOException
    {
        doGet(request,response);

    }


}
