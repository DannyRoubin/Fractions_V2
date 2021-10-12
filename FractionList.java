public class FractionList {

    private int numElements = 0;
    private Object[] myshapes = new Object[100];

    public void add(Object shape) {
        myshapes[numElements++] = shape;
    }

    @Override
    public String toString() {
        String retVal = "";
        for(int i = 0; i < numElements; i++) {
            retVal += myshapes[i];
            System.out.println("");
        }
        return retVal;
    }


    //main goes here from the lab
    public static void main(String[] args) { 
    //    IntList a = new IntList();
    //    a.add(95); a.add(100); a.add(58);
    //    System.out.println(a.toString() );
    //    System.out.println(a.sum() );
    //    System.out.println(a.indexOf(99)); //uncomment these to work on next
    //    System.out.println(a.indexOf(20));
       // System.out.println(a.save() );
   }
}

