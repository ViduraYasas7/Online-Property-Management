package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Customer;
import services.CustomerService;
import utils.DBConnect;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;

@WebServlet("/deleteCustomer")
public class deleteCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public deleteCustomer() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Customer cus=new Customer();
		cus.setEmail(request.getParameter("email"));
		
		CustomerService service = new CustomerService();
		boolean value = service.deleteCustomer(cus); 
		if(value) {
			ArrayList<Customer>customer = service.getAllCustomer();
			
			request.setAttribute("customer", customer);
			System.out.println(customer+"customerArrayList");
			
			jakarta.servlet.RequestDispatcher dispatcher =  request.getRequestDispatcher("admin.jsp");
			dispatcher.forward(request, response);
		}else {
			jakarta.servlet.RequestDispatcher dispatcher =  request.getRequestDispatcher("NewFile.jsp");
			dispatcher.forward(request, response);
		}
				
		
	}

}
