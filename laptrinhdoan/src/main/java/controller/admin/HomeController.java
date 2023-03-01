package controller.admin;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static dao.AbstractHibernateDao.*;
import service.AdminService;
import service.AdminServiceImpl;

@WebServlet(urlPatterns = { "/admin-register-Inspector", "/admin-views", "/admin-update", "/admin-new" })
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static AdminService adminService;
	static {
		adminService = new AdminServiceImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		if (req.getParameter("action").equals("view")) {

			req.setAttribute("listInspect", adminService.getAllInspect());
			RequestDispatcher rd = req.getRequestDispatcher("/views/admin/view.jsp");
			rd.forward(req, resp);
			
		}
		
		else if (req.getParameter("action").equals("addInspect")) {

			RequestDispatcher rd = req.getRequestDispatcher("/views/admin/add.jsp");
			rd.forward(req, resp);
			
		} 
		
		else if (req.getParameter("action").equals("delete")) {
			
			String id = req.getParameter("inspectId");
			adminService.deleteInspect(id);
			req.setAttribute("listInspect", adminService.getAllInspect());
			RequestDispatcher rd = req.getRequestDispatcher("/views/admin/view.jsp");
			rd.forward(req, resp);
			
		}
		
		else if (req.getParameter("action").equals("edit")) {
			
			String id = req.getParameter("inspectId");
			req.setAttribute("inspect", adminService.getInspect(id));
			RequestDispatcher rd = req.getRequestDispatcher("/views/admin/viewInspect.jsp");
			rd.forward(req, resp);
			
		} 
		
		else if (req.getParameter("action").equals("update")) {
		
			String id = req.getParameter("inspectId");
			
			String name = req.getParameter("name");
		     convert(name);
			int phone = Integer.parseInt(req.getParameter("phone"));
			String address = req.getParameter("address");
			convert(address);
			adminService.updateInspect(name, phone, address, id);
			RequestDispatcher rd = req.getRequestDispatcher("/views/admin/viewInspect.jsp");
			
		}
//		if (req.getParameter("idInspect") != null) {
//
//			String name = req.getParameter("name");
//
//			int phone = Integer.parseInt(req.getParameter("phone"));
//			String address = req.getParameter("address");
//
//			adminService.updateInspect(name, phone, address, "tt");
//
//		} else {
//			RequestDispatcher rd = req.getRequestDispatcher("views/login.jsp");
//			rd.forward(req, resp);
//		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getParameter("username") != null) {
			String userName = req.getParameter("username");
			
			String password = req.getParameter("password");
			
			String name = convert(req.getParameter("name"));
			
			int phone = Integer.parseInt(req.getParameter("phone"));
			String address = req.getParameter("address");
		

			System.out.println(userName + password + name + phone + address);

			adminService.addPosition(userName, password, name, phone, address);
			RequestDispatcher rd = req.getRequestDispatcher("/views/admin/home.jsp");
			rd.forward(req, resp);
		}

	}

}
