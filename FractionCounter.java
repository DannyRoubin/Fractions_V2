
/*
This objectlist class serves the purpose of storing fraction objects and counting how many duplicates it has
*/
public class FractionCounter {
    
    Fraction theFraction;
    int theCounter;

    // constructor which creates theFraction
    FractionCounter(Fraction tf) {
        theFraction = tf;
    }

    // compares the current fraction against another one. If it comes out to be a duplicate, increase count for this fraction
    boolean compareAndIncrement(Fraction newFraction) {
        if (newFraction.getNumerator() == theFraction.getNumerator() && newFraction.getDenominator() == theFraction.getDenominator()) {
            theCounter++;
            return true;
        } else {
            return false;
        }
    }


    // toString method to print out the fraction and counter
    @Override
    public String toString() {
        return "{" +
            " theFraction='" + this.theFraction + "'" +
            ", theCounter='" + this.theCounter + "'" +
            "}";
    }


    // get method for the fraction
    public Fraction getTheFraction() {
        return this.theFraction;
    }


    // get method for the counter
    public int getTheCounter() {
        return this.theCounter;
    }
   
    // setter for the counter
    public void setTheCounter(int theCounter) {
        this.theCounter = theCounter;
    }


}
