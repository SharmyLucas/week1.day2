package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Cognizant";
		char ch='a';
				
		char[] str=name.toCharArray();
		
		int count=0;
		for(int i=0; i<str.length; i++) {
			if(ch==str[i])
			{
				count++;
			}
			
		}
		
		System.out.println(count);
		

	}

}
