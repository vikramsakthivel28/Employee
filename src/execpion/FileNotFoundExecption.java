package execpion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExecption {
	public static void main (String[]args)throws IOException {
		try {
			File f = new File("C:\\Users\\svikr\\OneDrive\\Desktop\\New folder\\Swami and Friends.txt");
			FileReader fr = new FileReader(f);
			int temp = 0;
			while((temp=fr.read())!=-1) {
				System.out.print((char)temp);
			}
		}
		catch (FileNotFoundException fn) {
			System.out.println(fn);
			//System.out.println(fn.getMessage());
			//fn.printStackTrace();
		}
	}

}
  