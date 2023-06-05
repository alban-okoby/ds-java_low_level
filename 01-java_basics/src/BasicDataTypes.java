
public class BasicDataTypes {
    public static void main(String[] args) {

        // Java Basics and Literals example and explanation 👇👇
        /**
         * @byte
         * A byte is a unit of data storage
         * that typically represents 8 bits. It is the fundamental
         * unit of storage in computer systems, and it can hold a range
         * of values from 0 to 255 (unsigned) or -128 to 127 (signed).
         */
        // For example
        byte a = 68; // declares a variable "a" of type "byte" which store 68.
        System.out.println(a); // 68

        /**
         * @char It is a data type used to represent a single character in
         * a character set such as letters, digits, symbols, or whitespace.
         */
        // For example,
        // declare a variable "b" of type "char" which store 'B'
        char b = 'B';
        char myUnicode = '\u0001'; // declare a variable "myUnicode" of type "char" which store '\u0001'
        // SHO THE RESULTCIN CONSOLE
        System.out.println(b); // B
        System.out.println(myUnicode); // \u0001


        /**
         * "boolean" s a data type that represents a logical value. It is used to indicate whether a condition
         * is true or false. In Java, the "boolean" data type is a primitive type that can have one
         * of two values: true or false.
         */
        // For example, declare a variable "c" of type "boolean" which store "true"
        boolean javaIsStrong = true;
        System.out.println(javaIsStrong); // true


        /**
         * "byte" is a data type used to represent integer values that require a smaller range than what can be
         * accommodated by the "int" data type. In Java, the "byte" data type is a 8-bit signed integer.
         *
         * The range of values that can be represented by a "byte" variable in Java is approximately
         * from -128 to 127. This range is narrower compared to the "int" data type, which allows
         * "byte" to store smaller integer values.
         */
        // For example declare a variable "number0" of type "byte" which store "5"
        byte number0 = 5; //
        System.out.println(number0); // 5


        /**
         * "short" is a data type used to represent integer values that require a smaller range than what can be
         * accommodated by the "int" data type. In Java, the "short" data type is a 16-bit signed integer.
         *
         * The range of values that can be represented by a "short" variable in Java is approximately
         * from -32,768 to 32,767. This range is narrower compared to the "int" data type, which allows
         * "short" to store smaller integer values.
         */
        // For example declare a variable "number0" of type "short" which store "5"
        short myShortNumber = 5; //
        System.out.println(myShortNumber); // 5


        /**
         * The "int" data type is commonly used for representing and performing calculations with whole numbers.
         * The range of values that can be represented by an "int" variable in Java is approximately from
         * -2,147,483,648 to 2,147,483,647. This range is determined by the size of the data type,
         * which is 32 bits or 4 bytes.
         */
        // For exemple
        int number1 = 14; // declare a variable "number1" of type "int" which store "14"
        int octal = 0144; // declare a variable "octal" of type "int" which store "0144"
        int hex = 0x64; // declare a variable "hex" of type "int" which store "0x64"
        // SHO THE RESULT IN CONSOLE
        System.out.println(octal); // 100
        System.out.println(hex); // 100


        /**
         * The ""long" is a data type used to represent integer values that require a larger range than what can be
         * accommodated by the "int" data type. In Java, the "long" data type is a 64-bit signed integer.
         *
         * The range of values that can be represented by a "long" variable in Java is approximately
         * from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. This expanded range allows "long" to store
         * larger integer values compared to the "int" data type
         */
        // For exemple
        long number2 = 1555555555; // declare a variable "number2" of type "long" which store "15"
        System.out.println(number2); // 1555555555


        /**
         The "float" data type is commonly used when you need to represent numbers with a fractional part
         in Java is a 32-bit value that conforms to the IEEE 754 floating-point standard
         */
        // For example
        float myFloat = 8.4f; // declare a variable "number3" of which decimal
        System.out.println(myFloat); //


        /**
         * The "double" data type is commonly used when you need to represent numbers with a fractional part
         * in Java is a 64-bit value that conforms to the IEEE 754 floating-point standard
         */
        // For example
        double cote = 8.44444; // declare a variable "number3" of which decimal
        System.out.println(cote); // 8.44444


        /**
         * "String" is a data type used to represent a sequence of characters.
         * In Java, the "String" class is provided as a built-in class to handle textual data
         */
        // For example
        String anotherUnicode = "\u0001"; // declare a variable "anotherUnicode" of type "string" which store "\u0001"
        System.out.println(anotherUnicode); // \u0001
    }

    // GREAT JOB !,  HAPPY CODIND <\🚀> ..
}
