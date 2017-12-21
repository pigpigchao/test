package zc;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class zcArrayList {
	private Object[] eleman;
	private int size;
	 

	
	public  zcArrayList (){
		this(10);
	};
	
	
	public  zcArrayList (int initial){
		if (initial<0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		eleman = new Object[initial];   
	
	};

	public void add(){}
	
	
	
	
	
	
}
