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
