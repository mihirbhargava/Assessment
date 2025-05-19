
ReadMe File

Objective:
Write a java application that would take in either one or two strings. Determine if the string are actual word in the English dictionary (using an external API resource). If a single string is given, also determine if the string is a palindrome. If two strings are given, determine if they are anagrams of one another. Also include your unit/integration tests for all given parameters.


Project Structure:
Project is based on Maven using pom.xml file. Dependencies added are RestAssured and TestNG.
WordApp.java (Main java application)
This is main java application that executes key objectives using 	utility functions.

WordUtility.java (Utility file)
This is utility class file that has functions like isPalindrome, areAnagrams, isValidWord


WordFunctionTests
This is unit test file that tests valid, invalid and negative test of utility functions. It only tests’ direct functions.

WordApplicationTest
This is integration test file that tests valid, invalid and negative test of the main application. It is integration test as we actually pass system level arguments in test and read output from terminal through buffered stream.



Project setup:
Please make sure to install Java version 21 or above, Maven, IDE (Eclipse) and set system paths.

To run only Java Application:
Navigate to folder ‘assignment’ on command prompt and hit following commands one after another:

mvn clean install 
mvn exec:java -Dexec.mainClass="Application.WordApp" -Dexec.args="listen silent"

Note: Pass the arguments in -Dexec.args based on count of words, 
example -Dexec.args=”radar” or -Dexec.args=”listem silent”


To run Tests:
Navigate to folder ‘assignment’ on command prompt and hit commands based on type of tests.

Note: Test are structured in form of following groups:
1.palindromeTests
2.anagramTests
3.wordValidityTests
4.integrationTests

Based on required group, use command:

mvn clean test -Dgroups="integrationTests"

To run all tests together, use command:

	mvn clean test


To open HTMl report:
Steps:
1.Refresh the project
2.Expand test-output folder
3.Right click on index.html (as shown below) and open with web browser


Additional notes:
-Added comments in code for ease of understanding
-Due to limited time I could not add more enhancements like adding detailed logs, third party reporting like Extent and more.



Adding few output screenshots: refer readMe.docx file
