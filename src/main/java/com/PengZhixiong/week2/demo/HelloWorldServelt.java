package com.PengZhixiong.week2.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServelt extends HttpServlet {

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("Hellow Client!!!");
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) {

    }

}

