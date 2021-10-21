package Fractions_V2;

/*
This objectlist class serves the purpose of being a generic object list
*/
public class ObjectList {

    private int numElements = 0;
    private int arrayLength;
    private Object[] obj;

    // constructor which sets the size of the object
    ObjectList(int size) {
        arrayLength = size;
        obj = new Object[size];
    }

    // add method to add a new object to the list
    public void add(Object fraction) {
        obj[numElements++] = fraction;
    }

    // get method to return the object at the given index
    public Object get(int index) {
        return obj[index];
    }


    // toString method to print out the entire ObjectList
    @Override
    public String toString() {
        String retVal = "";
        for(int i = 0; i < numElements; i++) {
            retVal += obj[i];
            retVal += " ";
            
        }
        return retVal;
    }

    // method to check if list is almost out of space
    public void lengthCheck() {
        if (obj[obj.length -1] != null) {
            Object[] newObj = new Object[(obj.length * 2)];
            for (int i = 0; i < numElements; i++) {
                newObj[i] = obj[i];
            }
            System.out.println("WE making a new one!");
            this.obj = newObj; 
        } else {
        }

    }
    
    // gets numElements
    public int getNumElements() {
        return this.numElements;
    }
    
    // gets ArrayLength
    public int getArrayLength() {
        return this.arrayLength;
    }


}
