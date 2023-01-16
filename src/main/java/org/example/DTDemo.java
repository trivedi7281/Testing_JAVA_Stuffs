package org.example;

public class DTDemo {
    public static void main(String[] args) {
        //Primitive Data Types
        /*
         * 1. byte  - 8 bit
         * 2. short - 16 bit
         * 3. int - 32bit - Stores whole number from -2^31 to 2^31
         * 4. long - 64 bit
         * 5. float - 32 bit
         * 6. double 64 bit
         * 7. boolean or bool
         * 8. char
         * */

        //NonPrimitive Data type
        /*
         *1. String - 32 bit
         * 2. Array - 64 bit
         */

        int myInt = -10;
        byte bt = -128;
        short sh = 1234;
        long lng = 7657378L;

        float fl = 1.238888f;
        double db = 1.111111;

        boolean bool = false; // boolean is just used while we are creating any conditions.
        char c = 'a';
        String str = "a";

        DTDemo dt = new DTDemo();
        String stri  = new String(); // String Object
        stri = "ABCD";
        String stre = "testing"; // String Literal
        System.out.println(stre);
        System.out.println(stri);
    }
}
