package Collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ListIterator_Coursor {

	public static void main(String[] args) 
	{
		Set<String> list = new LinkedHashSet<String>();

		list.add("Gopikisan");
		list.add("Gautam");
		list.add("Raj");
		list.add("Ravindra");
		list.add("Gopikisan");

		System.out.println("Before List Iterator: " + list);

		List<String> list2 = new ArrayList<String>(list);

		ListIterator<String> listIterator = list2.listIterator();

		System.out.println("Using List Iterator:");
		while (listIterator.hasNext()) 
		{
			System.out.println(listIterator.next());
		}

		// Removing the last element accessed by the iterator
		listIterator.remove();

		System.out.println("After removing the last element: " + list2);

		// Reusing the same variable name for a new ListIterator
		listIterator = list2.listIterator();

		System.out.println("Using List Iterator again:");
		while (listIterator.hasNext()) 
		{
			System.out.println(listIterator.next());
		}
	}
}
