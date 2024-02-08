
public class MergeSort implements SortingAlgorithm
{
	public int[] sorty(int[] input)
	{
		mergesort(input, 0, (input.length - 1));
		return input;
	}
	
	public void mergesort(int[] input, int first, int last)
	{
		int partition = 0;
		
		if (first < last)
		{
			partition = (first + last) / 2;
			
			mergesort(input, first, partition);
			mergesort(input, (partition + 1), last);
			
			merge(input, first, partition, last);
		}
	}
	
	public int[] merge(int[] input, int first, int partition, int last)
	{
		int merged_size = last - first + 1;
		int[] merged = new int[merged_size];
		int merge_pos = 0;
		int left_pos = first;
		int right_pos = partition + 1;
		
		while(left_pos <= partition && right_pos <= last)
		{
			if(input[left_pos] <= input[right_pos])
			{
				merged[merge_pos] = input[left_pos];
				left_pos++;
			}
			
			else
			{
				merged[merge_pos] = input[right_pos];
				right_pos++;
			}
			
			merge_pos++;
		}
		
		while(left_pos <= partition)
		{
			merged[merge_pos] = input[left_pos];
			left_pos++;
			merge_pos++;
		}
		
		while(right_pos <= last)
		{
			merged[merge_pos] = input[left_pos];
			right_pos++;
			merge_pos++;
		}
		
		for(merge_pos = 0; merge_pos < merged_size; merge_pos++)
		{
			input[first + merge_pos] = merged[merge_pos];
		}
		
		return input;
	}
}
