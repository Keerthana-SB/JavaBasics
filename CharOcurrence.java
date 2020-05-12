package final_project_Testcases_Phase2;

public class CharOcurrence {

	public static void main(String[] args) {
        String text ="You have no choice other than following me!";
		char[] charArray = text.toCharArray();
		int count=0;
		for (int i=0;i<charArray.length;i++) {
			if(charArray[i]=='o') {
				count=count+1;
			}
		}
		System.out.println("The Occurance of 'o' is "+count );
		
		
}
}