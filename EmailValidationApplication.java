
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationApplication {
    static String [] dataBase= {"kaustubhnagvekar@gmail.com",
    		                    "akshu@gmail.com", 
    		                    "priyamishra@gmail.com",
    		                    "ankitapatil@gmail.com",
    		                    "kamini@nab.gov",
    		                    "akshay@nab.gov"};


	public static void main(String[] args) {
        System.out.println("This is an email vlaidation application");
        Scanner inp= new Scanner(System.in);
        String userID;
		while (true){
	     System.out.println("Enter your email-id ");
	     userID = inp.next();
	     while(ValEmail(userID))
	     {
		     System.out.println("You enterd a wrong email id or enetered in wrong format \n "
		     		+"Enter a correct email id in proper format eg:example@domain.xyz");
		     userID = inp.next();
	     }
	     
	     VerfiyID(userID);
	     
	     
	     System.out.println("");

		}
		
	}
	
	private static void VerfiyID(String ID)
	{
		boolean accessFlag= false;
	     for(String id : dataBase)
	     {
	    	 if(ID.equalsIgnoreCase(id))
	    	 {
	    		 accessFlag=true;
		    	 System.out.println("Email-id is validated "+ ID );
	    		 break;
	    	 }   	 
	    	 
	     }
	     
	     if(accessFlag==false)
	     {
	    	 System.out.println("Email-id does not validated "+ ID );
	    	 
	     }
			
		
	}
	
	private static boolean ValEmail(String ID)
	{
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(ID);

		if(!matcher.matches())
		{
			return true;
			
		}else 
		{
			return false;
			
		}
		
	}

}