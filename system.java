// Filename: system.java
// Author: Luke Watt
// Programmers: Luke Watt, Ruan Swart, Da Yuan
// Date Started: 3/6/2019
// Assignment 3

// We may need the date functions for server logs
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import UserBean.User;

// This is just here incase we need it for testing
// @WebServlet(urlPatterns = {"/server"})  

public class system extends HttpServlet
{
// Constructor ----------------------------------

   
// DoGet Block -------------------------------------------------------------------------------------------------

   public void doGet(HttpServletRequest request, HttpServletResponse response)   
      throws ServletException, IOException
	  {


	  }		 
	  
// DoPost Block -------------------------------------------------------------------------------------------------

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException 
	   { 


     }	  
}