package Lab1;

public class InsertionSort implements SortStrategy {
	public void sort() {
		
	}
	
	void insertionSort(int[] ar)
	{
	   for (int i=1; i < ar.length; i++)
	   {
	      int index = ar[i]; int j = i;
	      while (j > 0 && ar[j-1] > index)
	      {
	           ar[j] = ar[j-1];
	           j--;
	      }
	      ar[j] = index;
	   } 
	}
}
