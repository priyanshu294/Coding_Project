package arrays_coding;

public class Sorting_Elements_In_An_Array {

	public static void main(String[] args) {
		
	    //Initialize array     
        int [] arr = new int [] {3,6,1,9,7,4};     
        int temp = 0;    
            
        //Displaying elements of original array    
        System.out.print("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {  
            	
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.print("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    

	}

}
