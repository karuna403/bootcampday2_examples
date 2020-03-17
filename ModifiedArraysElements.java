package bootcampprograms2dayexamples;
import java.util.Arrays;

public class ModifiedArraysElements {

	

	

	    // main() method - entry point for JVM

	    public static void main(String[] args)

	    {

	        // initialize an Arrays with duplicate values

	        int[] sArray = {10, 4, 5, 4, 8, 10};

	        int[] sArrayUnique=removeDuplicatesFromArray(sArray);

	        //Passing array as a parameter and invoke removeDuplicatesFromArray() with above initialized Arrays

	        //loop to print "{" with "," for each element

	        System.out.print("{");

	        int i=0;       

	        for(Object obj : sArrayUnique) 

	        {

	            System.out.print( obj);

	            if(i!=sArrayUnique.length-1)

	            {

	            	System.out.print(",");

	            }//end of if

	            i++;    

	        } //end of for each loop

	        System.out.print("}");

	    }//end of main method

	    public static int[] removeDuplicatesFromArray(int[] sArray) 

	    {

	    	//loop to print "{" with "," for each element

	    	System.out.print("{");

	    	int i =0;

	    	// Iterating original Arrays using enhanced for-loop

	        for(int a1 : sArray) 

	        {

	            System.out.print(a1);

	            if(i!=sArray.length-1)

	            {

	            	System.out.print(","); 

	            }

	            i++;

	        } //end of for each loop

	        System.out.print("}");

	        System.out.println();

	        // convert to unique/distinct Arrays using Java 8 Streams class

	        int[] uniqueArrays = Arrays.stream(sArray).distinct().toArray();

	        return uniqueArrays;

	      }

		

	}

