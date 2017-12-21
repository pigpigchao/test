package zc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestIO {

		public static void main(String[] args) {
			// TODO 自动生成的方法存根

			String uri = "C:\\Users\\E5470\\JavaIOTest.txt";
			File aFile = new File(uri);
			InputStream is = null;
			try {
				is = new FileInputStream(aFile);
				byte[] aa = new byte[10];
				int len = 0;
				while (-1 != (len = is.read(aa))) {
					String bb = new String(aa, 0, len);
					System.out.println(bb);
				}
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				System.out.println();
				try {
					if (null != is) {
						is.close();
					}
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}

		}

	}

