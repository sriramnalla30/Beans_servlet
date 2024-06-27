package com.jspbeans;

import com.jspbeans.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PersonServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));

        Person person = new Person();
        person.setName(name);
        person.setAge(age);

        request.setAttribute("person", person);

        request.getRequestDispatcher("person.jsp").forward(request, response);
    }
}
