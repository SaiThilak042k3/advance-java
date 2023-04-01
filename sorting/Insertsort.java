public class Insertsort implements Strategy
{
    public double[] sortstrategy(double[] arr)	
    {    
        double m = arr.length;
        int pass=1;
        double temp=0.0;
        for(pass=1; pass<m; pass++)
        {
           temp=arr[pass];
           int k;
           for(k=pass-1; k>=0; k--)		
           {
           		if(temp>=arr[k])
           			break;
           		else
           			arr[k+1]=arr[k];
           }
           arr[k+1]=temp;
        }
        System.out.println("\nAfter Insertion sort");
        return arr;
    }
}
