import java.io.File;
import java.util.Arrays;

public class TestFile {
public static void main(String[] args) {
	File aFile = new File("考核点.jpg");
	System.out.println(aFile.getAbsolutePath());
	
	File bFile = new File("me_active.jar");
	System.out.println(bFile.getAbsolutePath());
	
	String path = "/Users/zhuchao/Documents/workspace/test/";
	String pa1 = "/Users/zhuchao/Downloads/";
	File src = new File(pa1);
	if (src.isDirectory()) {
		System.out.println("11111111111111");
		String[] name = src.list();
//		for (String string1 : name) {
//			System.out.println(string1);
//		}
		File[] name1 = src.listFiles();
		for (File file : name1) {
			System.out.println(file);
		}
		
		File[] roots = File.listRoots();
		System.out.println(Arrays.toString(roots));
		
	}
	
	
}
	
}
