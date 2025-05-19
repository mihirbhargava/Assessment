package IntegrationTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import Application.WordApp;
import Utilities.WordUtility;


/**
 * This is a integration test file for main java application
 * Objective: 	To test working of Java Application in totality, by passing arguments
 * 				from command line and validating output from terminal output stream.
 * Covers: 		- Valid flow
 * 				- Invalid flow
 * Tests are grouped by function, example use command option -Dgroups="integrationTests"
 * @author Mihir Bhargava
 */
public class WordApplicationTest {

	@Test(groups = "integrationTests", testName = "Verify application works for single correct word.")
	public static void verifyPalindromeWithValidOneWord() {
		String argument = "Radar";
		List<String> expectedStrings = new ArrayList<String>();
		expectedStrings.add("Word 'Radar' is a palindrome? - true");
		expectedStrings.add("Word 'Radar' is valid? - true");
		int expectationCount = expectedStrings.size();
		
		String javaHome = System.getProperty("java.home");
		String javaBin = javaHome + "/bin/java";
		String classpath = System.getProperty("java.class.path");
		String mainClass = "Application.WordApp";
		String command = String.format("%s -cp \"%s\" %s %s", javaBin, classpath, mainClass, argument);

		try {
			Process process = Runtime.getRuntime().exec(command);
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
            while ((line = reader.readLine()) != null && expectationCount >=1) {
                if (expectedStrings.contains(line)) {
                	expectationCount--;
                }
            }
            reader.close();
            process.waitFor();
		} catch (Exception error) {
			error.printStackTrace();
			Assert.fail("Failed to execute test.");
		}
		
		Assert.assertTrue(expectationCount == 0, "Failed to verify application works for single correct word.");
	}
	
	@Test(groups = "integrationTests", testName = "Verify application works for single incorrect word.")
	public static void verifyPalindromeWithInvalidOneWord() {
		String argument = "garbageSingleWordkkkk";
		List<String> expectedStrings = new ArrayList<String>();
		expectedStrings.add("Word 'garbageSingleWordkkkk' is a palindrome? - false");
		expectedStrings.add("Word 'garbageSingleWordkkkk' is valid? - false");
		int expectationCount = expectedStrings.size();
		
		String javaHome = System.getProperty("java.home");
		String javaBin = javaHome + "/bin/java";
		String classpath = System.getProperty("java.class.path");
		String mainClass = "Application.WordApp";
		String command = String.format("%s -cp \"%s\" %s %s", javaBin, classpath, mainClass, argument);

		try {
			Process process = Runtime.getRuntime().exec(command);
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
            while ((line = reader.readLine()) != null && expectationCount >=1) {
                if (expectedStrings.contains(line)) {
                	expectationCount--;
                }
            }
            reader.close();
            process.waitFor();
		} catch (Exception error) {
			error.printStackTrace();
			Assert.fail("Failed to execute test.");
		}
		
		Assert.assertTrue(expectationCount == 0, "Failed to verify application works for single incorrect word.");
	}
	
	@Test(groups = "integrationTests", testName = "Verify application works for two correct word.")
	public static void verifyPalindromeWithValidTwoWord() {
		String argument = "Silent Listen";
		List<String> expectedStrings = new ArrayList<String>();
		expectedStrings.add("Words 'Silent' & 'Listen' are anagram? - true");
		expectedStrings.add("Word 'Silent' is valid? - true");
		expectedStrings.add("Word 'Listen' is valid? - true");
		int expectationCount = expectedStrings.size();
		
		String javaHome = System.getProperty("java.home");
		String javaBin = javaHome + "/bin/java";
		String classpath = System.getProperty("java.class.path");
		String mainClass = "Application.WordApp";
		String command = String.format("%s -cp \"%s\" %s %s", javaBin, classpath, mainClass, argument);

		try {
			Process process = Runtime.getRuntime().exec(command);
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
            while ((line = reader.readLine()) != null && expectationCount >=1) {
                if (expectedStrings.contains(line)) {
                	expectationCount--;
                }
            }
            reader.close();
            process.waitFor();
		} catch (Exception error) {
			error.printStackTrace();
			Assert.fail("Failed to execute test.");
		}
		
		Assert.assertTrue(expectationCount == 0, "Failed to verify application works for two correct word.");
	}
	
	@Test(groups = "integrationTests", testName = "Verify application works for two incorrect word.")
	public static void verifyPalindromeWithInvalidTwoWord() {
		String argument = "OrangeNotAWord AppleNotAWord";
		List<String> expectedStrings = new ArrayList<String>();
		expectedStrings.add("Words 'OrangeNotAWord' & 'AppleNotAWord' are anagram? - false");
		expectedStrings.add("Word 'OrangeNotAWord' is valid? - false");
		expectedStrings.add("Word 'AppleNotAWord' is valid? - false");
		int expectationCount = expectedStrings.size();
		
		String javaHome = System.getProperty("java.home");
		String javaBin = javaHome + "/bin/java";
		String classpath = System.getProperty("java.class.path");
		String mainClass = "Application.WordApp";
		String command = String.format("%s -cp \"%s\" %s %s", javaBin, classpath, mainClass, argument);

		try {
			Process process = Runtime.getRuntime().exec(command);
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
            while ((line = reader.readLine()) != null && expectationCount >=1) {
                if (expectedStrings.contains(line)) {
                	expectationCount--;
                }
            }
            reader.close();
            process.waitFor();
		} catch (Exception error) {
			error.printStackTrace();
			Assert.fail("Failed to execute test.");
		}
		
		Assert.assertTrue(expectationCount == 0, "Failed to verify application works for two incorrect word.");
	}
	
	
}
