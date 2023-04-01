public class Sorter{
  Strategy strategy;

  Sorter(){
    strategy = null;
  }

  double[] Sort(double arr[] , Strategy strategy){
    return strategy.sortstrategy(arr);

  }

  double[] Sort(double arr[]){
    return strategy.sortstrategy(arr);
  }

  void setStrategy(Strategy strategy){
    this.strategy = strategy;

  }

  public static void main(String[] args)
  {
    Sorter sorter = new Sorter();
    double temp[] = {0, 20, 5, 12, 0, 22. 35};

    double output[] = sorter.Sort(temp,new Bubblesort());

    for(int i =0 ; i < output.length ; i++ ){
      System.out.println(output[i]);
    }

    output = sorter.Sort(temp, new Insertsort());

    for(int i =0 ; i < output.length ; i++ ){
      System.out.println(output[i]);
    }	

    output = sorter.Sort(temp, new MergeSort());

    for(int i =0 ; i < output.length ; i++ ){
      System.out.println(output[i]);
    } 
  }
}

