package hacker_rank_codes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestQuantifiers
{
     public static void main(String args[])
     {
//    	 Pattern p=Pattern.compile("a");
//    	 Pattern p=Pattern.compile("a+");
//    	 Pattern p=Pattern.compile("a*");
    	 Pattern p=Pattern.compile("a?");
    	 Matcher m=p.matcher("ababaaabaaaabaaabba");
    	 while(m.find()) {
    		 System.out.println(m.group()+" "+m.start());
    	 }
     }	
}
