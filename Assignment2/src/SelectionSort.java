
public class SelectionSort implements SortingAlgorithm 
{
	public int[] sorty(int[] input)
	{
		int var1 = 0;
		int var2 = 0;
		int smallest_index = 0;
		int temp = 0;
		
		for(var1 = 0; var1 < input.length - 1; var1++)
		{
			smallest_index = var1;
			
			for(var2 = var1 + 1; var2 < input.length; var2++)
			{
				if(input[var2] < input[smallest_index])
				{
					smallest_index = var2;
				}
			}
			
			temp = input[var1];
			input[var1] = input[smallest_index];
			input[smallest_index] = temp;
		}
		
		return input;
	}
}
