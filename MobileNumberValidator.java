package hacker_rank_codes;

import java.util.*;
import java.util.regex.*;
public class MobileNumberValidator{
	public static void main(String ...stri) {
	  Scanner sc=new Scanner(System.in);
    System.out.print("Enter a MobileNumber");
    String number=sc.nextLine();
    Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
    Matcher m=p.matcher(number);
    if(m.matches())
      System.out.println("This is a vlid mobile Number");
    else
      System.out.println("This is not a vlid mobile Number");
	}
}
