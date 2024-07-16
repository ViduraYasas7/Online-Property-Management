package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Customer;
import services.CustomerService;

import java.io.IOException;
import java.util.ArrayList;



@WebServlet("/admin")
public class admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public admin() {
        super();
       
    }

     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside Admin");
		CustomerService service = new CustomerService();
		ArrayList<Customer>customer = service.getAllCustomer();
		
		
		request.setAttribute("customer", customer);
		
		jakarta.servlet.RequestDispatcher dispatcher =  request.getRequestDispatcher("customerinfo.jsp");
		dispatcher.forward(request, response);
	}

}
