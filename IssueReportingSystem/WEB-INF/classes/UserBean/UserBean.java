package UserBean;

import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

public class user extends HashMap<String, Integer> implements java.io.Serializable 
{
   // Constructor
   
   public User()
   {
      super();
	  
   }
   
   
  public int issue(String reportedIssue, int issueNo) 
  {

	}
	
	
  public Iterator<String> getIssue() 
  {
		return keySet().iterator();
	}


	public int getIssueNo(String reportedIssue) 
	{
		return get(reportedIssue);
	}

}