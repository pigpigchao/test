package test;
/*
 * 非线程安全的计数器
 * */
public class NonThreadSafeCounter {

		private int counter = 0;
		public void increment(){
			counter++;
		}
		public int get(){
			return counter; 
		}
}
