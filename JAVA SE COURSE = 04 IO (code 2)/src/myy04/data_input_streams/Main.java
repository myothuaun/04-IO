package myy04.data_input_streams;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream in = null;
		 try {
		in = new DataInputStream(new BufferedInputStream(new FileInputStream("C:\\javatest\\test.txt")));
			System.out.println(in.readUTF());
			System.out.println(in.readUTF());
			System.out.println(in.readInt());
			System.out.println(in.readInt());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(in != null) {
				in.close();
			}
		}
	}

}
