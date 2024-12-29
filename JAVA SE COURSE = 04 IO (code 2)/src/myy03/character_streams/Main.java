package myy03.character_streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File source = new File("C:\\javatest\\hello.txt");
		File target = new File("C:\\pythontest\\fileReader.txt");
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader(source);
			fw = new FileWriter(target);
			
			int code;
			while((code = fr.read())!= -1) {
				fw.write(code);	
			}
			System.out.println("finished");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fr != null) {
				fr.close();
			}
			if(fw != null) {
				fw.close();
			}
		}
		

	}

}
