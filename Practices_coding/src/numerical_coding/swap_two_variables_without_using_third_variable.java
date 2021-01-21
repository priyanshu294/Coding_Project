package numerical_coding;

public class swap_two_variables_without_using_third_variable {

	public static void main(String[] args) {
		
		    int x = 20;
	        int y = 15;
	        
	        //logic
	        x = x + y;
	        y = x - y;
	        x = x - y;
	        
	        
	        System.out.println("After swaping:  x = " + x + ", y = " + y);
	}

}
