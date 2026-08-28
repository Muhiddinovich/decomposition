package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List myList = new ArrayList<>();
		myList.add("Object 1");
		myList.add("Object 2");
		myList.add("Object 3");
//		
//		myList.remove("Object 1");
//		System.out.println("Done");
//		System.out.println(myList.get(0));
//		System.out.println(myList.size());

//		Iterator iterator = myList.iterator();
//		
//		while (iterator.hasNext()) {
//			Object object = (String) iterator.next();
//			System.out.println(object);
//		}
//		
//		for(Object next: myList){
//			System.out.println(next);
//		}
//		
		Iterator<String> iterator = myList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			
		}
	}

}
