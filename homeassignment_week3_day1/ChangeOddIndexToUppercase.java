package week3.day1.homeassignment_week3_day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String name = "changeme";
		char[] namechar = name.toCharArray();
		int len=namechar.length;
		for (int i = 0; i < len; i++) {
		    char ch = name.charAt(i);
		    if (i % 2 == 0) {
		        System.out.print(Character.toLowerCase(ch));
		    } else {
		        System.out.print(Character.toUpperCase(ch));
		    }
		}
		}
}
		

	
