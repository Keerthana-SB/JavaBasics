package final_project_Testcases_Phase2;

import java.util.HashMap;
public class PrintKeyVal4 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.keySet().forEach((eachKey) -> System.out.println(eachKey+ "->"+map.get(eachKey)));

	}

}
