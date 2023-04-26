package com.example.demo;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.entity.Task;

@WebServlet(name = "TodoServlet", value = "/todo-servlet")
public class TodoServlet extends HttpServlet{
    public List<Task> list = new ArrayList<>();

    public void init() {
        list.add(new Task(1,"di hoc"));
        list.add(new Task(1,"di da bong"));
        list.add(new Task(1,"di dau cung duoc"));
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
