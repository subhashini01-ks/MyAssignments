package week3.day2.homeassignment_week3_day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementusingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=new ArrayList<Integer>();
	    numbers.add(1);
	    numbers.add(2);
	    numbers.add(3);
	    numbers.add(4);
	    numbers.add(10);
	    numbers.add(6);
	    numbers.add(8);
	    Collections.sort(numbers);
	    int i=1;
	    while(i< numbers.size()) 
	    {
	        if (numbers.get(i) - numbers.get(i-1) == 1);
	       
	        else 
	        {
	            System.out.println("Missing number is " + (numbers.get(i-1) + 1));
	            numbers.add((numbers.get(i-1)+1));
	            Collections.sort(numbers);
	        }
	        i++;
	    }
	   

	}

}
