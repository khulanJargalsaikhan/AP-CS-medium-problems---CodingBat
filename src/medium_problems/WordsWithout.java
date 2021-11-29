package medium_problems;

import java.util.Arrays;

public class WordsWithout {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(wordsWithout(new String[] {"a", "b", "c", "a"}, "a")));
		System.out.println(Arrays.toString(wordsWithout(new String[] {"a", "b", "c", "a"}, "b")));
		System.out.println(Arrays.toString(wordsWithout(new String[] {"a", "b", "c", "a"}, "c")));

	}
	
	/*
	 * Given an array of strings, return a new array without the strings that are equal to the target string. 
	 * One approach is to count the occurrences of the target string, make a new array of the correct length, 
	 * and then copy over the correct strings.


	wordsWithout(["a", "b", "c", "a"], "a") 	-- ["b", "c"]
	wordsWithout(["a", "b", "c", "a"], "b") 	-- ["a", "c", "a"]
	wordsWithout(["a", "b", "c", "a"], "c") 	-- ["a", "b", "a"]
	 */
	
	public static String[] wordsWithout(String[] words, String target) {

		int count = 0;

		for(int i=0; i<words.length; i++){

			if (words[i].equals(target))
				count++;
		}
		
		int len = words.length - count;

		String[] newArr = new String[len];

		for(int j=0, i=0; j<len; i++){
			if (!(words[i].equals(target))){
				newArr[j] = words[i];
				j++;
			}
		}

		return newArr;

	}
	
	

}
