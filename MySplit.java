//We can use Pattern class split() method to split the given target string according to the given pattern.
package hacker_rank_codes;

import java.util.regex.Pattern;

public class MySplit{
	public static void main(String ...a) {
		Pattern p=Pattern.compile("\\s");
		String s[]=p.split("OMM DRANG OMM");
		for(String s1:s) {
			System.out.println(s1);
		}
	}
}
