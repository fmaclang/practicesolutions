import java.util.*;

public class OneAway {

	public static boolean oneAway(String first, String second) {
		
		//if the difference in length of the two strings is > 1, then false
		if(Math.abs(first.length()-second.length()) > 1)
			return false;

		//assign shorter and larger strings in case of length mismatch
		String longer = (first.length() > second.length() ? first : second);
		String shorter = (first.length() > second.length() ? second : first);

		int i = 0;
		int j = 0;
		int diff = 0;

		//while the counters have not exceeded their string length counterparts
		while(i < longer.length() && j < shorter.length()) {

			//if the characters are equal, then simply advance the short pointer
			if(longer.charAt(i) == shorter.charAt(j))
				j++;
			
			//else, increment differences, only advance short pointer if short length == long length
			else {

				diff++;
				j = (longer.length() == shorter.length() ? j+1 : j);

			}
			
			//always advance long pointer
			i++;

			//check the current diff, if > 2, then false
			if(diff > 1)
				return false;

		}

		return true;

	}

	public static void main(String[] args) {

		String first = "pale";
		String second = "ple";

		System.out.println(oneAway(first, second));

	}

}
