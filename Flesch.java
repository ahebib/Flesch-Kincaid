/**
 * Program: Flesch 
 * author Ammar Hebib 
 * This program look over a document that the user specifies and computes
 * the Flesch-Kincaid Grade level
*/

import javax.swing.JOptionPane;
import java.io.*;
import java.util.StringTokenizer;


public class Flesch
{
	public static void main(String[] args)throws IOException
	{
	
	String filePrompt = JOptionPane.showInputDialog("What is the name of the file that will be analzyed?(Gettysburg.txt, hanselgretel.txt, quote.txt)");
	
	String readFile = getFile(filePrompt);
		
	//test how many sentences
	String wordDelimiters = ".!?:;";
	StringTokenizer tokenSentence = new StringTokenizer(readFile,wordDelimiters);
	int tokenCount = tokenSentence.countTokens();	
	
	getDisplay(readFile, filePrompt, tokenCount);
	
	}//main end
	
	
/**
* Shows: This function reads the file and puts it into a string
* @param file name
* @return String text file inside
*/

	public static String getFile(String filePrompt)throws IOException
	{
	
	String emptyString = "";
	
	StringBuffer fileContents = new StringBuffer(emptyString);
	
	try {
    BufferedReader in = new BufferedReader(new FileReader(filePrompt));
    while ((emptyString = in.readLine()) != null) {
        fileContents.append(emptyString);
    }
    in.close();
} catch (IOException e) {
}
	return fileContents.toString();
		
	}//readFile end
	
/**
* Shows: This function shows the results and calculates the Flesch reading level
* @param String readFile
* @return none
*/	
	
	public static void getDisplay(String readFile, String filePrompt, int tokenCount)
	{
	
	System.out.println("File Name: " + filePrompt);
	
	//test count number of syllables
	Word wordTest = new Word(readFile);
	
	System.out.println("Number of Syllables: " + wordTest.countSyllables());
	
	//test count number of words
	Sentence sentenceTest = new Sentence(readFile);
	
	System.out.println("Number of Words: " + sentenceTest.countWords());
	
	//Number of Sentences
	System.out.println("Number of Sentences: " + tokenCount);
	
	double flesch = (.39*sentenceTest.countWords()/tokenCount)+(11.8*wordTest.countSyllables()/sentenceTest.countWords())-15.59;
		
	//Flesch-Kincaid Grade Level
	System.out.printf("Flesch-Kincaid Grade Level: " + flesch);
	
	}//getDisplay end

}//Flesch Class end