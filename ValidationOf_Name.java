package hacker_rank_codes;
import java.io.*;
import java.util.regex.*;

public class ValidationOf_Name {
    public static void main(String[] args) throws Exception {
    	Pattern p=Pattern.compile("[a-zA-Z]+");
    	PrintWriter pw=new PrintWriter("C:\\Demo\\out.txt");
    	BufferedReader br=new BufferedReader(new FileReader("C:\\Demo\\input.txt"));
    	String line=br.readLine();
    	while(line!=null) {
    		Matcher m=p.matcher(line);
    		while(m.find()) {
    			pw.println(m.group());
    		}
    		line=br.readLine();    		
    	}
    	pw.close();
    	br.close();
    	System.out.println("Successfully Email Id Filter");
    }
}
