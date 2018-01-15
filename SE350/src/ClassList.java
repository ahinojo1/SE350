import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class ClassList {
	List<String> classList = new LinkedList<String>();
	
	public ClassList(){
		classList.add("Bob");
		classList.add("Mary");
		classList.add("Sarah");
		classList.add("Philip");
		classList.add("Greg");
	}
	
	public void printClassList() {
		Iterator<String> iterator = classList.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
	}
	
	public void printClassList2() {
		for(String name : classList) {
			System.out.println(name);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassList myClassList = new ClassList();
		myClassList.printClassList();
		
	}

}
