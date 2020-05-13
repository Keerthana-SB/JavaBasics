package final_project_Testcases_Phase2;

public class NumberOfCases1 {

	public static void main(String[] args) {
       String text ="1.It is Work from Home not Work for Home";
		
		char[]ch = text.toCharArray();
		for (int i=0;i<ch.length;i++) {
		int	count=0;
				for(int j=0;j<ch.length;j++)
				{
				if(ch[i]==ch[j]) {
					count++;
				}
				
				}
				System.out.println(text.charAt(i) +" : "+ count);
			}
	}

}
