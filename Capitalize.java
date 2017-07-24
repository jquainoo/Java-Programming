/*
 * Write a method that takes in a String, and returns that same String, but with all the consonants in lower 
 * case and all the vowels in upper case. For example, the String "apple" would be returned as "ApplE", 
 * the String "a frog" would be returns as "A frOg", and the String "Toronto" would be returned as "tOrOntO".
 * Call this method with at least three different inputs in the main method to test it.
 * @author leonjoel
 */
public class Capitalize {

	public static String CapitalizeVowel(String word){
		String newWord = ""; char character;
		for(int i = 0; i < word.length(); i++){
			character = word.charAt(i);
			if(isVowel(character))
				character = Character.toUpperCase(character);
			else
				character = Character.toLowerCase(character);
			newWord += character;
		}
		return newWord;
	}

	public static boolean isVowel(char character){
		return "aeiou".contains(Character.toString(character));
	}

	public static void main(String[] args) {
		System.out.println(CapitalizeVowel("Favorite fruit is apple"));
		System.out.println(CapitalizeVowel("a leapping frog"));
		System.out.println(CapitalizeVowel("Canada -> Toronto"));
	}
}
