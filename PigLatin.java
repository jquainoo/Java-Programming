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
		return "aeiou".contains(Character.toString(character));
	}
	
	public static String pigLatin(String word){
		int count = 0;
		char firstChar = word.charAt(0);
		if(word.charAt((int)word.length()/2) == 'y')
			return word + "hay";
		else if(isVowel(firstChar))
			return word + "hay";
		else if(!isVowel(firstChar) && Character.toLowerCase(firstChar) != 'y'){
			for(int i = 0; i < word.length(); i++){
				if(isVowel(word.charAt(i))){
					break;
				}
				else{
					count++;
				}
			}
			return word.substring(count, word.length()) + word.substring(0, count) + "ay";
		}
		else if(firstChar == 'y'){
			return word.substring(1, word.length()) + 'y' + "ay";	
		}
		return null;	
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = input.nextLine();
		System.out.println(pigLatin(word));
		input.close();
	}	
}
