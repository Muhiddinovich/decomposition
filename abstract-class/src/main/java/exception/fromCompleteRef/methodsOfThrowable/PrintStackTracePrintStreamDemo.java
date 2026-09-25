package exception.fromCompleteRef.methodsOfThrowable;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStackTracePrintStreamDemo {

	public static void main(String[] args) {
		Exception main = new Exception("File not found");
		Exception cause = new Exception("Could not load the program");

		main.initCause(cause);
		PrintStream stream = null;
		try {
			stream = new PrintStream(
					"C:\\Users\\user\\git\\decomposition\\abstract-class\\src\\main\\java\\exception\\fromCompleteRef\\methodsOfThrowable\\error.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		main.printStackTrace(stream);
	}

}
