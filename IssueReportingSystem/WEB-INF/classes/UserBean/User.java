package UserBean;

import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

public class User extends HashMap<String, Integer> implements java.io.Serializable 
{
   // Constructor
   
   public User()
   {
      super();
	  
   }
   
   
  public int issue(String reportedIssue, int issueNo) 
  {
    return 0;
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