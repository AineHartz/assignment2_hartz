
public class BubbleSort implements SortingAlgorithm
{
	public int[] sorty(int[] input)
	{
		int temp = 0;
		
		for(int loopvar = 0; loopvar < input.length-1; loopvar++)
		{
			for(int nestvar = 0; nestvar < input.length - loopvar - 1; nestvar++)
			{
				if(input[nestvar] > input[nestvar + 1])
				{
					temp = input[nestvar];
					input[nestvar] = input[nestvar + 1];
					input[nestvar + 1] = temp;
				}
			}
		}
		
		return input;
	}
}
