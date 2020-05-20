package final_project_Testcases_Phase2;

import java.util.HashMap;
public class PrintKeyVal3 {

	public static void main(String[] args) {
		 HashMap<String, Integer> example = new HashMap<>();
	        example.put("A", 1);
	        example.put("B", 2);
	        example.put("C", 3);
	        example.put("D", 4);
	        example.put("E", 5);
	        example.forEach((key, value) -> System.out.println(key + " -> " + value));

	}

}
