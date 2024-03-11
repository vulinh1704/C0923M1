package com.codegym.demoweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="demo", value = "/home")
public class Demo extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter printWriter = response.getWriter();
        response.setContentType("text/html");
        printWriter.write("<form action=\"/home\" method=\"post\">\n" +
                "    <input type=\"text\" name=\"name\">\n" +
                "    <button>Submit</button>\n" +
                "</form>");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        PrintWriter printWriter = resp.getWriter();
        resp.setContentType("text/html");
        printWriter.write("<h1>" + name + "</h1>");
    }
}

// để nhảy vào doGet (pt get): nhập trên URL, nhấn vào thẻ a, gửi form theo method GET
// để nhảy vào doPost (pt post): gửi form theo mothod POST.
