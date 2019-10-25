import java.util.Scanner;

public class CaesarsCode {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Write a text");
		
		String test = in.next().toUpperCase();
		System.out.println(cipher(test));
		
		in.close();

	}
	
	
	
	public static String cipher(String text) {

		String s1 = "";
		int len = text.length();
		for(int i = 0; i<len; i++) {
			char c = (char)(text.charAt(i) + 3);
			if(c>'z')
				s1+= (char)(text.charAt(i) - 23);
			else
			s1+= (char)(text.charAt(i) + 3);
			
		}
		
				
				
				return s1;
	}
	

}
