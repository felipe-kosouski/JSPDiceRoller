package br.edu.utfpr.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(
		urlPatterns = { "/login" },
		name = "LoginServlet",
		initParams = { 
				@WebInitParam(name = "user-servlet", value = "admin"), 
				@WebInitParam(name = "pwd-servlet", value = "123456")
		})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private String userDefault = null;
    private String pwdDefault = null;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	userDefault = config.getServletContext().getInitParameter("user");
    	pwdDefault = config.getServletContext().getInitParameter("pwd");
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("username");
		String pwd = request.getParameter("password");
		
		if (user.equals(userDefault) && pwd.equals(pwdDefault)) {
			HttpSession session = request.getSession();
			Boolean isLoggedIn = (Boolean) session.getAttribute("isLoggedIn");
			
			if (isLoggedIn == null) {
				session.setAttribute("loginDate", new Date());
				session.setAttribute("isLoggedIn", true);
				
				System.out.println("ta logado mizeravi");
				
				Cookie cookie = new Cookie("login-date", new Date().toString());
				response.addCookie(cookie);
			}
			
			request.getRequestDispatcher("/roll").forward(request, response);
		}else{
			response.sendRedirect("https://www.wizards.com/dnd/dice/dice.htm");
		}
		
	}

}
