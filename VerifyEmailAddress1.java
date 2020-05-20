package final_project_Testcases_Phase2;

import java.util.regex.Pattern;

public class VerifyEmailAddress1 {

	public static boolean isValid(String email) 
    { 
        String emailRegex = "[a-zA-Z0-9._]+[a-z0-9]+.[a-z.] {2,}"; 
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
	public static void main(String[] args) {
		String email = "balaji.chandrasekaran@testleaf.com"; 
        if (isValid(email)) 
            System.out.print("True"); 
        else
            System.out.print("False"); 
	}

}
