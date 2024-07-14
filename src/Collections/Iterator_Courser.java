package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Courser {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Gopikisan");
		list.add("Guatam");
		list.add("Raj");
		list.add("Ravindra");
		list.add("Gopikisan");

		Iterator<String> ltr = list.iterator();
		try {

			ltr.remove();

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Handle exception ");
		}

		while (ltr.hasNext()) {
			String list_1 = ltr.next();
			System.out.println(list_1);

		}

	}

}
