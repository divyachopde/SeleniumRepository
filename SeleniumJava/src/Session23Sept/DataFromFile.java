package Session23Sept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DataFromFile {

	public static String readFile(String filename, int row, int col) throws IOException {
		File file = new File("Resources/" + filename);// relative path
		BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));

		for (int r = 1; r < row; r++) {
			br.readLine();
		}
		String expRow = br.readLine();
		String[] parts = expRow.split(",");
		return parts[col-1];

	}
}