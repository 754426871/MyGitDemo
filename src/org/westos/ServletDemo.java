package org.westos;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletDemo")
public class ServletDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("hahaha");
        System.out.println("nihao");
        System.out.println("hahaha");
        System.out.println("nihao");
        System.out.println("hahaha");
        System.out.println("nihao");
        System.out.println("hahaha");
        System.out.println("nihao");System.out.println("hahaha");
        System.out.println("nihao");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
