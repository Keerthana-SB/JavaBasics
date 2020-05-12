package final_project_Testcases_Phase2;

public class Palindrome1 {

	public static void main(String[] args) {
		
			String text ="malayalam";
			StringBuffer strb=new StringBuffer(text);
			StringBuffer reverse = strb.reverse();
			String rev = reverse.toString();
			if(rev.equals(text)) {
				System.out.println("Yes, Palindrome");
			}
			else
			{
				System.out.println("No, Not a Palindrome");
		}

	}
	}

