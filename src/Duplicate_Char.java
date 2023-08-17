
public class Duplicate_Char {

	public static void main(String[] args) 
	{
		
		String str="Sarala";
		int count=0,i;
		char dup[]=str.toCharArray();
		
		for( i=0;i<dup.length;i++)
		{
			count=1;
			
			for(int j=i+1;j<dup.length;j++)
			{
				if(dup[i]==dup[j] && dup[i]!=' ')
				{
					count++;
					dup[j]='0';
				}
			}
			
			if(count>1 && dup[i]!='0')
				
			System.out.println("duplicate letter= " +dup[i]+ " \ncount="+count);
		}
		
	}

}
