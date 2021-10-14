public class ObjectList {

    private int numElements = 0;
    private int arrayLength = 100;
    private Object[] aFraction = new Object[arrayLength];

    public void add(Object fraction) {
        aFraction[numElements++] = fraction;
    }


    public Object get(int index) {
        return aFraction[index];
    }



    @Override
    public String toString() {
        String retVal = "";
        for(int i = 0; i < numElements; i++) {
            retVal += aFraction[i];
            retVal += " ";
            
        }
        return retVal;
    }

    public boolean lengthCheck(Object[] aFraction) {
        if (aFraction[arrayLength] != null) {
            return true;
        } else {
            return false;
        }

    }

    public int getNumElements() {
        return this.numElements;
    }

    public int getArrayLength() {
        return this.arrayLength;
    }


}
