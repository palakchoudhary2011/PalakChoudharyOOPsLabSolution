import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

		
	public static void main(String args[]){
	// get name and surname from user
		
		//create scanner object 
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter First name : ");
		String name = obj.nextLine();  // Read user input
		
		System.out.println("Enter Surname : ");
		String lastName = obj.nextLine();
		
		// create object of class it administrator 
		itAdministrato administrator = new itAdministrato();
		
		
		  ArrayList<String> list = new ArrayList<String>();
	      list.add("Technical");
	      list.add("Admin");
	      list.add("Human Resource");
	      list.add("Legal");
	      
	      String[] myArray = new String[list.size()];
	      list.toArray(myArray);


    	  System.out.println("Select any of the following department : ");
    	  
	      for(int i=0; i<myArray.length; i++){
	         System.out.println(i+1 +"."+myArray[i]);
	      }
	      
	      
		// 
		
		System.out.println("Select department form following : ");
		int department = obj.nextInt();
		
		System.out.println("selected depratment : " + myArray[department - 1]);
		
		administrator.generateEmailAddress(name, lastName, myArray[department - 1]);
		administrator.generatePassword();
		administrator.showCredentials();
		
	}
}
