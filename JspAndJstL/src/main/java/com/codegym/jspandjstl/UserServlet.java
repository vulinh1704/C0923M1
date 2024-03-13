package com.codegym.jspandjstl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UserServlet" , value = "/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = "C09";
        String[] names = {"A", "B", "C"};
        Product product = new Product(1, "Cake");
        RequestDispatcher dispatcher = req.getRequestDispatcher("hello.jsp");
        req.setAttribute("name", name);
        req.setAttribute("names", names);
        req.setAttribute("product", product);
        dispatcher.forward(req, resp);
    }
}
