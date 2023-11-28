
package DemonstrateGenericCollection;

import java.util.*;

public class genericCollection {

	

	    public static void main(String[] args) {
	        
	    	System.out.println("Josiah Barringer - Assignment 5\n");
	    	
	    	LinkedList<Integer> list = new LinkedList<>();
	        Random rand = new Random();

	        // Insert 25 random integers from 0 to 100 into the LinkedList
	        for (int i = 0; i < 25; i++) {
	            list.add(rand.nextInt(101));
	        }

	        // Display the unsorted list
	        System.out.println("Unsorted list: " + list);

	        // Sort the elements
	        Collections.sort(list);

	        // Display the sorted list
	        System.out.println("Sorted list: " + list);

	        // Calculate the sum of the elements
	        int sum = 0;
	        for (int num : list) {
	            sum += num;
	        }

	        // Display the sum
	        System.out.println("Sum: " + sum);

	        // Calculate the floating-point average of the elements
	        float average = (float) sum / list.size();

	        // Display the average
	        System.out.printf("Average: %.2f\n", average);
	    }
	}

