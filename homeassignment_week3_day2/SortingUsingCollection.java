package week3.day2.homeassignment_week3_day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class SortingUsingCollection {
	public static void main(String[] args) {
		String temp;
		List <String> company = new ArrayList <String>();
		List <String> reversecompany = new ArrayList <String>();
		company.add("HCL");
		company.add("Wipro");
		company.add("Aspire System");
		company.add("CTS");
		System.out.println(company);
		Collections.sort(company);
		System.out.println("Sorted list: "+company);
		
		for(int i=company.size()-1;i>=0;i--)
		{
			temp = company.get(i);
			reversecompany.add(temp);
		}

		System.out.println("Reverse Sort strings are:"+reversecompany);

	}

	}


