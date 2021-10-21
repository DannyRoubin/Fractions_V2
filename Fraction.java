
/*
This Fraction class serves the purpose of creating fraction objects which are compiled of two ints, a numerator and a denominator.
*/
public class Fraction {
    private int numerator;
    private int denominator;

    // empty constructor for a fraction
    public Fraction() {

    }

    // constructor for the fraction 
    public Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

    // Equal method to compare this current fraction against another fraction.
    public boolean equals(Fraction other) {
        if (this.numerator == other.numerator && this.denominator == other.denominator) {
            return true;
        } else {
            return false;
        }

    }

    // GCD and asFraction methods were created by stackoverflow user "Bohemian". Link to post with his answer (He is the top reply): https://stackoverflow.com/questions/6618994/simplifying-fractions-in-java
    // minor edits made to fit my program

    /** @return the greatest common denominator */
    // helper method for asFraction which returns the greatest common denominator
    public int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
    }

    // returns a new fraction that is reduced
    public Fraction asFraction(int a, int b) {
    int gcd = gcd(a, b);
    Fraction tempFrac = new Fraction( (a / gcd) , (b / gcd));
    return tempFrac;
    }

    // toString method to print out the numerator and denominator
    @Override
    public String toString() {
        return "{" +
            " numerator='" + getNumerator() + "'" +
            ", denominator='" + getDenominator() + "'" +
            "}";
    }

    // get method for numerator
    public int getNumerator() {
        return this.numerator;
    }

    // setter for numerator
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    // getter for denominator
    public int getDenominator() {
        return this.denominator;
    }

    // setter for denominator
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}