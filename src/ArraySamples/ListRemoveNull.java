package ArraySamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class ListRemoveNull{
	
	  
	  
	    // Generic function to remove Null Using Iterator 
	    public static <T> List<T> removeNullUsingIterator(List<T> list) 
	    { 
	  
	        // Create an iterator from the list 
	        Iterator<T> itr = list.iterator(); 
	  
	        // Find and remove all null 
	        while (itr.hasNext()) { 
	            if (itr.next() == null) 
	                itr.remove(); // remove nulls 
	        } 
	  
	        // Return the null 
	        return list; 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	  
	        // Create the list with null values 
	        List<String> list = new ArrayList<>( 
	            Arrays.asList("hello", 
	                          null, 
	                          "World", 
	                          null, 
	                          "How","are","you")); 
	  
	        // Print the list 
	        System.out.println("Initial List: " + list); 
	  
	        // Removing nulls using iterator 
	        list = removeNullUsingIterator(list); 
	  
	        // Print the list 
	        System.out.println("Modified List:  " + list); 
	    } 
	} 


