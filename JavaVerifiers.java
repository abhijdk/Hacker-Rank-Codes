package hacker_rank_codes;
import java.util.*;
import java.util.regex.*;
public class JavaVerifiers{
	public static void main(String ...strin) {
		System.out.println("Enter A String According to Terms&Condition:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Pattern p=Pattern.compile("[a-m][0369][a-zA-Z0-9_.]*[#|&]");
		Matcher m=p.matcher(str);
		if(m.matches()) {
			System.out.println("String is Match according to terms&Condition");
		}else
			System.out.println("String is not Match according to terms&Condition");
		sc.close();
	}
}
