package collections.iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("apple", "fruit");
		map.put("bear", "animal");
		map.put("rose", "plant");
		System.out.println(map);

		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey());
			iterator.forEachRemaining(t -> System.out.println(t));
//			map.remove(); //ConcurrentModificationException

		}
		
	}

}
