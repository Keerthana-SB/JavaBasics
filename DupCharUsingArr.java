package final_project_Testcases_Phase2;

public class DupCharUsingArr {
	public static void main(String argu[]) {

		  String str = "When life gives you lemons, make lemonade";
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		    System.out.println(inp[j]+" ");
		     break;
		    }
		   }
		  }
		 }
}
