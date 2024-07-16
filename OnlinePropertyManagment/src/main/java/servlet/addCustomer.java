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

@WebServlet("/addCustomer")
public class addCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public addCustomer() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Customer cus=new Customer();
		cus.setFirst_name(request.getParameter("Firstname"));
		cus.setLast_name(request.getParameter("Lastname"));
		cus.setEmail(request.getParameter("email"));
		cus.setUsername(request.getParameter("user"));
		cus.setPassword(request.getParameter("Epwd"));
		cus.setRe_Enter_password(request.getParameter("Repwd"));
		CustomerService service = new CustomerService();
		boolean value = service.regCustomer(cus); 
		if(value) {
			ArrayList<String> arraylist = service.selectCustomer(cus);
			
			request.setAttribute("email", arraylist.get(0));
			request.setAttribute("username", arraylist.get(1));
			request.setAttribute("password", arraylist.get(2));
			request.setAttribute("reenterpassword", arraylist.get(3));
			request.setAttribute("firstname", arraylist.get(4));
			request.setAttribute("lastname", arraylist.get(5));

			jakarta.servlet.RequestDispatcher dispatcher =  request.getRequestDispatcher("profile.jsp");
			dispatcher.forward(request, response);
		}else {
			jakarta.servlet.RequestDispatcher dispatcher =  request.getRequestDispatcher("NewFile.jsp");
			dispatcher.forward(request, response);
		}
				
		
	}

}
