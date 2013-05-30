/**
 * Program: Word
 * <br>@author Ammar Hebib
 * <br>This class provides a method for counting the number
 * of syllables in a word
*/

public class Word
{

	String word;
	Word(String word)
	{
		this.word = word;
	}

/**
*  @param  This part of the class counts the number of syllables
*  @return returns the number of syllables in the word
*/
public int countSyllables()
	{
	
	int length = word.length();
	int syllable = 0;
	boolean  vowel  = false;
	
	for(int i=0; i<length; i++) 
		{
		if (isVowel(word.charAt(i)) && (vowel==false)) 
		{
		vowel = true;
		syllable++;
		}// if end 
			else if (isVowel(word.charAt(i)) && (vowel==true))
			{
			vowel = true;
			}// else if end
				else 
				{
				vowel = false;
				}// else end
		}//for end
	
	return syllable;
	}// countSyllables end

/**
*  @param  This gets the word
*  @return returns the word
*/
public String getWord()
	{
	return word;
	}


/**
*  @param  This part of the class checks if the char is a vowel
*  @return returns boolean if there is a vowel
*/
public static boolean isVowel(char c) {
    if ((c == 'a') || (c == 'A')) 
	 	{ return true;  
		}//if end
    
	 else if ((c == 'e') || (c == 'E')) 
	 	{ return true;  
		}// "e" else if end
	 
    else if ((c == 'i') || (c == 'I')) 
	 	{ return true;  
		}// "i" else if end
		
    else if ((c == 'o') || (c == 'O')) 
	 	{ return true;  
		}// "o" else if end
  
    else if ((c == 'u') || (c == 'U')) 
	 	{ return true;  
		}// "u" else if end
		
    else if ((c == 'y') || (c == 'Y')) 
	 	{ return true;  
	 	}// "y" else if end
		
    else 
	 	{ return false; 
		}// else end
  }// boolean end
}// class end



