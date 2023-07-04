import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaIO {
	public static void main(String[] args) throws IOException {

		File myFile = new File("file.txt");
		myFile.createNewFile();
		
		Scanner fileReader=new Scanner(myFile);
		
		FileWriter fileWriter = new FileWriter(myFile);
		
		fileWriter.write("Merhaba");
		fileWriter.write("\nBen Emre");
		fileWriter.flush();
		
		while(fileReader.hasNext());
		System.out.println(fileReader.next());
		
		fileWriter.close();
		fileReader.close();
		
		bufferWriterAndReader();
		
	  
	}

	private static void bufferWriterAndReader() throws IOException {
		
		File mySecondFile = new File("buffer.txt");
		FileWriter buffer= new FileWriter(mySecondFile);
		BufferedWriter bufferedWriter = new BufferedWriter(buffer);
		
		FileReader read= new FileReader(mySecondFile);
		BufferedReader bufferedRead= new BufferedReader (read);
		
		bufferedWriter.write(15);
		bufferedWriter.newLine();
		bufferedWriter.append("Merhaba 15").append(" \nMerhaba Dünya");
		bufferedWriter.flush();
		for (int i = 0; i < 12; i++) 
			System.out.println((char)bufferedRead.read());
			System.out.println(bufferedRead.readLine());
			bufferedRead.close();
			bufferedWriter.close();
		
		
		
		
		
		
	}
}
