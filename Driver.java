import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


// REMINDER FOR SELF FIGURE OUT HOW TO INCREASE THE SIZE OF AN ARRAY LIST
// Figure out how to properly handle negative and 0 values in fractions
// Figure out how to use fraction counter
// Also, leave comments prior to submission

public class Driver {

    public static void main(String[] args) {

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

        ObjectList uniqueList = new ObjectList();

        while (fileData.hasNext()) {
            String tempHolder1;
            String[] tempArray1 = new String [1]; 
            Fraction tempFraction1;

            tempHolder1 = fileData.next();
            tempArray1 = tempHolder1.split("/");

            tempFraction1 = new Fraction(Integer.parseInt(tempArray1[0]), Integer.parseInt(tempArray1[1]));
            tempFraction1 = tempFraction1.asFraction(tempFraction1.getNumerator(), tempFraction1.getDenominator());
            System.out.println("tempFraction1 numerator = " + tempFraction1.getNumerator());
            System.out.println("tempFraction1 denominator = " + tempFraction1.getDenominator());

            if ( tempFraction1.getNumerator() == 0 || tempFraction1.getDenominator() == 0 ) {
                System.out.println("Get kicked ");
            } else {
            System.out.println("Temp frac 1 = " + tempFraction1.toString());

            for (int i = 0; i <  uniqueList.getNumElements(); i++) {
                int currentNumElm = uniqueList.getNumElements();
                System.out.println(" The current i index is " + i );
                System.out.println(" The current getNumElement is " + uniqueList.getNumElements() );
                FractionCounter uniqueTempFraction2 =  (FractionCounter) uniqueList.get(i);
                System.out.println("Current unique list fraction " + uniqueTempFraction2);
                if (uniqueTempFraction2.compareAndIncrement(tempFraction1)) {
                    i = uniqueList.getNumElements();
                    System.out.println("Exiting the for loop due to copy");
                // } else if (uniqueTempFraction2.compareAndIncrement(tempFraction1) == false &&  uniqueList.getNumElements() == 2 ) {
                //     i++;
                // } else if (uniqueTempFraction2.compareAndIncrement(tempFraction1) == false &&  uniqueList.getNumElements() == 2 && i ==1) {
                //     FractionCounter uniqueCounter = new FractionCounter(tempFraction1);
                //     uniqueCounter.setTheCounter(1);
                //     uniqueList.add(uniqueCounter);
                //     System.out.println("Exiting the for loop due to new unique");
                //     i = uniqueList.getNumElements();
                // } else if (uniqueTempFraction2.compareAndIncrement(tempFraction1) == false &&  ( (i + 2) - (uniqueList.getNumElements()) != 1 ) &&  uniqueList.getNumElements() != 2  ) {
                //     i++;
            } else if (uniqueTempFraction2.compareAndIncrement(tempFraction1) == false &&  uniqueList.get(currentNumElm + 1) != null ) {
                System.out.println("In new loop");
                i++;
                } else {
                    FractionCounter uniqueCounter = new FractionCounter(tempFraction1);
                    uniqueCounter.setTheCounter(1);
                    uniqueList.add(uniqueCounter);
                    System.out.println("Exiting the for loop due to new unique");
                    i = uniqueList.getNumElements();
                }
            }
            System.out.println("Leaving for loop");

            if (uniqueList.getNumElements() == 0 ) {
                        FractionCounter uniqueCounter = new FractionCounter(tempFraction1);
                        uniqueCounter.setTheCounter(1);
                        uniqueList.add(uniqueCounter);
                        System.out.println("Here is the uniquelist to string and it should only show a single value" + uniqueList.toString());
                    }
                }

            
        }
        for (int i = 0; i < uniqueList.getNumElements(); i++) {
            System.out.println("Final results for index " + i + ": " + uniqueList.get(i));
        }
      
       
        // while (fileData.hasNext()) {
        //     String tempHolder1; 
        //     String[] tempArray1 = new String[1];
        //     Object tempHolder2;
        //     String tempHolder3;
        //     String[] tempArray2 = new String[1];
        //     int whileLoopCounter = 0;
        //     tempHolder1 = fileData.next();
        //     tempArray1 = tempHolder1.split("/");
        //     System.out.println("Running up numerator " + tempArray1[0]);
        //     System.out.println("Running up denominator " + tempArray1[1]);
        //     Fraction tempFraction = new Fraction(Integer.parseInt(tempArray1[0]), Integer.parseInt(tempArray1[1]));
        //     tempHolder1 = tempFraction.asFraction(tempFraction.getNumerator(), tempFraction.getDenominator());
        //     // if this is the first fraction then it is automatically unique, so we add it to the list
        //     if (indexTracker == 0) {
        //         FractionCounter uniqueCounter = new FractionCounter(tempFraction);
        //         uniqueList.add(uniqueCounter);
        //         // System.out.println("Here is the uniquelist to string and it should only show a single value" + uniqueList.toString());
        //     } else {
                
        //         while(whileLoopCounter < uniqueList.getNumElements()) {
        //             tempHolder2 = uniqueList.get(whileLoopCounter);
        //             System.out.println("Temp holder 2, which is what gets the next fraction from the unique list has the value of: " + tempHolder2);
        //             Fraction uniqueTempFraction = new Fraction(Integer.parseInt(tempArray2[0]), Integer.parseInt(tempArray2[1]));
        //             tempHolder3 = uniqueTempFraction.asFraction(uniqueTempFraction.getNumerator(), uniqueTempFraction.getDenominator());
        //             tempArray2 = tempHolder3.split("/");
        //             Fraction uniqueTempFraction2 = new Fraction(Integer.parseInt(tempArray2[0]), Integer.parseInt(tempArray2[1]));

        //             System.out.println("The following is temp holder1 " + tempHolder1);
        //             System.out.println("The following is tempholder3 " + tempHolder3);
        //             System.out.println("the previous two values are equal: " +tempHolder1.equals(tempHolder3) );


        //             for (int i = 0; i < uniqueList.getNumElements(); i++) {
        //                 FractionCounter uniqueTempFraction3 = (FractionCounter) uniqueList.get(i);
                        

        //                 if (uniqueTempFraction3.compareAndIncrement(uniqueTempFraction));
        //             }
                    

                    // if (tempHolder1.equals(tempHolder3)) {
                    //     uniqueArrayCounter[whileLoopCounter]++;
                    //     whileLoopCounter = uniqueList.getNumElements();
                    // } else if (tempHolder1.equals(tempHolder3) == false && ( (whileLoopCounter + 2) - (uniqueList.getNumElements()) != 1 ) ) {
                    //     whileLoopCounter++;
                    // } else {
                    //     uniqueList.add(tempFraction.asFraction(tempFraction.getNumerator(), tempFraction.getDenominator()));
                    //     uniqueArrayCounter[whileLoopCounter + 2]++;
                    //     System.out.println("here is my new addition to the unique list" + uniqueList.get(0));
                    //     whileLoopCounter = uniqueList.getNumElements();
                    // }
                // }
            // }
            // System.out.println(uniqueList.toString());
            // indexTracker++;
        // }
        
        // for (int i = 0; i < uniqueList.getNumElements(); i++) {
        //     System.out.println(uniqueList.get(i) + " has " + uniqueArrayCounter[i] + " occurences");
        //     // FractionCounter fc = (FractionCounter) uniqueList.get(i);
        // }





    }
    
}
