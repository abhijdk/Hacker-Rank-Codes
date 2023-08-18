
package hacker_rank_codes;
import java.io.*;
import java.util.regex.*;

public class ToFinddotJavaFile {
    public static void main(String[] args) throws Exception {
    	int count=0;
    	Pattern p=Pattern.compile("[a-z0-9A-Z][a-zA-Z0-9_$.]*.txt");
    	File f=new File("D:\\01CJ\\01JB");
    	String [] s=f.list();
    	for(String s1:s) {
    		Matcher m=p.matcher(s1);
    		if(m.find()&&m.group().equals(s1));
    		{
    			count++;
    			System.out.println(s1);
    		}
    	}
    	System.out.println("total no. of count "+count);
    }
}
