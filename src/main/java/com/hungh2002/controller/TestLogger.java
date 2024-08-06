package com.hungh2002.controller;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/logger")
public class TestLogger extends HttpServlet {
    public Logger logger = LogManager.getLogger(TestLogger.class.getName());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        logger.error("GET request received");
        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().println("hello");
    }
}
