package externalData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
	String path ="..//myWriteData.txt";	
	
	File f = new File(path);
	
	FileWriter fw =  new FileWriter(f , true);
	
	BufferedWriter bw = new BufferedWriter(fw);
	
	
	bw.write("Word1");
	
	bw.write("Meaning 1");
	
	bw.write("Meaning 2");
	
	bw.newLine();
	
	bw.write("Word2");

	bw.write("Meaning1");
	
	bw.write("Meaning2");
	
	
	bw.close();
	
	
	

	
	
	
	
	
	
	}

}
