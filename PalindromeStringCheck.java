package hacker_rank_codes;
public class PalindromeStringCheck {
	public static String palindrom(String s) {

		int l=0;
		int r=s.length()-1;
		while(l<r) {
			if(s.charAt(l)!=s.charAt(r)) {
				return "No";
			}
			l++;r--;
		}
		
		return "Yes";
	}
	public static void main(String ...e) {
		String s="madam";
		
		System.out.println(palindrom(s));
	}
}
