import java.sql.*;
class GreenlightTest
{
   public static void main(String[] args)
   {		
	  String myURL = new String ("http://example.com/");
	  String user = "akoert";
	  String password = "12345";
	  boolean TEST = true;
	   
	  try {
		  if (TEST == true) {
		  DriverManager.getConnection(myURL, user, password);
		  }
	  }
		  //print exception message that includes exception message and configuration file location 
		  catch (Exception $e) {
		  System.out.println ("Caught exception: ");
		  System.out.println ("Check credentials in config file at:");
		  }
   }
}
