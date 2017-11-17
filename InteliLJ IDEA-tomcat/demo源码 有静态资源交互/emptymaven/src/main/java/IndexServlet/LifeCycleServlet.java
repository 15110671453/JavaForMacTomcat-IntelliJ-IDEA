package IndexServlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LifeCycleServlet  extends HttpServlet{

    private  static  double startpoint = 0;

    @Override
    public  void init() throws ServletException
    {

        this.log("执行 init 方法");

        ServletConfig conf = this.getServletConfig();

        startpoint =Double.parseDouble(conf.getInitParameter("startpoint"));

    }

    @Override

    public void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException,IOException
    {

        this.log("执行 service  方法");

        super.service(arg0,arg1);
    }


    @Override

    public void doGet(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException,IOException {
            this.log("执行 doget 方法");
    }

    @Override

    public void doPost(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException,IOException {

        this.log("执行 dopost方法");
    }

    @Override

    public  void  destroy(){

        this.log("执行 destroy 方法");
    }
}
