package final_project_Testcases_Phase2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verify_UserName {

	public static void main(String[] args) {
		String str = "Testleaf";
		String pattern = "[a-zA-Z0-9._$@]{8,}";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(str);
		System.out.println(matcher.matches());
	}

}
