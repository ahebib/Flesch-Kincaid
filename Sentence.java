/**
 * Program: Sentence
 * author Ammar Hebib 
 * This class represents a "sentence" string
 * It provides methods for counting the number
 * of words in a sentence and extracting each
 * word from the sentence one by one
*/

import java.util.StringTokenizer;

public class Sentence
{

	String sentence;
	Sentence(String sentence)
	{
		this.sentence = sentence;
	}
	
	/**
	This part of the class counts the number of words using StringTokenizer
	@return tokenCount which is number of words
	*/
	public int countWords()
	{
	String wordDelimiters = ".,':;?{}[]=-+_!@#$%^&*() ";
	StringTokenizer tokenSentence = new StringTokenizer(sentence,wordDelimiters);
	int tokenCount = tokenSentence.countTokens();
	return tokenCount;
	}
	
	/**
	This part of the class moves the StringTokenizer to the next word till the end of
	document that is being read
	@return checkWord
	*/
	public Word nextWord()
	{
	String wordDelimiters = ".,':;?{}[]=-+_!@#$%^&*() ";
	Word checkWord = new Word("-Error-");
	StringTokenizer tokenNextWord = new StringTokenizer(sentence,wordDelimiters);
	
	while (tokenNextWord.hasMoreTokens())
	{
		String nextWord = tokenNextWord.nextToken();
		checkWord = new Word(nextWord);
	}//while loop end
	return checkWord;
		
	}//nextWord end

}//word class end