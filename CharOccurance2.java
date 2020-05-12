package final_project_Testcases_Phase2;

public class CharOccurance2 {

	public static void main(String[] args) {
		String text ="You have no choice other than following me!";
		int count=0;
		for (int j=0;j<text.length();j++) {
			if(text.charAt(j)=='o') {
				count=count+1;
			}
		}
		System.out.println("ocuurance of 'o':"+count);

	}

}
