package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class authenticationFilter
 */
@WebFilter("/authenticationFilter")
public class authenticationFilter implements Filter {
	
	public void init(FilterConfig argo) throws ServletException {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String password = request.getParameter("password");
		
		if (password.equals("Filter")) {
			chain.doFilter(request, response);
		} else {
			
//			RequestDispatcher rd = request.getRequestDispatcher("index.html");
//			rd.include(request, response);
			out.print("Username or Password is wrong");
			
//			response.setContentType("text/html");
//			PrintWriter out = response.getWriter();
//			out.print("welcome filter");
			
		}
		
	}

	@Override
	public void destroy() {
	}
	
}
