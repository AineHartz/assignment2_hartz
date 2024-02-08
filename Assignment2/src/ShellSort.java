
public class ShellSort implements SortingAlgorithm
{
	public int[] sorty(int[] input)
	{
		//These two while loops generate the gapvals array,
		//using the n^2 - 1 formula. 
		int iterator = 1;
		int check_val = 0;
		
		while(check_val < input.length)
		{
			if(iterator == 1)
			{
				check_val = 1;
				iterator++;
			}
			
			else 
			{
				check_val = (iterator ^ 2) - 1;
				iterator++;
			}
		}
		
		iterator--;
		int[] gapvals = new int[iterator];
		int val = 0;
		
		
		while(iterator > 0)
		{
			gapvals[val] = (iterator ^ 2) - 1;
			val++;
			iterator--;
			
			if(iterator == 1)
			{
				gapvals[val] = 1;
			}
		}
		
		shellsort(input, gapvals);
		return input;
	}
	
	public void shellsort(int[] input, int[] gapvals)
	{
		for(int gap = 0; gap < gapvals.length; gap++)
		{
			for(int iterator = 0; iterator < gapvals[gap]; iterator++)
			{
				interleaved(input, iterator, gapvals[gap]);
			}
		}
	}
	
	public void interleaved(int[] input, int start, int gap)
	{
		for(int iterator = start + gap; iterator < input.length; iterator += gap)
		{
			int nest = iterator;
			while (nest - gap >= start && input[nest] < input[nest - gap])
			{
				int temp = input[nest];
				input[nest] = input[nest - gap];
				input[nest - gap] = temp;
				nest -= gap;
			}
		}
	}
}
