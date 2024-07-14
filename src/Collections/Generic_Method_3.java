package Collections;

import java.util.Iterator;

public class Generic_Method_3 {

	public <T> void getvalue(T no[]) {
		for (T num : no) {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		
		Integer [] listInteger = {100,300,4005,600,700};
		
		Double [] listDoubles = {100.90,300.40,4005.90,600.0,700.90};
		
		Generic_Method_3 gm_3 = new Generic_Method_3();
		gm_3.getvalue(listInteger);
		gm_3.getvalue(listDoubles);
		

	}

}
