package Lab1;

public class BubbleSort implements SortStrategy {
	public void sort() {
		// TODO Auto-generated method stub
		
	}
	
	void bubbleSort(int ar[])
	{
	   for (int i = (ar.length - 1); i >= 0; i--)
	   {
	      for (int j = 1; j <= i; j++)	// j ? i
	      {
	         if (ar[j-1] > ar[j])
	         {
	              int temp = ar[j-1];
	              ar[j-1] = ar[j];
	              ar[j] = temp;
	         } 
	       } 
	    } 
	}

}
