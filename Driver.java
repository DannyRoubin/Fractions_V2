import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


// REMINDER FOR SELF FIGURE OUT HOW TO INCREASE THE SIZE OF AN ARRAY LIST

public class Driver {

    public static void main(String[] args) {
        // Fraction firstFraction = new Fraction();
        // firstFraction.setNumerator(1);
        // firstFraction.setDenominator(2);
        // Fraction secondFraction = new Fraction();
        // secondFraction.setNumerator(1);
        // secondFraction.setDenominator(2);
        // System.out.println("Printing the first fraction: " + firstFraction.toString());


        // FractionCounter firstFractionFC = new FractionCounter(firstFraction);

        // if (firstFractionFC.compareAndIncrement(secondFraction) == true) {
        //     System.out.println("yup it worked");
        // } else {
        //     System.out.println("Nope");
        // }

        Scanner fileData = null;
        String fileName = "data.txt";


        try{
            fileData =
            new Scanner(new FileInputStream(fileName));
            System.out.println("File found");
        }
        catch (FileNotFoundException e) {
            System.out.println("error");
            e.printStackTrace();
        }

        FractionList uniqueList = new FractionList();
        // uniqueList.add(fileData.next());
        // System.out.println(uniqueList.toString());
        int indexTracker = 0;
        String tempHolder;
        String[] tempArray2 = new String[1];

        while (fileData.hasNext()) {
            FractionList tempArray = new FractionList();
            tempHolder = fileData.next();
            tempArray2 = tempHolder.split("/");
            System.out.println(tempArray2[0]);
            System.out.println(tempArray2[1]);
            Fraction tempFraction = new Fraction(Integer.parseInt(tempArray2[0]), Integer.parseInt(tempArray2[1]));
            if (indexTracker == 0) {
                uniqueList.add(tempFraction.asFraction(tempFraction.getNumerator(), tempFraction.getDenominator()));
                System.out.println(uniqueList.toString());
            } else {
                // tempFraction()
            }
            indexTracker++;
            // tempArray.add(tempHolder.split("/"));
            // System.out.println(tempArray.toString());
            // Fraction fraction1 = new Fraction()
        }
        





    }
    
}
