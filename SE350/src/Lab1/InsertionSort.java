package Lab1;

public class InsertionSort implements SortStrategy {
	private long startTime;
	private long endTime;
	public void sort(Long[] ar) {
		startTime = System.currentTimeMillis();
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
		endTime = System.currentTimeMillis();
	}

	@Override
	public long getSortTime() {
		// TODO Auto-generated method stub
		return endTime - startTime;
	}
}
