
/**
 * I certify that all code in this file is my own work.
 * This code is submitted as the solution to Assignment 1
 * in CSIS44542 Object-Oriented Programming, 2017, section 03
 *
 * Due date: 5pm, Friday, February 16, 2017. */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.String;
import java.text.*; //for decimal formatter

/**
 * The main objective of this class is to calculate the number of words,
 * sentences and syllables present in the text file. This class takes the input
 * filename from the user.
 *
 * @author Reshma Shaik
 */
public class TakeHomeAssignment {

    /**
     * This method calculates the number of words, sentences and syllables.
     *
     * @param args String arguments were passed
     * @throws FileNotFoundException when file is not found it throws the file
     * not found exception
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner lineRead = new Scanner(System.in);
        int sentenceCount = 0;
        String sentenceLength;
        int wordCount = 0;
        double syllableCount = 0.0;
        int position = 0;
        String schoolLevel = null;
        double score = 0.0;
        double gradeLevel = 0.0;

        System.out.print("Please type the file you want to read in: ");
        String fileName = lineRead.nextLine();
        // reads the file through the path or else we can provide the file name. Defaultly it checks the root folder for the file
        File textFile = new File("C:\\Users\\S528761\\Documents\\NetBeansProjects\\Shaik_TakeHomeAssignment1\\" + fileName);
        lineRead.close();
        if (textFile.exists()) {

            //To Count how many lines in the text file we are using the while loop to iterate and scanner class to read the input file
            Scanner sentenceScan = new Scanner(textFile);
            while (sentenceScan.hasNextLine()) {
                sentenceLength = sentenceScan.nextLine();
                for (int i = 0; i < sentenceLength.length(); i++) {
                    if (sentenceLength.charAt(i) == '.' || sentenceLength.charAt(i) == '?' || sentenceLength.charAt(i) == '!') {
                        sentenceCount++;
                    }
                }
            } //end of while loop
            sentenceScan.close(); //Close the linescan Scanner

            //To Count how many words in the sentences for that we are using the while loop and scanner class to read the input file
            Scanner wordScan = new Scanner(textFile);
            while (wordScan.hasNext()) //It iterates until the another token is not found.
            {
                wordCount++; //Incrementing the word count

                wordScan.next();
            } //end of while loop
            wordScan.close(); //close the wordscan Scanner
            //System.out.println("Lines " +lineCount + "/n "+ "Words " +  wordCount);

            //Counting the number of syllables in the textfile
            Scanner syllableScan = new Scanner(textFile);
            while (syllableScan.hasNextLine()) {
                //Outer While loop        
                while (syllableScan.hasNext()) {
                    //inner while loop
                    String word = syllableScan.next();
                    //System.out.println(s1);
                    word.toLowerCase(); //converting words to lower case

                    for (int i = 0; i < word.length(); i++) {
                        /*If the word contains the vowels and 'y' then count variable gets incremented*/
                        if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'y') {
                            syllableCount++;
                        }
                        /*If the vowels are side by side then the count variable will be decremented*/
                        if (word.charAt(i) == 'a') {
                            position = word.indexOf(i) + 1;
                            if (word.charAt(position) == 'a' || word.charAt(position) == 'e' || word.charAt(position) == 'i' || word.charAt(position) == 'o' || word.charAt(position) == 'u') {
                                syllableCount--;
                            }
                        }
                        if (word.charAt(i) == 'e') {
                            position = word.indexOf(i) + 1;
                            if (word.charAt(position) == 'a' || word.charAt(position) == 'e' || word.charAt(position) == 'i' || word.charAt(position) == 'o' || word.charAt(position) == 'u') {
                                syllableCount--;
                            }
                        }
                        if (word.charAt(i) == 'i') {
                            position = word.indexOf(i) + 1;
                            if (word.charAt(position) == 'a' || word.charAt(position) == 'e' || word.charAt(position) == 'i' || word.charAt(position) == 'o' || word.charAt(position) == 'u') {
                                syllableCount--;
                            }
                        }
                        if (word.charAt(i) == 'o') {
                            position = word.indexOf(i) + 1;
                            if (word.charAt(position) == 'a' || word.charAt(position) == 'e' || word.charAt(position) == 'i' || word.charAt(position) == 'o' || word.charAt(position) == 'u') {
                                syllableCount--;
                            }
                        }
                        if (word.charAt(i) == 'u') {
                            position = word.indexOf(i) + 1;
                            if (word.charAt(position) == 'a' || word.charAt(position) == 'e' || word.charAt(position) == 'i' || word.charAt(position) == 'o' || word.charAt(position) == 'u') {
                                syllableCount--;
                            }

                        }
                        if (word.charAt(i) == 'y') {
                            position = word.indexOf(i) + 1;
                            if (word.charAt(position) == 'a' || word.charAt(position) == 'e' || word.charAt(position) == 'i' || word.charAt(position) == 'o' || word.charAt(position) == 'u') {
                                syllableCount--;
                            }

                        }

                    } //end of for loop

                } //end of inner while loop

            } //end of outer while loop

            //System.out.println("syllables"+count);
            //range of readability
            score = (206.835) - 1.015 * (wordCount / sentenceCount) - ((84.6 * syllableCount) / wordCount);
            //Decimal Format is used to print the required decimal points and here we are taking one decimal point.
            DecimalFormat decformat = new DecimalFormat("#0.0");
            //applying decimal format to score variable
            decformat.format(score);

            //checking the school level using if-else condition
            if (score <= 100.00 && score >= 90.00) {
                schoolLevel = "(5th grade)";
            } else if (score < 90.0 && score >= 80.0) {
                schoolLevel = "(6th grade)";
            } else if (score < 80.0 && score >= 70.0) {
                schoolLevel = "(7th grade)";
            } else if (score < 70.0 && score >= 60.0) {
                schoolLevel = "(8th & 9th grade)";
            } else if (score < 60.0 && score >= 50.0) {
                schoolLevel = "(10th & 12th grade)";
            } else if (score < 50.0 && score >= 30.0) {
                schoolLevel = "(College)";
            } else if (score < 30.0 && score >= 0.0) {
                schoolLevel = "(College Graduate)";
            } else {
                schoolLevel = null;
            }

            //Printing the final score and grade level.
            System.out.println("The passage has the following scores:-");
            System.out.println("      Flesch reading ease:              " + decformat.format(score) + " " + schoolLevel);
            gradeLevel = ((0.39 * wordCount) / sentenceCount) + ((11.8 * syllableCount) / wordCount) - (15.59);
            System.out.println("      Flesch-Kincaid grade level:       " + decformat.format(gradeLevel));
        } else {
            System.out.println("File not found.");
        }

    }

}
