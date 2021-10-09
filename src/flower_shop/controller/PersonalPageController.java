package flower_shop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import flower_shop.service.UserService;
import flower_shop.service.impl.UserServicesImpl;


@WebServlet("/PersonalPageController")
public class PersonalPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserService userService = new UserServicesImpl();
    
	
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	RequestDispatcher dispatcher = req.getRequestDispatcher("/view/client/personal-page.jsp");
		dispatcher.forward(req, resp);
		
    }
    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
}
}