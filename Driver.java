import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


// REMINDER FOR SELF FIGURE OUT HOW TO INCREASE THE SIZE OF AN ARRAY LIST
// Also, leave comments prior to submission

public class Driver {

    public static void main(String[] args) {

        Scanner fileData = null;
        String fileName = "fractions.txt";


        try{
            fileData =
            new Scanner(new FileInputStream(fileName));
            System.out.println("File found");
        }
        catch (FileNotFoundException e) {
            System.out.println("error");
            e.printStackTrace();
        }

        ObjectList uniqueList = new ObjectList();

        while (fileData.hasNext()) {
            String tempHolder1;
            String[] tempArray1 = new String [1]; 
            Fraction tempFraction1;
            int ifUniqueTracker = 0;

            tempHolder1 = fileData.next();
            tempArray1 = tempHolder1.split("/");

            tempFraction1 = new Fraction(Integer.parseInt(tempArray1[0]), Integer.parseInt(tempArray1[1]));
            tempFraction1 = tempFraction1.asFraction(tempFraction1.getNumerator(), tempFraction1.getDenominator());

            if ( tempFraction1.getNumerator() == 0 || tempFraction1.getDenominator() == 0 ) {
                ifUniqueTracker = -1;
            } else {
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
            for (int i = 0; i <  uniqueList.getNumElements(); i++) {
                int currentNumElm = uniqueList.getNumElements();
                FractionCounter uniqueTempFraction2 =  (FractionCounter) uniqueList.get(i);
                if (uniqueTempFraction2.compareAndIncrement(tempFraction1)) {
                    i = uniqueList.getNumElements();
                    ifUniqueTracker++;
                } 
            }

        if (ifUniqueTracker == 0) {
            FractionCounter uniqueCounter = new FractionCounter(tempFraction1);
            uniqueCounter.setTheCounter(1);
            uniqueList.add(uniqueCounter);
        }

    }
        }
        for (int i = 0; i < uniqueList.getNumElements(); i++) {
            System.out.println("Final results for index " + i + ": " + uniqueList.get(i));
        }
      
       
    }
    
}
