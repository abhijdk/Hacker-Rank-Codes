package hacker_rank_codes;
import java.util.regex.*;

public class PatternMachingAppliations{
	public static void  main(String ...a) {
		Pattern p=Pattern.compile("[abcO]");
		Matcher m=p.matcher("Omm Drang Omm");
		while(m.find()) {
			System.out.println(m.group()+" avalable in "+m.start()+" index position");
		}
	}
}
