package hacker_rank_codes;
public class CountVowels {
//	public static void main(String[] args) 
//	{
//		String s="Hello World!";
//		s=s.toLowerCase();
//		int count=0;
//		char arr[]=s.toCharArray();
//		for(int i=0;i<s.length();i++){
//			char ch=arr[i];
//			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//				count++;
//				System.out.println("No "+count+ " vowel is: "+ch);
//			}
//		}
//	System.out.println("The number of vowels in the string is: "+count);	
//	}
	public static void main(String[] args) 
	{
		String s="Hello World!";
		s=s.toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				count++;
				System.out.println("No "+count+ " vowel is: "+ch);
			}
		}
		System.out.println("The number of vowels in the string is: "+count);
	}
}
