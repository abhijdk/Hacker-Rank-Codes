package hacker_rank_codes;
import java.util.*;
import java.util.regex.*;

public class EmailValidation{
	public static void main(String ...stri) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Email id: ");
		String email=sc.nextLine();
		Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.a-zA-Z0-9]+)+");
		Matcher m=p.matcher(email);
		if(m.matches()) {
			System.out.println("Valid");
		}else {
			System.out.println("InValid");
		}
	}
}
