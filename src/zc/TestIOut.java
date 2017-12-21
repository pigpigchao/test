package zc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestIOut {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		File out1 = new File("C:\\Users\\E5470\\Test");
		OutputStream os=null;
		try {
			os = new FileOutputStream(out1,true);
			String syr = "111111111222222222";
			byte[] aa= syr.getBytes();
			os.write(aa,0,aa.length);
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			try {
				if (null!=os) {
					os.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
 	}

}
