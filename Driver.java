
/*
Name: Danny Roubin
Class: CSS 143 Sec B
Assignment: Fractions V2

Purpose of this file/class is simply to be the driver.
it handles taking in data and using methods from other classes to sort through the data

*NOTE FOR GRADER* -This program assumes that the name of the file it is reading is fractions.txt
If you will be using a file with a different name please change the string titled fileName
which is the second line in the main method to match the file name of your choice.

-Another note here, I created this program with the intent of discarding any fractions which had 0 as
the value in either the numerator or the denominator, therefore any fractions with 0 in either position
will be ignored. Note about negative fractions, they are no longer negative but instead positive.
I made this change since I was unable to figure out where the intended result of -1/4 would be for this project
*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Driver {

    public static void main(String[] args) {
        Scanner fileData = null;
        String fileName = "fractions.txt";

        // simple try catch to receive the file
        try{
            fileData =
            new Scanner(new FileInputStream(fileName));
            System.out.println("File found");
        }
        catch (FileNotFoundException e) {
            System.out.println("error");
            e.printStackTrace();
        }

        // Creating an instance of objectList to serve the purpose of keeping track of unique fractions, hence the name, uniqueList
        ObjectList uniqueList = new ObjectList(15);

        // will loop as long as there is more data in the file
        while (fileData.hasNext()) {
            String tempHolder1;
            String[] tempArray1 = new String [1]; 
            Fraction tempFraction1;
            int ifUniqueTracker = 0;

            tempHolder1 = fileData.next();
            // setting the result of the split into this temp array
            // index 0 of the array holds the numerator and index 1 holds the denominator
            tempArray1 = tempHolder1.split("/");

            // creates a new fraction using the parsed num and den and immediately reduces it using the asFraction method
            // Note this fraction here will be the one tested across every fraction inside of the uniqueList array
            tempFraction1 = new Fraction(Integer.parseInt(tempArray1[0]), Integer.parseInt(tempArray1[1]));
            tempFraction1 = tempFraction1.asFraction(tempFraction1.getNumerator(), tempFraction1.getDenominator());

            // if there is a 0 in either slot set the tracker to -1 
            if ( tempFraction1.getNumerator() == 0 || tempFraction1.getDenominator() == 0 ) {
                // setting this to -1 just means that it's not = 0 which is my requirement for it to become a unique
                ifUniqueTracker = -1;
            } else {
                // checks if either num or den is negative, if it is it just makes it positive
                if ( tempFraction1.getNumerator() < 0 ) {
                    int fixer = tempFraction1.getNumerator();
                    fixer = (fixer *-1);
                    tempFraction1.setNumerator(fixer);
                } else if (tempFraction1.getDenominator() < 0) {
                    int fixer = tempFraction1.getDenominator();
                    fixer = (fixer *-1);
                    tempFraction1.setDenominator(fixer);
                } else if (tempFraction1.getNumerator() < 0 && tempFraction1.getDenominator() < 0) {
                    int fixer = tempFraction1.getNumerator();
                    fixer = (fixer *-1);
                    tempFraction1.setNumerator(fixer);
                    int fixer2 = tempFraction1.getDenominator();
                    fixer2 = (fixer2 *-1);
                    tempFraction1.setDenominator(fixer2);
                }
                // loop runs through comparing the fixed fraction across every fraction in the uniqueList array
            for (int i = 0; i <  uniqueList.getNumElements(); i++) {
                FractionCounter uniqueTempFraction2 =  (FractionCounter) uniqueList.get(i);
                // if it is not unique, increase ifUniqueTracker so we know not to register it
                if (uniqueTempFraction2.compareAndIncrement(tempFraction1)) {
                    i = uniqueList.getNumElements();
                    ifUniqueTracker++;
                } 
            }
            // if fraction came out clean add it to the list
        if (ifUniqueTracker == 0) {
            uniqueList.lengthCheck();
            FractionCounter uniqueCounter = new FractionCounter(tempFraction1);
            uniqueCounter.setTheCounter(1);
            uniqueList.add(uniqueCounter);
        }

    }
    // for loop to print results
        }
        for (int i = 0; i < uniqueList.getNumElements(); i++) {
            System.out.println("Final results for index " + i + ": " + uniqueList.get(i));
        }
      
       
    }
    
}
