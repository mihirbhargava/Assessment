package UnitTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.WordUtility;

/**
 * This is a unit test file for all utility functions
 * Covers: 	- Valid flow
 * 			- Invalid flow
 * 			- Negative flow
 * Tests are grouped by function, example use command option -Dgroups="palindromeTests"
 * @author Mihir Bhargava
 */
public class WordFunctionTests {

	@Test(groups = "palindromeTests", testName = "Verify function returns true for valid palindrome word.")
	public static void verifyPalindromeWithValidWord() {
		String word = "Radar";
		Assert.assertTrue(WordUtility.isPalindrome(word), "Failed to verify correct palindrome word.");
	}
	
	@Test(groups = "palindromeTests", testName = "Verify function returns false for invalid palindrome word.")
	public static void verifyPalindromeWithInvalidWord() {
		String word = "Microphone";
		Assert.assertFalse(WordUtility.isPalindrome(word), "Failed to verify incorrect palindrome word.");
	}
	
	@Test(groups = "palindromeTests", testName = "Verify function returns false for negative testing - word with space in it.")
	public static void verifyPalindromeNegativeTest() {
		String word = "Micro phone";
		Assert.assertFalse(WordUtility.isPalindrome(word), "Failed to verify incorrect palindrome word.");
	}
	
	@Test(groups = "anagramTests", testName = "Verify function returns true for valid anagram words.")
	public static void verifyAnagramWithValidWords() {
		String word1 = "Silent";
		String word2 = "Listen";
		Assert.assertTrue(WordUtility.areAnagrams(word1, word2), "Failed to verify correct anagram words.");
	}
	
	@Test(groups = "anagramTests", testName = "Verify function returns false for invalid anagram words.")
	public static void verifyAnagramWithInvalidWords() {
		String word1 = "Crow";
		String word2 = "Grow";
		Assert.assertFalse(WordUtility.areAnagrams(word1, word2), "Failed to verify incorrect anagram words.");
	}
	
	@Test(groups = "anagramTests", testName = "Verify function returns false for negative testing - word with space in it.")
	public static void verifyAnagramNegativeTest() {
		String word1 = "Map per";
		String word2 = "Dap per";
		Assert.assertFalse(WordUtility.areAnagrams(word1, word2), "Failed to verify incorrect anagram words.");
	}
	
	@Test(groups = "wordValidityTests", testName = "Verify function returns true for valid dictionary words.")
	public static void verifyWordValidityForValidWord() {
		String word = "Passionate";
		Assert.assertTrue(WordUtility.isValidWord(word), "Failed to verify validity of correct word.");
	}
	
	@Test(groups = "wordValidityTests", testName = "Verify function returns false for invalid dictionary words.")
	public static void verifyWordValidityForInvalidWord() {
		String word = "garbageiiiiWordoooo";
		Assert.assertFalse(WordUtility.isValidWord(word), "Failed to verify validity of incorrect word.");
	}
	
	@Test(groups = "wordValidityTests", testName = "Verify function returns false for negative testing - word with space in it.")
	public static void verifyWordValidityNegativeTest() {
		String word = "broken word";
		Assert.assertFalse(WordUtility.isValidWord(word), "Failed to verify validity of incorrect word.");
	}
	
}
