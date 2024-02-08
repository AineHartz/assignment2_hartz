
public class InsertionSort implements SortingAlgorithm
{
	public int[] sorty(int[] input)
	{
		int temp = 0;
				
		for(int loopvar = 1; loopvar < input.length; loopvar++)
		{
			int nestvar = loopvar;
			
			while(nestvar > 0 && input[nestvar] < input[nestvar - 1])
			{
				temp = input[nestvar];
				input[nestvar] = input[nestvar - 1];
				input[nestvar - 1] = temp;
				nestvar--;
			}
		}
		
		return input;
	}
}
