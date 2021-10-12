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