package controller.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.PositionService;
import service.PositionServiceImpl;
import utils.SessionUtil;

@WebServlet(urlPatterns = { "/login", "/checklogin", "/logout" })
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static PositionService positionService;
	static {
		positionService = new PositionServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		String message = request.getParameter("message");
		String alert = request.getParameter("alert");
		if(action != null && "login".equals(action)) {
			RequestDispatcher rd = request.getRequestDispatcher("views/login.jsp");
			rd.forward(request, response);
		}
		if(message != null && alert != null) {
			request.setAttribute("message", "login fail password username invalid");
			request.setAttribute("alert", alert);
			RequestDispatcher rd = request.getRequestDispatcher("views/login.jsp");
			rd.forward(request, response);
		}
		
		if (action != null && "logout".equals(action)) {
			SessionUtil.getInstance().removeValue(request, "userName");
			RequestDispatcher rd = request.getRequestDispatcher("views/login.jsp");
			rd.forward(request, response);
		}

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String action	=	request.getParameter("action");
		RequestDispatcher rd;
		if(action != null && action == "login") {
	 rd = request.getRequestDispatcher("views/login.jsp");
			rd.forward(request, response);
		}
	if(positionService.checkLogin(userName, password)) {
		SessionUtil.getInstance().putValue(request, "userName", userName);
	
		response.sendRedirect(request.getContextPath()+"/views/admin/home.jsp");
	}
	else {
		response.sendRedirect(request.getContextPath()+"/login?action=login&message=fail&alert=danger");
		
	}
	
	
		
	}

}
