
public class Dup_String_Remove {

	public static void main(String[] args)
	{
        String str1="Sarala Jondhale";
		
		System.out.println("Duplicat char in string= "+str1);
		
		int count=0;
		char[] ch=str1.toCharArray();
		
		System.out.println(ch.length);
		int j;
		for(int i=0;i<ch.length;i++)
		{	
				//int j;
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("Duplicate character="+ch[j]);
					count++;
				}
				
				
			}
			
		}
		//System.out.println("Count of duplicate char in string= "+ch[j]);

	}

}
