package hacker_rank_codes;
import java.util.regex.*;

public class PatternMachingAppliation_WithPredefindClass{
	public static void  main(String ...a) {
//		Pattern p=Pattern.compile("[\\s]");
//		Pattern p=Pattern.compile("[\\S]");
//		Pattern p=Pattern.compile("[\\d]");
//		Pattern p=Pattern.compile("[\\D]");
//		Pattern p=Pattern.compile("[\\w]");
//		Pattern p=Pattern.compile("[\\W]");
		Pattern p=Pattern.compile("[\\.]");
		Matcher m=p.matcher("Omm Drang Omm @ Datta Guru. 123");
		while(m.find()) {
			System.out.println(m.start()+" "+m.group());
		}
	}
}
