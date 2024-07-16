package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Customer;
import services.CustomerService;

import java.io.IOException;

import javax.servlet.RequestDispatcher;

@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public update() {
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
		service.updateCustomer(cus);
		
		jakarta.servlet.RequestDispatcher dispatcher =  request.getRequestDispatcher("profile.jsp");
		
		
		dispatcher.forward(request, response);
	}

}
