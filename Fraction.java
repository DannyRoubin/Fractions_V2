// This class will reduce and store incoming fractions

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {

    }

    public Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

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
public int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
}

public Fraction asFraction(int a, int b) {
    int gcd = gcd(a, b);
    Fraction tempFrac = new Fraction( (a / gcd) , (b / gcd));
    return tempFrac;
}


    @Override
    public String toString() {
        return "{" +
            " numerator='" + getNumerator() + "'" +
            ", denominator='" + getDenominator() + "'" +
            "}";
    }





    public int getNumerator() {
        return this.numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }




}