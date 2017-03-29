package com.full.helloshangeeth;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HelloShangeethServeltServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		Calendar calendar = new GregorianCalendar();
		Date date = calendar.getTime();
		int hours = calendar.get(Calendar.HOUR_OF_DAY);
		String greeting = "";
		if (hours > 11) {
			greeting = "Mathiya";
		} else {
			greeting = "Kaalai";
		}
		
		greeting += " Vanakam";
		String responseString = "<font color=\"lightgreen\">The Current Time is " + date.toString() + "</font><br/><b>"
				+ greeting + "</b>";
		resp.getWriter().println(responseString);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String name = req.getParameter("name");
		String mobilenumber = req.getParameter("mobilenumber");

		resp.getWriter().print("Name: " + name + "and Mobile Number" + mobilenumber + "added Successfully");
	}

}
