package flower_shop.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import flower_shop.service.TransactionService;
import flower_shop.service.impl.TransactionServicesImpl;


public class OrderDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TransactionService transactionService =  new TransactionServicesImpl();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		transactionService.delete(id);
		resp.sendRedirect(req.getContextPath() + "/admin/order/list");
	}
}
