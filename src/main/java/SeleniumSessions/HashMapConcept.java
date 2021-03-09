package SeleniumSessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {

		// HashMap --> <K,V> -- implements -- Map
		Map<String, Object> m1 = new HashMap<String, Object>();

		m1.put("name", "Tom");
		m1.put("class", 10);
		m1.put("gender", 'm');
		m1.put("name", "peter");

		System.out.println(m1.get("name"));
		System.out.println(m1.get("city"));

	}

}
