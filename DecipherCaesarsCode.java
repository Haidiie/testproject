import java.util.Scanner;

public class DecipherCaesarsCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Write your text");
		String s1 = in.next().toLowerCase();
		
		System.out.println(s1);
		
		System.out.println(cipher(s1));
		in.close();

	}
	
	
	public static String cipher(String text) {
		String s1 = "";
		int len = text.length();
		
		for(int i = 0; i<len; i++) {
			char c = (char)(text.charAt(i) - 3);
			if(c<'a')
				s1 += (char)(text.charAt(i) + 23);
			else
				s1 += (char)(text.charAt(i) - 3);
		}
		
		return s1.toUpperCase();
	}

}
