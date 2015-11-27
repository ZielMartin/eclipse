package codebeispiele;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile2 {

	public void file2Console(String file) {
		String content = "";
		FileReader f = null;
		try {
			f = new FileReader(file);
			BufferedReader br = new BufferedReader(f);
			try {
				do {
					content = br.readLine();
					System.out.println(content);
				} while (content != null);
			} catch (IOException e) {
				System.out.println("ein IO-Fehler ist aufgetreten");
			} finally {
				try {
					if (br != null) {
						br.close();
					}
					if (f != null) {
						f.close();
					}
				} catch (IOException e) {
					System.out.println("Datei konnte nicht geschlossen werden");
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Die Datei wurde nicht gefunden\n");
		}

	}

	public static void main(String[] args) {
		ReadFile2 myReadFile = new ReadFile2();
		myReadFile.file2Console("gibts.net");
	}

}
