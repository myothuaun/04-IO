package myy07.object_stream_exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("C:\\source\\studetn.bin"));
			Student [] studentArray = (Student []) ois.readObject();
			for(Student sd:studentArray) {
			System.out.println(sd.getId()+ "-" +sd.getName());
			System.out.println("finished");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(ois != null) {
				ois.close();
			}
		}


	}

}
