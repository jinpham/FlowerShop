package flower_shop.controller;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import flower_shop.model.Product;
import flower_shop.model.Review;
import flower_shop.service.ProductService;
import flower_shop.service.ReviewService;
import flower_shop.service.impl.ProductServiceImpl;
import flower_shop.service.impl.ReviewServicesImpl;

import javax.servlet.http.HttpServletResponse;



public class HomeController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	ProductService productService = new ProductServiceImpl();
	ReviewService reviewService = new ReviewServicesImpl();
	DecimalFormat df = new DecimalFormat("#.000");
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Product> product_hoasinhnhat= productService.getProductById(1);
		req.setAttribute("product_hoasinhnhat", product_hoasinhnhat);	
		
		
		List<Product> product_hoacuoi= productService.getProductById(2);
		req.setAttribute("product_hoacuoi", product_hoacuoi);	
		
		
		List<Product> product_hoachucmung= productService.getProductById(3);
		req.setAttribute("product_hoachucmung", product_hoachucmung);	
		
	
		List<Product> product_hoachiabuon= productService.getProductById(4);
		req.setAttribute("product_hoachiabuon", product_hoachiabuon);	
		
		
		List<Product> product_new= productService.getProductById(5);
		req.setAttribute("product_new", product_new);	
				
	
		List<Product> product_banchay= productService.getProductById(6);
		req.setAttribute("product_banchay", product_banchay);	
		
		List<Product> productList = productService.getAll();
		req.setAttribute("productlist", productList);	

		List<Product> productsList1 = new ArrayList<Product>();
		for(Product product: productList)
		{
			Product product1 = productService.get(Integer.parseInt(product.getId()));
			product1.setPrice(String.valueOf(df.format(Double.parseDouble(product.getPrice()) * (1 - (Double.parseDouble(product.getDiscount())/100)))));
			productsList1.add(product1);
			
		}

		req.setAttribute("productlist1", productsList1);
		
		
		List<Product> product_sale= productService.getProductById(7);
		req.setAttribute("product_sale", product_sale);	
		
		List<Review> reviewList = reviewService.getAll();
		req.setAttribute("reviewlist", reviewList);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/client/index.jsp");
		dispatcher.forward(req, resp);
	}
}
