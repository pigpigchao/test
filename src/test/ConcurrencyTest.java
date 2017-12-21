package test;

public class ConcurrencyTest {
	private static final long count =400000l;

	public static void main(String[] args) throws InterruptedException{
		// TODO 自动生成的方法存根
		concurrency();
		serial();
		

	}

	private static void serial() {
		// TODO 自动生成的方法存根
		long start = System.currentTimeMillis();
		int a =0;
		for(long i=0;i<count;i++){
			a+=5;
		}
		int b = 0;
		for(long i = 0 ;i<count;i++){
			b--;
		}
		long time = System.currentTimeMillis()-start;
		System.out.println("serial :"+time+"ms,a="+a);
	}

	private static void concurrency() throws InterruptedException{
		// TODO 自动生成的方法存根
		long start = System.currentTimeMillis();
		Thread thread = new Thread(new Runnable(){
			@Override
			public void run(){
				int a =0;
				for(long i = 0;i<count; i++){
					
				}
			}
		});
		thread.start();
		int b =0;
		for(long i=0;i<count;i++){
			b--;
		}
		thread.join();
		long time = System.currentTimeMillis()-start;
		System.out.println("concurrency :"+time+"ms,b="+b);
	}

}
