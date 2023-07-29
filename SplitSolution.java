import java.io.*;
import java.util.*;

public class SplitSolution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String s1 = s.replaceFirst("^[ ]+","");
    if(s1.isEmpty()){
        System.out.println(0);
    }
    else{
        String[] s2 = s1.split("[!,?._'@ ]+");
        System.out.println(s2.length);
        for(String ele:s2){
            System.out.println(ele);
        }
    }
        }
    }


