package hacker_rank_codes;
import java.io.*;
import java.util.regex.*;

public class MobileExpressoin {
    public static void main(String[] args) throws Exception {
    	Pattern p=Pattern.compile("[0|91]?[6-9][0-9]{9}");
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
    	System.out.println("Successfully Mobile Number Filter");
    }
}
