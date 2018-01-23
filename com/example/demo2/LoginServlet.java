package com.example.demo2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Description:
 *处理用户登录
 * @author Administrator
 * @date 2017-12-13
 */
public class LoginServlet extends HttpServlet {

    @Override

    protected void doGet( HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        OutputStream out = resp.getOutputStream();

        String username = req.getParameter("username");

        String password = req.getParameter("password");

//        String validationCode = req.getParameter("validationCode");

        HttpSession session = req.getSession();

        String validationCodeTemp = (String)session.getAttribute("validationCodeTemp");

//        if(validationCode.equalsIgnoreCase(validationCodeTemp)){
//
//            System.out.println("验证码正确");
//
//        }else{
//
//            System.out.println("验证码错误");
//
//        }

        //用户名密码校验

        MySQLServer mss = new MySQLServer();

        String result = mss.checkUser(username,password);

        if (result.equals("hasUserNameAndPasswordCorrect")) {

            System.out.println("用户名和密码均正确");

        } else if (result.equals("hasUserNameButPasswordInCorrect")) {

            System.out.println("用户名正确,密码不正确");

        } else if (result.equals("hasNoUserName")) {

            System.out.println("没有此用户");

        }
        //转发到result.jsp

        RequestDispatcher rd = req.getRequestDispatcher("Login.html");

        rd.forward(req, resp);

    }

    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doGet(req,resp);

    }

}