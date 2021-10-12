public class Driver {

    public static void main(String[] args) {
        Fraction firstFraction = new Fraction();
        firstFraction.setNumerator(1);
        firstFraction.setDenominator(2);
        Fraction secondFraction = new Fraction();
        secondFraction.setNumerator(1);
        secondFraction.setDenominator(2);
        System.out.println("Printing the first fraction: " + firstFraction.toString());


        FractionCounter firstFractionFC = new FractionCounter(firstFraction);

        if (firstFractionFC.compareAndIncrement(secondFraction) == true) {
            System.out.println("yup it worked");
        } else {
            System.out.println("Nope");
        }

    }
    
}
