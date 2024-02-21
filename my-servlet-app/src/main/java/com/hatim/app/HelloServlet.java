package com.hatim.app;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

<<<<<<< HEAD
public class HelloServlet extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
		String yourName = req.getParameter("your_name"); 
        out.write("<h1>Hi " + yourName + "!</h1>");

=======


public class HelloServlet  extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String yourName = req.getParameter("your_name");
		out.write("<h1>GOOD MORNING " + yourName + "!<h1>");
>>>>>>> 2b3a32b98d4749dc61529852da8d765a9a90f461
		out.close();
    }

}
