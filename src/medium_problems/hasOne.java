package medium_problems;

public class hasOne {

	public static void main(String[] args) {
		System.out.println(hasone(10));
		System.out.println(hasone(22));
		System.out.println(hasone(220));
		System.out.println(hasone(1));
		System.out.println(hasone(211112));
		System.out.println(hasone(56156));

	}

	/*
	 * Given a positive int n, return true if it contains a 1 digit. 
	 * Note: use % to get the rightmost digit, and / to discard the rightmost digit.


	hasOne(10) 	-- true
	hasOne(22) 	-- false
	hasOne(220) -- false
	 */


	public static boolean hasone(int n) {

		while(n%10!=0||n==10){

			if(n%10 == 1)
				return true;
			else
				n/=10; 
		} 

		return false; 

	}
	
}
