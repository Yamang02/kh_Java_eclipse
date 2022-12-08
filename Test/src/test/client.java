package test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class client {

	public void output() {

		try(FileWriter fw = new FileWriter("test1.txt", true)) {

			fw.write("97");
			fw.write("65");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
