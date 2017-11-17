package IndexServlet;

import org.omg.CORBA.Request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class ForwardServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
    {

        String destination = request.getParameter("destination");

        if ("file".equals(destination)){

            RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/web.xml");

            d.forward(request,response);
        }else if ("jsp".equals(destination)){

            request.setAttribute("date",new Date());

            RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/jsps/forward.jsp");

            dis.forward(request,response);
        }else if ("jsp2".equals(destination)){

            request.setAttribute("date",new Date());

            RequestDispatcher dis = request.getRequestDispatcher("/jsps/forward.jsp");

            dis.forward(request,response);
        }

        else if ("servlet".equals(destination)){

            RequestDispatcher dispatcher=request.getRequestDispatcher("/Basic/basic1.php");

            dispatcher.forward(request,response);

        }else if ("html".equals(destination))
            {
                RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/htmls/hello.html");

                dispatcher.forward(request,response);
            }else if ("html2".equals(destination))
        {
            RequestDispatcher dispatcher=request.getRequestDispatcher("/htmls/hello.html");

            dispatcher.forward(request,response);
        }
        else
        {
            response.setCharacterEncoding("UTF-8");

            response.getWriter().println("缺少参数.用法:"+request.getRequestURL()+"?destination=jsp或者file或者servlet或者html");
        }

    }
}
