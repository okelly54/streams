package streams;

import java.util.ArrayList;
import java.util.List;

public class Streams {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Michael");
		names.add("Dean");
		names.add("James");
		names.add("Chris");
		for (int i = 0; i < names.size(); i++) {
			if (names[i] != "James") {
				names.add(i - 1, "Hello");
			}
		}
		names.stream().forEach(i -> System.out.println(i));

	}

}
