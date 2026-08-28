package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task {

	public static void main(String[] args) {

		List<List<String>> departments = new ArrayList<>();

		List<String> electronics = new ArrayList<>();
		List<String> clothing = new ArrayList<>();
		List<String> food = new ArrayList<>();

		electronics.add("Laptop");
		electronics.add("Phone");
		electronics.add("Headphones");
		electronics.add("Mouse");

		clothing.add("Shirt");
		clothing.add("Jeans");
		clothing.add("Jacket");

		food.add("Bread");
		food.add("Milk");
		departments.add(electronics);
		departments.add(clothing);
		departments.add(food);

		Iterator<List<String>> iterator = departments.iterator();
		while (iterator.hasNext()) {
			List<java.lang.String> list = (List<java.lang.String>) iterator.next();
			System.out.println(list);
		}
	}

}
