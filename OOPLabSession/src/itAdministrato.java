import java.util.Random;

public class itAdministrato {
	String generatedEmail = "";
	String generatedPassword = "";
	String name = "";
	String lastName = "";
	  int length = 6;
		char[] password = new char[length ];
	public void generateEmailAddress(String name, String lastName, String department) {
		name = name;
		lastName = lastName;
		
		generatedEmail = name+lastName+"@"+department.toLowerCase() + ".abc.com";
		
		
	}
	
	public void generatePassword() {
		      String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		      String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
		      String specialChar = "!@#$";
		      String numbers = "1234567890";
		      String passwordChars = capitalLetters + lowerLetters + specialChar + numbers;
		      Random random = new Random();
		    

		      password[0] = lowerLetters.charAt(random.nextInt(lowerLetters.length()));
		      password[1] = capitalLetters.charAt(random.nextInt(capitalLetters.length()));
		      password[2] = specialChar.charAt(random.nextInt(specialChar.length()));
		      password[3] = numbers.charAt(random.nextInt(numbers.length()));
		   
		      for(int i = 1; i< 2 ; i++) {
		         password[i] = passwordChars.charAt(random.nextInt(passwordChars.length()));
		      }
		      
		   
		      
	}
	
	public void showCredentials() {
		
		System.out.println("Dear " + name +" " + lastName  + " your generated credentials are as follows");
		System.out.println("Email --> " + generatedEmail);
		System.out.println("Password --> " + password);
		
	}

}
