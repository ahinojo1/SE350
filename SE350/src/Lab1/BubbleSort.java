package Lab1;

//import java.util.ArrayList;

public class BubbleSort implements SortStrategy {
	/*public void sort(ArrayList<Long> ar) {
		for (int i=1; i < ar.size(); i++)
		   {
		      long index = ar.get(i); int j = i;
		      while (j > 0 && ar.get(j-1) > index)
		      {
		           ar.set(j, ar.get(j-1));
		           j--;
		      }
		      ar.set(j, index);
		   }
	} */
	
	public void sort(Long[] ar) {
		for (int i = (ar.length - 1); i >= 0; i--)
		   {
		      for (int j = 1; j <= i; j++)
		      {
		         if (ar[j-1] > ar[j])
		         {
		              long temp = ar[j-1];
		              ar[j-1] = ar[j];
		              ar[j] = temp;
		         } 
		       } 
		    } 
	}
}
