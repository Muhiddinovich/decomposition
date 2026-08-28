package collections.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TaskMap {

	public static void main(String[] args) {
		Map<String, Double> store = new HashMap<>();
		store.put("Laptop", 1200d);
		store.put("Phone", 800d);
		store.put("Headphones", 150d);
		store.put("Mouse", 40d);
		store.put("Keyboard", 70d);

		Iterator<String> iterator = store.keySet().iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.println(key + ":" + store.get(key));
		}

		System.out.println("Price of Phone:" + store.get("Phone"));
//		store.replace("Mouse", 50d);
		store.put("Mouse", 50d);
		store.remove("Keyboard");
		System.out.println(store);

		double total = 0;
		for (double d : store.values()) {
			total += d;
		}
		System.out.println(total);

		store.entrySet().stream().forEach(t -> System.out.println(t.getKey() + ":" + t.getValue()));
	}

}
