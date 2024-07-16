package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Customer;
import services.CustomerService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public login() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String admin = null;
		Customer cus=new Customer();
		cus.setEmail(request.getParameter("email"));
		cus.setPassword(request.getParameter("password"));
		
		CustomerService service = new CustomerService();
		boolean status = service.validate(cus);
		
		
		if(status) {
			ArrayList<String> arraylist = service.selectCustomer(cus);
			
			admin = arraylist.get(0).toString();
			request.setAttribute("email", arraylist.get(0));
			request.setAttribute("username", arraylist.get(1));
			request.setAttribute("password", arraylist.get(2));
			request.setAttribute("reenterpassword", arraylist.get(3));
			request.setAttribute("firstname", arraylist.get(4));
			request.setAttribute("lastname", arraylist.get(5));
			
			if(admin.equals("admin")) {
				
				jakarta.servlet.RequestDispatcher dispatcher =  request.getRequestDispatcher("admin.jsp");
				dispatcher.forward(request, response);
			}
			else {
				
				jakarta.servlet.RequestDispatcher dispatcher =  request.getRequestDispatcher("profile.jsp");
				dispatcher.forward(request, response);
			}
			
		}else {
		
			jakarta.servlet.RequestDispatcher dispatcher =  request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
		
		
	}

}
