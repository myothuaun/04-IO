package myy05.data_streams_exercise1;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String [] languages = {"java","python","java script"};
		int [] price = {1000,2000,3000};
		DataOutputStream out = null;
	 try {
		out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C:\\programming languages\\word.txt")));
		for(int i=0;i<languages.length;i++) {
			out.writeUTF(languages[i]);
			out.writeInt(price[i]);
		}
		System.out.println("finished");
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(out != null) {
			out.close();
		}
	}

	}

}