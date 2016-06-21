package readcsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "SampleData.csv";
		File file = new File(fileName);
		try {
			Scanner inputStream = new Scanner(file);
			while(inputStream.hasNext()){
				String Data=inputStream.next();
				System.out.println(Data);
			}
			inputStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
