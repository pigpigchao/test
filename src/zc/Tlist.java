package zc;

import java.util.ArrayList;

public class Tlist {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("dfdf");
		list1.add("null");
		list1.add(null);
		list1.add(null);
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
			
		}
	}
}
