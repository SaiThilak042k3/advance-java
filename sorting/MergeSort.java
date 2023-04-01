public class MergeSort implements Strategy{
	public double[] sortstrategy(double arr[])
	{
		int r = arr.length ;
		double new_arr[] = new double[r];	
		mergeSort(arr,new_arr, 0 ,r - 1);
		System.out.println("\nAfter Merge sort");
		return new_arr;
	}

	public void mergeSort(double arr[], double new_arr[] , int l, int r)
	{

		if(l<r)
		{
			int m = (l+r)/2;
			mergeSort(arr,new_arr,l,m);
			mergeSort(arr,new_arr,m+1,r);
			merge(arr,new_arr,l,m+1,r);
		}
	}
	
	public void merge(double arr[],double new_arr[] , int l, int m, int r)
	{	
		int l_end = m -1;
		int i = l , j = m , k = l;

		while (i <= l_end && j<= r)
		{
			if(arr[i] <= arr[j])
			{
				new_arr[k] = arr[i];
				i++;
			}
			else
			{
				new_arr[k] = arr[j];
				j++;
			}
			k++;
		}

		while(i<= l_end)
		{
			new_arr[k] = arr[i];
			i++;
			k++;
		}

		while(j<= r)
		{
			new_arr[k]=arr[j];
			j++;
			k++;
		}


		for(i = l ; i<=r ; i++)
			arr[i] = new_arr[i];

	}
}
