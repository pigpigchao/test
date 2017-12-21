package swap;

public class swap {

	
	
	
	public static void jiaohuan(int a1,int b2) {
		int temp=a1;
		a1=b2;
		b2=temp;
		String s="1111";
		System.out.println("jiaohuanqian++a1++"+a1);
		System.out.println("jiaohuanqian++b2++"+b2);
	}
	
	
	public static void main(String[] args) {
		int a =3;
		int b =4;
		jiaohuan(a,b);
		System.out.println("jiaohuanhou---a--"+a);
		System.out.println("jiaohuanhou---b--"+b);
	}

}
