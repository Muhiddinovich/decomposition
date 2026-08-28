package collections.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetTask {

	public static void main(String[] args) {
		List<Set<String>> departments = new ArrayList<>();
		Set<String> it = new HashSet<>();
		Set<String> hr = new HashSet<>();
		Set<String> sales = new HashSet<>();

		departments.add(sales);
		departments.add(it);
		departments.add(hr);

		it.addAll(Set.of("Ali", "John", "Sarah"));
		hr.addAll(Set.of("Sarah", "Mike"));
		sales.addAll(Set.of("John", "David", "Mike"));

		sales.add("Ali");

		Set<String> total = new HashSet<>();

		Iterator<Set<String>> iterator = departments.iterator();
		while (iterator.hasNext()) {
			Set<java.lang.String> set = (Set<java.lang.String>) iterator.next();
			System.out.println(set);
			total.addAll(set);
		}

		System.out.println(total.size());
	}

}
