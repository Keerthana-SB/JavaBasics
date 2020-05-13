package final_project_Testcases_Phase2;

public class Sumofnumber1 {
	public int sumOfDigits(String stng) 
	{
	  int l = stng.length();
	  int sum = 0;
	  for (int i = 0; i < l; i++) 
	  {
	    if (Character.isDigit(stng.charAt(i))) 
		{
	      String tmp = stng.substring(i,i+1);
	      sum += Integer.parseInt(tmp);
	    }
	  }
	  return sum;
	}
	
	public static void main(String[] args) {
		
		Sumofnumber1 m= new Sumofnumber1();
	      String str1 =  "asdf1qwer9as8d7";
	      System.out.println("The given string is: "+str1);
	      System.out.println("The sum of the digits in the string is: "+m.sumOfDigits(str1));
	}

}
