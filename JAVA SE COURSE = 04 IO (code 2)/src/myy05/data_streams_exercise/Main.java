package myy05.data_streams_exercise;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream in = null;
		 try {
			in = new DataInputStream(new BufferedInputStream(new FileInputStream("C:\\pythontest\\myo.txt")));
			while(true) {
				String languages = in.readUTF();
				int price = in.readInt();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(in != null) {
				in.close();
			}
		}

		
	}
}
