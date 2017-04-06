package com.full.webapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.apphosting.utils.config.ClientDeployYamlMaker.Request;

@SuppressWarnings("serial")
public class PosNegWebServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		Integer num1 = Integer.parseInt(req.getParameter("number1"));
		Integer num2 = Integer.parseInt(req.getParameter("number2"));
		Boolean bool = Boolean.parseBoolean(req.getParameter("posOrNeg"));

		boolean result = PosNeg.posNeg(num1, num2, bool);

		String output = "";
		if (result) {
			output = "True";
		} else {
			output = "false";
		}
		resp.getWriter().println(output);
	}
}
