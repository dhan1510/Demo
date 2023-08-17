import java.util.Arrays;

public class Duplicate_Word {

	public static void main(String[] args)
	{
		String str= "Good";
		
		int count=0,i,j;
		
		 	
		char ch[]=str.toCharArray();
		

		for( i=0;i<ch.length;i++)
		{
			
			for( j=0;j<i;j++)
			{
				if(ch[i]==ch[j])
				{
					break;
				}
				
			}
			
			if(j==i)
			{
			    ch[count++]=ch[i];
			}
		}
		
			System.out.println(String.valueOf(Arrays.copyOf(ch, count)));
			
			
			Duplicate_Word  dw=new Duplicate_Word();
		//	dw.Duplicate();
	}
	
	

	
	
	
	
	
}
