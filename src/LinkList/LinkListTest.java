package LinkList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkListTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<String> a = new LinkedList<>();
		a.add("A");
		a.add("C");
		a.add("E");
		List<String> b = new LinkedList<>();
		b.add("B");
		b.add("D");
		b.add("F");
		b.add("G");
		
		ListIterator<String> aIter = a.listIterator();
		Iterator<String> bIter = b.iterator();
		
		while(bIter.hasNext()){
			if (aIter.hasNext()) {
				aIter.next();
				
			}
			aIter.add(bIter.next());
		}
		System.out.println(a);
		
		bIter = b.iterator();
		while (bIter.hasNext()) {
			bIter.next();
			if (bIter.hasNext()) {
				bIter.next();
				bIter.remove();
			}
		}
		System.out.println(b);
		a.removeAll(b);
		System.out.println(a);
	}

}
