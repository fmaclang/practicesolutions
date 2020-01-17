import java.util.*;

public class PalindromePermutation {

	public static boolean palindromePermutation(String word) {

		//first remove all whitespaces
		String temp = word.replaceAll("\\s", "");
		
		//this acts as the hashmap
		int[] letters = new int[128]; //assume ASCII
		
		//this checks that there is only one letter with a count of one (the pivot)
		boolean pivotExists = false;

		//this counts the appearances of each letter
		for(int i=0; i<temp.length(); i++)
			letters[temp.charAt(i)]++;
		
		for(int i=0; i<temp.length(); i++) {
			
			//if the letter count is 1
			if(letters[temp.charAt(i)] == 1) {
				
				//if pivot exists, then false
				if(pivotExists)
					return false;
				
				//else, pivotExists = true
				else
					pivotExists = true;
				
			//if the letter count is not even, then immediately return false
			}else if(letters[temp.charAt(i)]%2 != 0)
				return false;
			
		}
		
		//a valid palindrome has even count of each unique letter, and one pivot letter (count = 1)
		return true;

	}

	public static void main(String[] args) {

		String word = "ka yi yak";
		System.out.println(palindromePermutation(word));

	}

}
