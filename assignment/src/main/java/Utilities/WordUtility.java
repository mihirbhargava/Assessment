package Utilities;

import java.util.Arrays;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class WordUtility {
	
	/**
	 * This utility function checks if word is PALINDROME
	 * Checks: word should not be blank or has spaces
	 * @author Mihir Bhargava
	 */
	public static boolean isPalindrome(String word) {
		if(word.isBlank() || word.matches(".*\\s+.*")) {
			return false;
		}
		word = word.toLowerCase();
		return word.equals(new StringBuilder(word).reverse().toString());
	}
	
	
	
	/**
	 * This utility function checks if words are ANAGRAM
	 * Checks: word should not be blank or has spaces
	 * @author Mihir Bhargava
	 */
	public static boolean areAnagrams(String word1, String word2) {
		if (word1.isBlank() || word2.isBlank() || word1.matches(".*\\s+.*") || word2.matches(".*\\s+.*")) {
			return false;
		}
		
		char[] arrayWord1 = word1.toLowerCase().toCharArray();
		char[] arrayWord2 = word2.toLowerCase().toCharArray();
		
		Arrays.sort(arrayWord1);
		Arrays.sort(arrayWord2);
		
		return Arrays.equals(arrayWord1, arrayWord2);
	}
	
	
	
	/**
	 * This utility function checks if word is valid as per dictionary
	 * Checks: word should not be blank or has spaces
	 * Dictionary API used: https://dictionaryapi.dev/
	 * @author Mihir Bhargava
	 */
	public static boolean isValidWord(String word) {
		if(word.isBlank() || word.matches(".*\\s+.*")) {
			return false;
		}
		
		RestAssured.baseURI = "https://api.dictionaryapi.dev";
		
		try {
			Response response = RestAssured
					.given()
					.basePath("/api/v2/entries/en/" + word.toLowerCase())
					.get();
			
			return response.getStatusCode() == 200;
		} catch (Exception error) {
			System.out.println("Unable to call API. Failed with error: " + error.getMessage());
			return false;
		}
	}

}
