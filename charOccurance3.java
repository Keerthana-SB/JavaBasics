package final_project_Testcases_Phase2;

public class charOccurance3 {
	public static void main(String[] args) {
		String text ="You have no choice other than following me!";
		String replaceStr=text.replaceAll("[^o]", "");
		System.out.println("Occurance of o: "+replaceStr.length());
	}
}
