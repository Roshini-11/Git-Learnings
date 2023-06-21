import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ButtonServlet
 */
@WebServlet("/ButtonServlet")
public class ButtonServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ButtonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String prefix = request.getParameter("prefix");
        String name = request.getParameter("uname");
        String gender = request.getParameter("gender");
        String[] intrst = request.getParameterValues("interests");
		for(String interest: intrst) {
				System.out.println(interest);
	    }
        String image = request.getParameter("image");
//        System.out.println(prefix+name+gender+image);
        request.setAttribute("prefix", prefix);
        request.setAttribute("name", name);
        request.setAttribute("gender", gender);
        request.setAttribute("inte", intrst);
        request.setAttribute("image", image);
        RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
        rd.forward(request, response);
    }

}

