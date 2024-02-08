
public class QuickSort implements SortingAlgorithm
{
	public int[] sorty(int[] input)
	{
		quicksort(input, 0, (input.length - 1));
		return input;
	}
	
	public int partition(int[] input, int start, int end)
	{
		
		//This if/else statement implements median of three for pivot choosing, unless there's two or less elements left, in which case, just use the first one.
		//Also, I left it in, but this broke my code when I tried to actually use it, so I just commented it out and went back to the textbook pivot, the midpoint.
		/*(int pivot = 0;
		if(input.length > 1)
		{
			int midpoint = start + (end - start) / 2;
			pivot = (input[start] + input[midpoint] + input[end]) / 3;
		}
		
		else
		{
			pivot = input[start];
		}*/
		
		int midpoint = start + (end - start) / 2;
		int pivot = input[midpoint];
		
		int low = start;
		int high = end;
		boolean done = false;
		
		while (!done)
		{
			while (input[low] < pivot)
			{
				low = low + 1;;
			}
			
			while (pivot < input[high])
			{
				high = high - 1;
			}
			
			if (low >= high)
			{
				done = true;
			}
			
			else 
			{
				int temp = input[low];
				input[low] = input[high];
				input[high] = temp;
				low++;
				high--;
			}
		}
		
		return high;
	}
	
	public void quicksort(int[] input, int start, int end)
	{
		if(end == start)
		{
			return;
		}
		
		int high = partition(input, start, end);
		quicksort(input, start, high);
		quicksort(input, high + 1, end);
	}
}
