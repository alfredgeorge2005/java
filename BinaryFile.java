package oopj08_alfred;

import java.io.*;

public class BinaryFile {
	public static void main(String[] args) throws IOException {
		File b1 = new File("Binary1.bin");
		b1.createNewFile();
		File b2 = new File("Binary2.bin");
		b2.createNewFile();
		;
		try {
			FileInputStream fin = new FileInputStream(b1);
			FileOutputStream fout = new FileOutputStream(b2);
			int i;
			System.out.print("Data of the original file:");
			while ((i = fin.read()) != -1) {
				char c = (char) i;
				System.out.print(c);
				fout.write(i);
			}
			System.out.println("\nSuccessfully written to another file!");
		} catch (Exception e) {
			System.out.println("An error occured:" + e.getMessage());
		}
		try {
			FileInputStream fin2 = new FileInputStream(b2);
			System.out.print("Data of the copied file:");
			int i;
			while ((i = fin2.read()) != -1) {
				char c = (char) i;
				System.out.print(c);
			}
		} catch (Exception e) {
			System.out.println("An error occured while copying:" + e.getMessage());
		}
	}
}
