package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;
// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner (System.in);
		Boolean done = false;
		while (!done) {
			String exit = userInput.next();
			if (exit.equals("quit")) {
				done = true;
			}
		}
	}

}