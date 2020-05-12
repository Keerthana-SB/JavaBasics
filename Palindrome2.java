package final_project_Testcases_Phase2;

public class Palindrome2 {

	public static void main(String[] args) {
		String text ="malayalam";
		String rev="";
		for(int i=0;i<text.length();i++)
		{
			rev+=text.charAt(i);
		}
		System.out.println(text.equals(rev)?"Yes, Palindrome":"No, Not a palindrome");
	}

}
