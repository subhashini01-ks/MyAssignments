package week3.day1.homeassignment_week3_day1;

public class ReverseOddWordsinaString {

	public static void main(String[] args) {
		String test = "I am a software tester";
		//Split the words and have it in an array
		String[] words = test.split(" ");
		System.out.println(words);
		int len=words.length;
		char ch;
        String tempStr="";
		
		System.out.println("Input String:"+test);
		
		for(int i=0;i<len;i++)
		{
			tempStr="";
			ch=0;
			
			if(i%2==1)
			{
				char[] tempArr = words[i].toCharArray();
				
				for(int j=0;j<tempArr.length;j++)
				{
					
					ch=words[i].charAt(j);
					tempStr = ch+tempStr;
					
				}
				
				test = test.replaceFirst(words[i], tempStr);
			}
		
		}
		
		System.out.println("Reversed text:"+test);
	}

}
