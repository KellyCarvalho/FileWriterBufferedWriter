package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"A","B","C","D"};
	
		String path = "C:\\Users\\Kelly Carvalho\\eclipse-workspace\\FileWriter-BufferedWriter\\src\\texto\\exemplo.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			
			for(String line:lines) {
				bw.write(line);
				bw.newLine();
			}
			
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
