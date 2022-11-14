package exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomExceptions extends Exception{
	
	
	
}
	
//	public static void main(String[] args) {
//	
//	//This is the standard syntax
//		
//		try (Scanner file = new Scanner( new File(fileName))) {
//		    if (file.hasNextLine()) return file.nextLine();
//		} catch(FileNotFoundException e) {
//		    // Logging, etc 
//		}
//
//	}
//}
//
//
//
//
//// First we build a class extending the Exception subset
//
//
//class WordContainsException extends Exception
//{
//      // Parameterless Constructor
//      public WordContainsException() {}
//
//      // Constructor that accepts a message
//      public WordContainsException(String message)
//      {
//         super(message);
//      }
// }
//
//
//
//
//
//
//
//
//
//try {
//     if(word.contains(" ")) {
//       throw new WordContainsException();}
//     } catch (WordContainsException ex){
//      // Process message however you would like
//}
//
//
//
//
//
//
//
