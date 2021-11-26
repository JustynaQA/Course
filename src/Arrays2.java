public class Arrays2 {
    public static void main(String[] args) {
        float[] theVals = new float[4];
        theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[2] = 15.0f;
        theVals[3] = 5.0f;

        float buba = 0.0f;

        for (int index = 0; index < theVals.length; index++) {
            if (theVals[index] > buba) {
                buba = theVals[index];
            }
            System.out.println("Buba: " +buba);
        }
        System.out.println(buba);

        float[] theVals2 = {10.f, 20.0f, 15.0f, 5.0f};


    }
}
