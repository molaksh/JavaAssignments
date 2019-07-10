package set3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest {
	public static void main(String[] args) {
		System.out.println("hello");
		
		ArrayList<String> al = new ArrayList<>();
		
		
		al.add("1.John");
		al.add("2.Johan");
		al.add("3.John");
		
		al.add("4.Johan");
		al.add("5.John");
		al.add("6.Johan");
		
		
		
		//iterating using Iterator interface
		System.out.println("iterating using Iterator interface");
		Iterator<String> itr = al.iterator(); 
		
		System.out.println("1."+itr.next());
		System.out.println("2."+itr.next());
		System.out.println("3."+itr.next());
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//iterating using for loop
		System.out.println("\niterating using for loop");
		for (String str : al) {
			System.out.println(str);
			
		}
		
		//list iterator
		System.out.println("\niterating through list iterator");
		ListIterator<String> litr = al.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("\nreversing list iterator");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
		
		//iterating using list iterator
		System.out.println("\niterating using list iterator");
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		//resetting using hasPrevious() and .previous() methods
		System.out.println("\nresetting list iterator to first object of the list");
		while(litr.hasPrevious()) {
			litr.previous();
		}
		
		//using the iterator object 2nd time
		System.out.println("\nusing the same list iterator for the 2nd time");
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("\n\n**************************************");
				
		
		//using obj.clone() method of ArrayList
		System.out.println("\nusing list.clone() method");
		
		ArrayList<String> al1 = new ArrayList<>();
		al1 = (ArrayList<String>) al.clone();
		Iterator<String> itr1 = al1.iterator();
		
		System.out.println("\nIterating over object cloned from original object");
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		//clearing new object
		System.out.println("\nclearing new object");
		al1.clear();
		
		ListIterator<String> litr2 = al1.listIterator();
		
		
			if(litr2.hasNext()) {
				System.out.println(litr2.next());
			}
			else {
				System.out.println("list is empty");
			}
			
		System.out.println(al);
		
		System.out.println("end");
		
		
		
		
	}

}
