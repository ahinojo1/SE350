package Lab1;

public class InsertionSort implements SortStrategy {
	public void sort(long[] ar) {
		for (int i=1; i < ar.length; i++)
		   {
		      long index = ar[i]; int j = i;
		      while (j > 0 && ar[j-1] > index)
		      {
		           ar[j] = ar[j-1];
		           j--;
		      }
		      ar[j] = index;
		   }
	}
}
