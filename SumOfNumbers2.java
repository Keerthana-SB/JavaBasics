package final_project_Testcases_Phase2;

public class SumOfNumbers2 {
	public static void main(String[] args) {
	int sum=0;
	String str = "asdf1qwer9as8d7";
	for(int i=0; i<str.length(); i++) {
	    char temp = str.charAt(i);
	    if (Character.isDigit(temp)) {
	        int b = Integer.parseInt(String.valueOf(temp));
	        sum=sum+b;
	    }
	}
	System.out.println("Sum of numbers:"+sum);
}
}
