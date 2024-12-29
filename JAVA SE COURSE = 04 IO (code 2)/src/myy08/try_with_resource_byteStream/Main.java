package myy08.try_with_resource_byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File source = new File("C:\\javatest\\myo.png");
		File target = new File("C:\\pythontest\\new.png");
		
		try (FileInputStream fis = new FileInputStream(source);
				FileOutputStream fos = new FileOutputStream(target)){
			
			int code;
			int i = 0;
			while((code = fis.read())!= -1) {
				fos.write(code);
				i++;
			}
			
			System.out.println("file size is "+i+" bytes");
			System.out.println("finished");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
