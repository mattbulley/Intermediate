
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class WriteFile2 {
	
	private String path;
	private boolean appendToFile = false;
	
	public WriteFile2(String filePath) {
		path = filePath;
	}
	
	public WriteFile2(String filePath, boolean appendValue) {
		path = filePath;
		appendToFile = appendValue;
	}
	
		
	public void WriteToFile(String textLine) throws IOException{
		FileWriter write = new FileWriter(path, appendToFile);
		PrintWriter printLine = new PrintWriter(write);
		
		printLine.printf("%s" + "%n", textLine);
		printLine.close();
	}
}
