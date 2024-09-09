package Day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice1 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
//			relative path....linux
//			in = new FileInputStream("input.txt");
//			absolute path....
			in = new FileInputStream("D://java//leanJava//input.txt");
			out = new FileOutputStream("out.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

	}
}