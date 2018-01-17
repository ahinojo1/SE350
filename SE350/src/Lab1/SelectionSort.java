package Lab1;

public class SelectionSort implements SortStrategy{
	public void sort(Long[] ar) {
		for (int i = 0; i < (ar.length-1); i++){
		      int min = i;
		      for (int j = i+1; j < (ar.length); j++) {
		            if (ar[j] < ar[min]) min = j;
		      }
		      long temp = ar[i];
		      ar[i] = ar[min];
		      ar[min] = temp;
		   } 
	}
}
