package myy04.data_output_streams;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataOutputStream out = null;
		try {
			out =new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C:\\javatest\\test.txt")));
			out.writeUTF("apple");
			out.writeUTF("banana");
			out.writeInt(100);
			out.writeInt(200);
			System.out.println("finished");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(out != null) {
				out.close();
			}
		}

	}

}
