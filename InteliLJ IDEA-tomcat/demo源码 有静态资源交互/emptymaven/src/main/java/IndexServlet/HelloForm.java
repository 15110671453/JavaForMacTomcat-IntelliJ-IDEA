package IndexServlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

public class HelloForm extends HttpServlet {

    private static final  long serialVersionUID = 1L;

    public  HelloForm() {

        super();
        //构造器 类
    }

    public void  doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException,IOException{


        //为名字和姓氏创建 Cookie

        Cookie name = new Cookie("name", URLEncoder.encode(request.getParameter("name"),"UTF-8"));


        Cookie url = new Cookie("url",request.getParameter("url"));

        //为两个Cookie 设置过期日期 为 24 小时 后

        name.setMaxAge(60*60*24);

        url.setMaxAge(60*60*24);


        //在响应头 添加两个Cookie


        response.addCookie(name);

        response.addCookie(url);


        //设置响应内容类型


        response.setContentType("text/html;charset=UTF-8");


        PrintWriter out = response.getWriter();

        String title = "设置Cookie实例";


        String docType = "<!DOCTYPE html>\n";

        String urlS=request.getParameter("url");

        String nameS= request.getParameter("name");

        out.println(docType+"<html>\n"+"<head><title>"+title+"</title></head>\n"+"<body bgcolor=\"#f0f0f0\">\n"+"<h1 align=\"center\">" + title + "</h1>\n"+ "<ul>\n"+
                "<li><b>Servlet站点名:</b>:" + nameS + "\n</li>" + "<li><b>Servlet站点URL:</b>:" + urlS + "\n</li>" + "</ul>\n"+"</body></html>");


    }


    protected  void  doPost(HttpServletRequest request,HttpServletResponse response) throws  ServletException,IOException
    {

        doGet(request,response);
    }
}
