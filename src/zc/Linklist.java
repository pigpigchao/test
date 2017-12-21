package zc;

public class Linklist {

	private Node first;
	private Node last;
	
	public void add(Object obj) {
		Node n = new Node();
		if (first==null) {
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			
			first=n;
			last=n;
		} else {
			
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			
			last.setNext(n);
		}
	}
	
	
	public Object get(int index) {
		Node temp = null;
		if (first!=null) {
			temp=first;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
				
			}
			return temp.obj;
		}
		return null;
	}
	
	
	
	public static void main(String[] args) {
		Linklist linklist= new Linklist();
		linklist.add("aaa");
		linklist.add("bbb");
		linklist.add("null");
		linklist.add("null");
		linklist.add("null");
		linklist.add("ccc");
		System.out.println(linklist.get(0));
		System.out.println(linklist.get(1));
		System.out.println(linklist.get(2));
		System.out.println(linklist.get(3));
		System.out.println(linklist.get(4));
		System.out.println(linklist.get(5));
	}
}
