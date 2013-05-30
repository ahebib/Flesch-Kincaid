/* Program: Sentence Test
 * Programmer: Ammar Hebib
 * This program tests the word class
*/


public class SentenceTest
{

	public static void main(String[] args)
	{

	Sentence testSentence = new Sentence("This is a test, only a test, do not freak out");
	
	System.out.println(testSentence.countWords());
	
	}
}