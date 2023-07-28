package hacker_rank_codes;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

public class AnagramStringCheck {
	public static void main(String ...s) {
		String s1="BAgCD";
		String s2="DCdAB";
		if(s1.length()!=s2.length()) {
			System.out.println("Not Anagram");
			System.exit(0);
		}
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0;i<c1.length;i++) {
			if(c1[i]!=c2[i]) {
				System.out.println("Not Anagram");
				System.exit(0);
			}
		}
		System.out.println("Anagram");
	}
}
