package patternPrograms;

public class Pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N =7;
		  for (int i = 0; i < N; i++)
		    {
		        // For printing the spaces before stars in each row
		        for (int j =0; j<N-i-1; j++)
		        {
		            System.out.print(" ");
		        }
		       
		        // For printing the stars in each row
		        for(int j=0;j< 2*i+1;j++){
		            
		            System.out.print("*");
		        }
		        
		        // For printing the spaces after the stars in each row
		         for (int j =0; j<N-i-1; j++)
		        {
		            System.out.print(" ");
		        }
		       

		        // As soon as the stars for each iteration are printed, we move to the
		        // next row and give a line break otherwise all stars
		        // would get printed in 1 line.
		        System.out.println();
		    }

	}
}

