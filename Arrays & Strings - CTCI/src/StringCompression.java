import java.util.*;

public class StringCompression {

	public static String stringCompression(String word) {

		/*
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> m = new HashMap<Character, Integer>();

		for(int i=0; i<word.length(); i++) {

			if(!m.containsKey(word.charAt(i)))	
				m.put(word.charAt(i), 1);
			else
				m.replace(word.charAt(i), m.get(word.charAt(i))+1);

		}
		
		for(Map.Entry<Character, Integer> entry : m.entrySet())
			sb.append(entry.getKey().toString() + "" + entry.getValue());
		
		return (sb.toString().length() < word.length() ? sb.toString() : word);
		*/

		StringBuilder sb = new StringBuilder();
		char curr = word.charAt(0);
		int count = 0;
		
		//use a temp char to hold current letter and count, if letter changes, append letter and count
		for(int i=0; i<word.length(); i++) {
			
			if(curr == word.charAt(i))
				count++;
			else {
				
				sb.append(curr + "" + count);
				curr = word.charAt(i);
				count = 1;
				
			}
			
		}
		
		sb.append(curr + "" + count);
		
		//if the compressed string has a longer length than original string, then return original
		return (sb.toString().length() < word.length() ? sb.toString() : word);
		
	}

	public static void main(String[] args) {

		String word = "abbbbbbcd";

		System.out.println(stringCompression(word));
		

	}

}
