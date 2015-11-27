package codebeispiele;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile3 {
	public void file2Console(String file) throws IOException {
		String content = "";
		FileReader f = null;
		f = new FileReader(file);

		BufferedReader br = new BufferedReader(f);
		do {
			content = br.readLine();
			System.out.println(content);
		} while (content != null);
		br.close();
	}

	public static void main(String[] args) {
		ReadFile3 myFile = new ReadFile3();
		String s = null;
		try {
			myFile.file2Console(s);
		} catch (NullPointerException | IOException e) {
			System.out.println("Datei wurde nicht gefunden");
		} finally {
			System.out.println("ein finally-Block wird immer ausgeführt");
		}
	}

}
