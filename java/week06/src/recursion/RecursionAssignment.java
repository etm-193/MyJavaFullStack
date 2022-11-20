package recursion;

public class RecursionAssignment {

	public static int sum(int n) {
		
		if (n == 0) {
			return 1;
		} else {
			return n + sum (n - 1);
		}
}
	public static boolean containsGreaterThan(int[] nums, int n) {
		 if ( ( n < 0 ) || (n >= nums.length )) {
			 
			 System.out.println(" There is no number greater than 100 ");
			 return false;
		 }
		 
		 System.out.println(" The number is " + nums [n]);
		 if ( nums [n] > 100 ) {
			 System.out.println("You have a number greater than 100");
			 return true;
			 
		 }
		 System.out.println( " Is greater than N ");
		 return containsGreaterThan(nums, n -1 );
	}
		
	
	public static boolean containsGreaterThan100(int[] nums) {
	    if (nums == null ) { 
	    	return false;
	    }
	    
	   
	    	boolean hasContainsOver100 = containsGreaterThan(nums, nums.length -1 );
	    
		return hasContainsOver100;
	    
	}
	
	public static void main(String[] args){
		
		int num = 20;
		int [] myNumsList = { 50,75, 150 };
		
		System.out.println(sum (num));
		System.out.println(containsGreaterThan(myNumsList, num));
		
		System.out.println();
		System.out.println(containsGreaterThan100(myNumsList));
		
	}
}

	