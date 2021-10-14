// stores reference to a fraction object and counts how many duplicates it has
public class FractionCounter {
    
    Fraction theFraction;
    int theCounter;

    FractionCounter(Fraction tf) {
        theFraction = tf;
    }

    boolean compareAndIncrement(Fraction newFraction) {
        if (newFraction.getNumerator() == theFraction.getNumerator() && newFraction.getDenominator() == theFraction.getDenominator()) {
            theCounter++;
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "{" +
            " theFraction='" + this.theFraction + "'" +
            ", theCounter='" + this.theCounter + "'" +
            "}";
    }


    public Fraction getTheFraction() {
        return this.theFraction;
    }


    public int getTheCounter() {
        return this.theCounter;
    }
   
    public void setTheCounter(int theCounter) {
        this.theCounter = theCounter;
    }


}
