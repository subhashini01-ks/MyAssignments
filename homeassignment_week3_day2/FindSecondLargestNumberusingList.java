
package week3.day2.homeassignment_week3_day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumberusingList {

	public static void main(String[] args) {
		int[] num= {3, 2, 11, 4, 6, 7};
		List <Integer> listnum=new ArrayList <Integer>();
		
		for(int i=0;i<num.length;i++)
			listnum.add(num[i]);
		Collections.sort(listnum);
		System.out.println(listnum);
		Integer secondlarge = listnum.get(listnum.size()-2);
		System.out.println("2nd largest number:"+secondlarge);
		
		
	}

}
