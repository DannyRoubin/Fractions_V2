public class FractionList {

    private int numElements = 0;
    private int arrayLength = 100;
    private Object[] aFraction = new Object[arrayLength];

    public void add(Object shape) {
        aFraction[numElements++] = shape;
    }

    @Override
    public String toString() {
        String retVal = "";
        for(int i = 0; i < numElements; i++) {
            retVal += aFraction[i];
            System.out.println("");
        }
        return retVal;
    }

    public void lengthCheck(Object[] aFraction) {
        if (aFraction[arrayLength] != null) {
            arrayLength += 50;
        } 

    }


}

