import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Performance 
{
	public static void main(String args[])
	{
		BubbleSort bubble = new BubbleSort();
		Tester bubbletest = new Tester(bubble);
		
		InsertionSort insert = new InsertionSort();
		Tester inserttest = new Tester(insert);
		
		SelectionSort select = new SelectionSort();
		Tester selecttest = new Tester(select);
		
		MergeSort merge = new MergeSort();
		Tester mergetest = new Tester(merge);
		
		ShellSort shell = new ShellSort();
		Tester shelltest = new Tester(shell);
		
		QuickSort quick = new QuickSort();
		Tester quicktest = new Tester(quick);
		
		
		//This code just allows me to output to a text file. Taken from 
		//https://stackoverflow.com/questions/1994255/how-to-write-console-output-to-a-txt-file
		PrintStream printStream = null;
		try 
		{
			printStream = new PrintStream(new FileOutputStream("output.txt"));
		}
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		
		printStream.print("BubbleSort:");
		printStream.print(bubbletest.test(20, 100));
		printStream.print(bubbletest.test(20, 500));
		printStream.print(bubbletest.test(20, 1000));
		printStream.print(bubbletest.test(20, 2000));
		printStream.print(bubbletest.test(20, 5000));
		printStream.print(bubbletest.test(20, 10000));
		printStream.print(bubbletest.test(20, 20000));
		printStream.print(bubbletest.test(20, 75000));
		printStream.print(bubbletest.test(20, 150000));
		
		printStream.flush();
		
		printStream.print("\nInsertionSort:");
		printStream.print(inserttest.test(20, 100));
		printStream.print(inserttest.test(20, 500));
		printStream.print(inserttest.test(20, 1000));
		printStream.print(inserttest.test(20, 2000));
		printStream.print(inserttest.test(20, 5000));
		printStream.print(inserttest.test(20, 10000));
		printStream.print(inserttest.test(20, 20000));
		printStream.print(inserttest.test(20, 75000));
		printStream.print(inserttest.test(20, 150000));
		
		printStream.flush();
		
		printStream.print("\nSelectionSort:");
		printStream.print(selecttest.test(20, 100));
		printStream.print(selecttest.test(20, 500));
		printStream.print(selecttest.test(20, 1000));
		printStream.print(selecttest.test(20, 2000));
		printStream.print(selecttest.test(20, 5000));
		printStream.print(selecttest.test(20, 10000));
		printStream.print(selecttest.test(20, 20000));
		printStream.print(selecttest.test(20, 75000));
		printStream.print(selecttest.test(20, 150000));
		
		printStream.flush();
		
		printStream.print("\nMergeSort:");
		printStream.print(mergetest.test(20, 100));
		printStream.print(mergetest.test(20, 500));
		printStream.print(mergetest.test(20, 1000));
		printStream.print(mergetest.test(20, 2000));
		printStream.print(mergetest.test(20, 5000));
		printStream.print(mergetest.test(20, 10000));
		printStream.print(mergetest.test(20, 20000));
		printStream.print(mergetest.test(20, 75000));
		printStream.print(mergetest.test(20, 150000));
		
		printStream.flush();
		
		printStream.print("\nShellSort:");
		printStream.print(shelltest.test(20, 100));
		printStream.print(shelltest.test(20, 500));
		printStream.print(shelltest.test(20, 1000));
		printStream.print(shelltest.test(20, 2000));
		printStream.print(shelltest.test(20, 5000));
		printStream.print(shelltest.test(20, 10000));
		printStream.print(shelltest.test(20, 20000));
		printStream.print(shelltest.test(20, 75000));
		printStream.print(shelltest.test(20, 150000));
		
		printStream.flush();
		
		printStream.print("\nQuickSort:");
		printStream.print(quicktest.test(20, 100));
		printStream.print(quicktest.test(20, 500));
		printStream.print(quicktest.test(20, 1000));
		printStream.print(quicktest.test(20, 2000));
		printStream.print(quicktest.test(20, 5000));
		printStream.print(quicktest.test(20, 10000));
		printStream.print(quicktest.test(20, 20000));
		printStream.print(quicktest.test(20, 75000));
		printStream.print(quicktest.test(20, 150000)); 
		
		printStream.flush();
	}
}
