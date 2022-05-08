public class NumberCombination
{
	public static void main(String args[])
	{

		System.out.println("The possible combinations are: ");
		int i = 1, j = 1, k = 1;
		for (i = 1; i <= 3; i++)
		{
	   		for (j = 1; j <= 3; j++)
	   		{
	      			for (k = 1; k <= 3; k++)
	      			{		 
			 		System.out.print(i+" "+ j +" "+ k +"\n");
		  		}
	   		}
		}
	}
}