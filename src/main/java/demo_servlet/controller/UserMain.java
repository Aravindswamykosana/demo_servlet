package demo_servlet.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import demo_servlet.dao.UserCrud;
import demo_servlet.dto.User;

@WebServlet("/save")
public class UserMain extends GenericServlet{

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		UserCrud crud=new UserCrud();
		 int id = Integer.parseInt(req.getParameter("id"));
		 String name = req.getParameter("name");
		 String email=req.getParameter("email");
		 String pwd=req.getParameter("pwd");
		 Double sal = Double.parseDouble(req.getParameter("sal"));
		 User user=new User(id,name,email,pwd,sal);
		 try {
			crud.save(user);
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, res);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			RequestDispatcher dispatcher = req.getRequestDispatcher("register.jsp");
			dispatcher.include(req, res);
			e.printStackTrace();
		}
	}

}
