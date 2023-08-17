
public class Reverse_Word {

	public static void main(String[] args) 
	{
		String str= "Sarala Dhanwate";
		String[] r_Word= str.split(" ");
		
		for(int i=r_Word.length-1;i>=0;i--)
		{
			System.out.print(r_Word[i]+" ");
		}

	}

}
