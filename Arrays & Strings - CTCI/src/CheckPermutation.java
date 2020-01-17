import java.util.*;

public class CheckPermutation {

	public static boolean checkPermutation(String first, String second) {
		
		/*
		Map<Character, Integer> temp1 = new HashMap<Character, Integer>();
		Map<Character, Integer> temp2 = new HashMap<Character, Integer>();

		if(first.length() != second.length())
			return false;
		else
			for(int i=0; i<first.length(); i++) {

				if(temp1.containsKey(first.charAt(i)))
					temp1.replace(first.charAt(i), temp1.get(first.charAt(i)) + 1);
				else
					temp1.put(first.charAt(i), 1);

				if(temp2.containsKey(second.charAt(i)))
					temp2.replace(second.charAt(i), temp2.get(second.charAt(i)) + 1);
				else
					temp2.put(second.charAt(i), 1);

			}

		if(temp1.size() != temp2.size())
			return false;
		else
			for(Map.Entry<Character, Integer> map1 : temp1.entrySet())
				if(temp2.containsKey(map1.getKey())) {
					if(temp2.get(map1.getKey()) != map1.getValue())
						return false;
				}else
					return false;

		return true;
		*/
		
		//if the lengths are not the same, then the strings cannot be permutations of each other
		if(first.length() != second.length())
			return false;
		
		//this acts as the hashmap
		int[] letters = new int[128]; // assume ASCII
		
		//increment the count of each letter that appears in the string
		for(int i=0; i<first.length(); i++)
			letters[first.charAt(i)]++;
		
		//if any of the letters in the second string have a negative value, then not a permutation
		for(int i=0; i<second.length(); i++) {
			letters[second.charAt(i)]--;
			if(letters[second.charAt(i)] < 0)
				return false;
		}
		
		return true;

	}

	public static void main(String[] args) {

		String[] first = {"dgtarmzeqbcihuyojxsnpfwklv"};
		String[] second = {"abcdefghijklmnopqrstuvwxyz"};

		for(int i=0; i<first.length; i++)
			System.out.println(checkPermutation(first[i], second[i]));

	}

}
