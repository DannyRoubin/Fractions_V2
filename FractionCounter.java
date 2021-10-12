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

}
