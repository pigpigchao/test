
public class trycatch {
	public static void main(String[] args) {
		for(int i=0; i<10; i++){
            try{
                if(i==0){
                    System.out.println("1111111");
                }
            }catch(Exception e){
                System.out.println("222222222222");
            }finally{
                System.out.println("Yeah!");
                
            }
        }
	}

}
