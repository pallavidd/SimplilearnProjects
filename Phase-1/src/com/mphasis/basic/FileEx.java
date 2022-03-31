package com.mphasis.basic;

import java.io.FileInputStream;
import java.io.IOException;

public class FileEx {


		public static void main(String[]args, Object fis) throws IOException {
			if(fis!=null) {
				System.out.println("file is in read mode");
			}
			while (read()!=-1){
				System.out.print((char)((FileInputStream) fis).read());
				
			}
			System.out.println("read operation completed");
			((FileInputStream) fis).close();
		}

		private static int read() {
			// TODO Auto-generated method stub
			return 0;
		}
}


