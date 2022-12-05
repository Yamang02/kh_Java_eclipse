package com.kh.chapter3;

import com.kh.chapter3.assiststream.A_ByteToCharStream;
import com.kh.chapter3.assiststream.B_BufferedStream;
import com.kh.chapter3.assiststream.C_DataStream;
import com.kh.chapter3.assiststream.D_ObjectStream;

public class Application {

	public static void main(String[] args) {

		System.err.println("Program start");
		
//		new A_ByteToCharStream().input();
//		new A_ByteToCharStream().output();
		
		new B_BufferedStream().fileSave();
//		new B_BufferedStream().fileread();
		
//		new C_DataStream().fileSaveandRead();
		
//		new D_ObjectStream().fileSave();
//		new D_ObjectStream().fileRead();

		System.err.println("Program end");
		
	}

}
