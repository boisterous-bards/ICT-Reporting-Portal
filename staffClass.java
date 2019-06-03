// Filename: staffClass.Java
// Author: Luke Watt
// Programmers: Luke Watt, Ruan Swart, Da Yuan
// Date Started: 3/6/2019
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

// Sets our URL ----- NOTE: THIS NEEDS TO BE CHANGED TO THE SPECIFIED URL BY THE CUSTOMER
@WebServlet(urlPatterns = {"/staffportal"})

public class staffClass extends HttpServlet
{
   // Constructor ----------------------------------
   private String person = "NewStaffMember"; 
   private int triggerOffer, sessionLoaded = 0; 
   private String username = person + ".ser";
   
// DoGet Block -------------------------------------------------------------------------------------------------

   public void doGet(HttpServletRequest request, HttpServletResponse response)   
      throws ServletException, IOException
	  {
       // Initiates starting page
       RequestDispatcher dispatcher;
	   
	                      // The homepage shall be entered here
       dispatcher = request.getRequestDispatcher("WEB-INF/JSP/StaffHomePage.jsp"); 
       dispatcher.forward(request, response); 
	  }		 
	  
// DoPost Block -------------------------------------------------------------------------------------------------

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws ServletException, IOException 
	   { 
        // Initiates the user class and session
        HttpSession session = request.getSession();         
        Person person = (Person) session.getAttribute("person");

        // Creates a new person object if there is nothing in the class
        if (person == null)
        {
           person = new Person();
        }

        // Assigns the current session to the user class
        session.setAttribute("person", person);

        // initiates our input stream for the serialised user file
        FileInputStream inputFile;
        ObjectInputStream in;

     // Try/Catch for our input stream.
     try 
     { 
	 
     // Serialisation system -----------------------------------
     RequestDispatcher dispatcher;

        if (request.getParameterMap().containsKey("staffMemberLoaded"))
        {
        
           person = request.getParameter("staffMemberLoaded");
           username = person + ".ser";

           System.out.println(person + " Found");
		   
		   // NEED TO CREATE IF/ELSE FOR PERSON NOT FOUND ERROR

           inputFile = new FileInputStream(username);
           in = new ObjectInputStream(inputFile);

           person = (Person) in.readObject();
           session.setAttribute("person", person);

        }
        else
        {
            System.out.println("In current session of: " + person); 
        }
           
// JSP Page Redirector Logic Block ------------------------------------------------------------------------------------
			
            if (user.logout()) 
            {
               // Goes to logout page
               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/Logout.jsp");  
            }
            else if (request.getParameterMap().containsKey("LoginStaff"))  
            {           
               // Goes to the Staff Login Page
               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/LoginAsStaff.jsp");  
            }
            else if (request.getParameterMap().containsKey("StaffMainMenu")) 
            {
               // Goes to the Register Page
               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/StaffMainMenu.jsp");
            }     
            else if (request.getParameterMap().containsKey("IssueIndex")) 
            {
               // Goes to the Issue Page
               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/IssueIndex.jsp");
            }         
            else if (request.getParameterMap().containsKey("Issue")) 
            {
               // Goes to the Issue Page
               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/Issue.jsp");
            }         
            else if (request.getParameterMap().containsKey("ArticleIndex")) 
            {
               // Goes to the Article Page
               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/ArticleIndex.jsp");
            }         		
            else if (request.getParameterMap().containsKey("Article")) 
            {
               // Goes to the Article Page
               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/Article.jsp");
            }           	        			
            else if (request.getParameterMap().containsKey("KnowledgeBaseArticle")) 
            {
               // Goes to Saving Page
               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/KnowledgeBaseArticle.jsp");
            } 
            else if (request.getParameterMap().containsKey("MarkIssue")) 
            {
               // Goes to Saving Page
               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/MarkIssue.jsp");
            } 
            else if (request.getParameterMap().containsKey("saveSession")) // NOTE: I may make this automatic
            {
               // Gets the entered username parameter and sets it to username
               person = request.getParameter("saveSession");
               username = person + ".ser";

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
               dispatcher = request.getRequestDispatcher("WEB-INF/JSP/...................jsp");  
            }

// --------------------------------------------------------------------------------------------------------------------

            dispatcher.forward(request, response); 
      }
      catch(ClassNotFoundException e)
      {
         System.out.println("Exception");

         // NOTE: THIS NEEDS A REDIRECT FUNCTION TO THE ERROR PAGE
      }

     }	  
}