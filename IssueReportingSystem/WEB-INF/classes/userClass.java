// Filename: userClass.Java
// Author: Luke Watt
// Programmers: Luke Watt, Ruan Swart, Da Yuan
// Date Started: 30/5/2019
// Assignment 3

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
import configurator.Config;
import java.sql.*;
import java.sql.Connection;

// Sets our URL ----- NOTE: THIS NEEDS TO BE CHANGED TO THE SPECIFIED URL BY THE CUSTOMER
@WebServlet(urlPatterns = {"/ReportIssue"})

public class userClass extends HttpServlet
{
   // Constructor ----------------------------------
   private String newUser = "NewUser"; 
   private int triggerOffer, sessionLoaded = 0; 
   private String username = newUser + ".ser";
   
// DoGet Block -------------------------------------------------------------------------------------------------

   public void doGet(HttpServletRequest request, HttpServletResponse response)   
      throws ServletException, IOException
	  {
       // Initiates starting page
       RequestDispatcher dispatcher;
	   
	                      // The homepage shall be entered here
       dispatcher = request.getRequestDispatcher("WEB-INF/JSP/homepage.jsp");
       dispatcher.forward(request, response); 
	  }		 

// DoPost Block -------------------------------------------------------------------------------------------------

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException 
	   { 
        // Initiates the user class and session
        HttpSession session = request.getSession();         
        User user = (User) session.getAttribute("name");

        // Creates a new person object if there is nothing in the class
        if (user == null)
        {
           user = new User();
        }

        // Assigns the current session to the user class
        session.setAttribute("user", user);

        // initiates our input stream for the serialised user file
        FileInputStream inputFile;
        ObjectInputStream in;

     // Try/Catch for our input stream.
     try 
     { 

     // Serialisation system -----------------------------------
     RequestDispatcher dispatcher;

        if (request.getParameterMap().containsKey("name"))
        {
        
           username = request.getParameter("name");
           username = username + ".ser";

           System.out.println(username + " Found");

           inputFile = new FileInputStream(username);
           in = new ObjectInputStream(inputFile);

           user = (User) in.readObject();
           session.setAttribute("user", user);
        }
        else
        {
            System.out.println("In current session of: " + username); 
            dispatcher = request.getRequestDispatcher("WEB-INF/JSP/error.jsp");
        }
    
      // Establishes database connection
/*         Connection connection = Config.getConnection();
         Statement s = connection.createStatement();
         ResultSet rs = s.executeQuery("SELECT * FROM users");*/


// JSP Page Redirector Logic Block ------------------------------------------------------------------------------------
			
           if (request.getParameterMap().containsKey("MainMenu"))
           {       
/*              while (rs.next())
              {
                 if (request.getParameter("name").equals(rs.getString("username")))
                 {
                    if (request.getParameter("password").equals(rs.getString("password")))
                    {*/
                       // Goes to the Main Menu
                       dispatcher = request.getRequestDispatcher("WEB-INF/JSP/MainMenu.jsp");
/*                    }           
                 }
               }*/
            }
            else if (request.getParameterMap().containsKey("Login"))
            {           
               // Goes to the Login Page
               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/login.jsp");
            }
            else if (request.getParameterMap().containsKey("Register")) 
            {
               // Goes to the Register Page
               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/reg.jsp");
            }
            else if (request.getParameterMap().containsKey("ReportIssue")) 
            {
               // Goes to the Issue Reporting Page
               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/ReportIssue.jsp");
            }            
            else if (request.getParameterMap().containsKey("Issue")) 
            {
               // Goes to the Issue Page
               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/IssueCategoryPage.jsp");
            }         
            else if (request.getParameterMap().containsKey("Article")) 
            {
               // Goes to the Article Page
               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/ArticlePage.jsp");
            }         			
            else if (request.getParameterMap().containsKey("MyIssues")) 
            {
               // Goes to the MyIssues Page
               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/MyIssuesPage.jsp");
            }         			
            else if (request.getParameterMap().containsKey("MarkIssue")) 
            {
               // Goes to Saving Page
               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/MarkIssue.jsp");
            }         					
            else if (request.getParameterMap().containsKey("saveSession")) // NOTE: I may make this automatic
            {
               // Gets the entered username parameter and sets it to username
               username = request.getParameter("saveSession");
               username = username + ".ser";

               // Starts a new input stream to acquire the serialised person object
               // for the specified user
               FileOutputStream userFile = new FileOutputStream(username);
               ObjectOutputStream out = new ObjectOutputStream(userFile);

               out.writeObject(user);
     
               out.close(); 
               userFile.close(); 

               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/.jsp"); 
            }                     
            else
            {
               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/error.jsp");  
            }
      
// --------------------------------------------------------------------------------------------------------------------

            dispatcher.forward(request, response); 
      }
      catch(ClassNotFoundException e)
      {
         System.out.println("Exception");

       //  dispatcher = request.getRequestDispatcher("WEB-INF/JSP/error.jsp");

      //   dispatcher.forward(request, response); 
      }

     }	  
}
