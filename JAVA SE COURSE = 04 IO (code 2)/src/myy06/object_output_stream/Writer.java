package myy06.object_output_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Writer implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 2323092503858049497L;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student sd1 = new Student(1,"myo");
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("C:\\source\\student.txt"));
			oos.writeObject(sd1);
			System.out.println("finished");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(oos != null) {
				oos.close();
			}
		}

	}

}
