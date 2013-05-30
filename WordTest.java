/* Program: Word Test
 * Programmer: Ammar Hebib
 * This program tests the word class
*/


public class WordTest
{

	public static void main(String[] args)
	{

	Word testWord = new Word("orientation");
	
	System.out.println(testWord.countSyllables());
	}
}