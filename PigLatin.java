/*
 * Modify the Pig Latin program that we started writing in class to be able to translate all words into
 *  Pig Latin, not just those beginning with a vowel or a single consonant. You can either use the code 
 *  you wrote in class, or down mine: code from class. Recall that you translate an English word into Pig 
 *  Latin using these rules: 1)If the English word starts with one or more consonants, all consonants before 
 *  the first vowel are removed from the front of the English word, and added to the end of it, keeping the 
 *  order the same. The string “ay” is then added to the end of this string. If the English word starts with a
 *   vowel, append the string “hay” to the end of that word. Treat ‘y’ as a consonant. For example, good becomes 
 *   oodgay, egg becomes egghay, and school becomes oolschay.
 * @author leonjoel
 *
 */
package cuny.lehman.cmp326;
public class PigLatin {

	public static boolean isVowel(char character){
		return (character == 'a' || character == 'e' || character == 'i' || character == 'o' || 
				character == 'u');
	}
	
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		String newWord = null;
		System.out.print("Enter a word: ");
		String word = input.nextLine();
		for(int i = 0; i < word.length(); i++){
			char firstChar = word.charAt(0);
			char character = word.charAt(i);
			if(isVowel(firstChar))
				newWord = word + "hay";
			else if(!isVowel(character))
				newWord = word.substring(1) + character + "ay";
			else if(firstChar == 'y'){
				newWord = word.substring(1) + 'y' + "ay";	
			}
			else if(word.charAt((int)word.length()/2) == 'y')
				newWord = word + "hay";
		}
		System.out.println(newWord);
		input.close();
		
		System.out.println(isVowel('b'));
	}
	
	
		

}
