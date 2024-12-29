package myy07.object_stream_exercise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Writer implements Serializable {



	/**
	 * 
	 */
	private static final long serialVersionUID = 8925602788262281009L;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student sd1 = new Student(1,"myo");
		Student sd2 = new Student(1,"thu");
		
		
		Student [] student = {sd1, sd2};
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("C:\\source\\students.bin"));
			oos.writeObject(student);
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
