package final_project_Testcases_Phase2;

import java.util.ArrayList;
import java.util.List;

public class DupCharUsingArr2 {
	public static void main(String argu[]) {

		List<Character> lst = new ArrayList<Character>();
		String str = "When life gives you lemons, make lemonade";
		for (int i = 0; i < str.length(); i++) {
			if(!lst.contains(str.charAt(i))) {
				lst.add(str.charAt(i));
			}
			else {
				System.out.print(str.charAt(i)+",");
			}
		}
	}
}
