import java.util.*;

public class URLify {
	
	public static String URLify(String word) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i) == ' ')
				sb.append("%20");
			else
				sb.append(word.charAt(i));
		}
		
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		
		String word = "Swag 420    ";
		System.out.println(URLify(word));
		
	}

}
