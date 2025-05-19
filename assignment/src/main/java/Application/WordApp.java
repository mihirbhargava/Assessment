package Application;

import java.util.Arrays;
import java.util.Scanner;

import Utilities.WordUtility;


/**
 * This is a Java Application that checks following:
 * If one word is passed as system argument, it check for palindrome
 * If two words are passed as system arguments, it checks anagram
 * For all words, it check if they are valid as per dictionary.
 * @author Mihir Bhargava
 */

public class WordApp {

	public static void main(String[] args) {
		
		String[] words = args;
		
		int wordCount = words.length;
		String word1 = null;
		String word2 = null;
		
		if (wordCount == 0 || wordCount > 2) {
			System.out.println("Error: Please use 1 or 2 strings only, seperated by space or comma. Try again please.");
			return;
		}
		
		// Check for palindrome or anagram based on word count
		word1 = words[0];
		if (wordCount == 1) {
			System.out.println("Word '" + word1 + "' is a palindrome? - " + WordUtility.isPalindrome(word1));
		} else if (wordCount == 2) {
			word2 = words[1];
			System.out.println("Words '" + word1 + "' & '" + word2 + "' are anagram? - " + WordUtility.areAnagrams(word1, word2));
		}

		// Dictionary check for word validity
		Arrays.stream(words).forEach(word -> {
			System.out.println("Word '" + word + "' is valid? - " + WordUtility.isValidWord(word));
		});
	}

}
