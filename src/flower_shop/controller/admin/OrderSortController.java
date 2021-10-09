package flower_shop.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import flower_shop.model.Transactions;
import flower_shop.service.TransactionService;
import flower_shop.service.impl.TransactionServicesImpl;

@WebServlet("/OrderSortController")
public class OrderSortController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TransactionService transactionService = new TransactionServicesImpl();    
    
    public OrderSortController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
   	@Override 
   	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
   		List<Transactions> transactionList = transactionService.sort(); 
   		req.setAttribute("order", transactionList); 
   		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/admin/show-order.jsp"); 
   		dispatcher.forward(req, resp);
   		resp.sendRedirect(req.getContextPath() + "/view/admin/show-order/order-by");		
   	} 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
