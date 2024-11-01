package week3.day1.homeassignment_week3_day1;

public class RemoveDuplicateWordsinaString {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
		System.out.println("input: " +text);
		int len=words.length;
		for(int i=0;i<len;i++)
		{
			
			for(int j=i+1;j<len;j++)//Nested loop
			{
							
				if(words[i].equals(words[j]))
				{
					String tempStr = words[i];
					System.out.println("Duplicate word :"+words[i]);
					text = text.replaceAll(tempStr, " ");
					
				}
						
			}
								       
			
		}
		
		System.out.println("Output String :"+text);
		

	}

}
