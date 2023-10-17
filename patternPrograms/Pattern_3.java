package patternPrograms;

public class Pattern_3 {
	
	
	
//	1
//	12
//	123
//	1234
//	12345
	
	
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1 ;j<=i;j++) //taking the reference of i variable value to let them know when to  stop the 
									//inner loop execution
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
