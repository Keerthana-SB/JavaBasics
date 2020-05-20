package final_project_Testcases_Phase2;

import java.util.ArrayList;
import java.util.List;

public class PrintList2 {
	public static void main(String[] args) {
		String str = "Bugatti Chiron";
		List<Character> lst = new ArrayList<Character>();
		for(int i = 0; i < str.length();i++) {
			lst.add(str.charAt(i));
		}
		
		for (Character eachChar : lst) {
			System.out.print(eachChar);
		}
	}
}
