package codebeispiele;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile1 {
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
		ReadFile1 myFile = new ReadFile1();
		String s = null;
		try {
			myFile.file2Console(s);
		} catch (FileNotFoundException e) {
			System.out.println("geht nicht");
		} catch (IOException e) {
			// muss nicht geloggt werden
			System.out.println("Datei wurde nicht gefunden");
		} catch (NullPointerException e) {
			System.out.println("Keine Datei angegeben");
		} finally {
			System.out.println("ein finally-Block wird immer ausgeführt");
		}
	}

}
