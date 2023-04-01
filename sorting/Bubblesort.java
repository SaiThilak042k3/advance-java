public class Bubblesort implements Strategy
{
	public double[] sortstrategy(double arr[])
	{
		int end = arr.length;
		for(int i = 0 ; i < end ; i++)
		{
			for(int j = i ; j < end ; j++)
			{
				if(arr[i] > arr[j])
				{
					double swap = arr[i];
					arr[i]=arr[j];
					arr[j] = swap;
				}
			}
		}
		System.out.println("\nAfter Bubble sort");
		return arr;
	}
}
