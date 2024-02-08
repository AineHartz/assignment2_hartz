import java.util.Random;

public class Tester 
{
	SortingAlgorithm algo = null;
	//nano to milli conversion value
	final int CONVERSION = 1000000;
	
	Tester(SortingAlgorithm sa)
	{
		algo = sa;
	}
	
	public double singleTest(int size)
	{
		Random random = new Random();
		
		//I used the following stackoverflow post to find this method: https://stackoverflow.com/questions/20380991/fill-an-array-with-random-numbers
		//My original implementation was just going to be using a for loop and calling random.nextInt for every position, which would make this go from
		//n to n^2 time complexity if I'm not mistaken. Or maybe random.ints is n^2 anyways, but may as well try it. 
		int[] input = random.ints(size).toArray();
		
		//This line makes singletest use k sort, for #11. I'll comment it out, but when testing #11, you can just uncomment it. 
		//generateKSorted(input);
		
		double first = System.nanoTime();
		algo.sorty(input);
		double second = System.nanoTime();
		double time = (second / CONVERSION) - (first / CONVERSION);
	
		return time;
	}
	
	
	//I made this return the console String for use in my text file implementation in Performance. 
	public String test(int iterations, int size)
	{
		
		double average_time = 0;
		
		for(int i = 0; i < iterations; i++)
		{
			average_time += singleTest(size);
		}
		
		String result = "\nSorted " + size + " elements in " + (average_time / iterations) + " ms (avg)";
		System.out.println(result);
		return result;
	}
	
	public int[] generateKSorted(int[] input)
	{
		Random random = new Random();
		
		for(int i = 0; i < input.length; i++)
		{
			input[i] = random.nextInt();
		}
		
		ShellSort shell = new ShellSort();
		int[] gap = {10};
		shell.shellsort(input, gap);
		
		return input;
	}
}
