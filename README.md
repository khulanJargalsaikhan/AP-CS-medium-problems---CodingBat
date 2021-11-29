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
