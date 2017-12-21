package zc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tmap {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, 111);

		System.out.println(map.keySet());
		System.out.println(map.values());
		Set key = map.keySet();
		System.out.println(map.get(key));
	}
}
