package collections.iterable;

import java.util.HashMap;
import java.util.Map;

public class Demo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("apple", "fruit");
		map.put("bear", "animal");
		map.put("rose", "plant");

		Iterable<String> iterable = map.keySet();
	}
}
