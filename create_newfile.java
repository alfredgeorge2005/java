package oopj08_alfred;

import java.io.*;

public class create_newfile {


	public static void main(String[] args) throws IOException {
		File f = new File("MyFile.txt");
		f.createNewFile();
		String content = "This is the University Exam for OODP. \nThis a program to illustrate the use of files.";
		try {
			FileOutputStream fos = new FileOutputStream(f);
			fos.write(content.getBytes());
			FileInputStream fis = new FileInputStream(f);
			int i;
			while ((i = fis.read()) != -1) {
				char c = (char) i;
				System.out.print(c);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
