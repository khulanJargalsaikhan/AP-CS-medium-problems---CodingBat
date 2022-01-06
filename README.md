# AP-CS-medium-problems---CodingBat

*wordsWithout*
	
	Given an array of strings, return a new array without the strings that are equal to the target string. 
	One approach is to count the occurrences of the target string, make a new array of the correct length, 
	and then copy over the correct strings.

	  wordsWithout(["a", "b", "c", "a"], "a") 	-- ["b", "c"]
	  wordsWithout(["a", "b", "c", "a"], "b") 	-- ["a", "c", "a"]
	  wordsWithout(["a", "b", "c", "a"], "c") 	-- ["a", "b", "a"]
    
*hasone*
    	
	Given a positive int n, return true if it contains a 1 digit. 
	Note: use % to get the rightmost digit, and / to discard the rightmost digit.

	  hasOne(10) 	-- true
	  hasOne(22) 	-- false
	  hasOne(220) -- false

*mergeTwo*
	
	Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. 
	Return a new array containing the first N elements from the two arrays.	The result array should be 
	in alphabetical order and without duplicates. A and B will both have a length which is N or more. 
	The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they 
	are in alphabetical order, copying elements directly to the new array.

	mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
	mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
	mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
	
*wordsWithoutList*

	Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given 
	length are omitted. See wordsWithout() below which is more difficult because it uses arrays.

	wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
	wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
	wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]

*scoresAverage*

	Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger. 
	We'll say that the second half begins at index length/2. The array length will be at least 2. To practice decomposition, 
	write a separate helper method int average(int[] scores, int start, int end) { 
	which computes the average of the elements between indexes start..end. 
	Call your helper method twice to implement scoresAverage(). Write your helper method after your 
	scoresAverage() method in the JavaBat text area. Normally you would compute averages with doubles, 
	but here we use ints so the expected results are exact.


	scoresAverage([2, 2, 4, 4]) → 4
	scoresAverage([4, 4, 4, 2, 2, 2]) → 4
	scoresAverage([3, 4, 5, 1, 2, 3]) → 4
