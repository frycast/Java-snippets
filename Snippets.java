/*
Useful resources:
* https://www.w3schools.com/java/
*/

// %% Data types and casting
class S1 {
    void m1() {

        // Primitive data types (can be null)
        // Start with lower case letters
        boolean b = true;   // 1/8 (1 bit)
        char c = 'D';       // 2 char
        float w = 35e3f;    // 4 fp [3.4e−038, 3.4e+038] about 6 or 7 digit precision
        double d = 5.99d;   // 8 fp [1.7e−308, 1.7e+308] about 15 digit precision
        byte e = 1;         // 1 int [-128,127] [-2^(n-1) - 1, 2^(n-1) - 1]
        short s = 1;        // 2 int [-32768, 32767]
        int x = 15;         // 4 int [-2147483648, 2147483647]
        long f = 1L;        // 8 int [-9223372036854775808, 9223372036854775807]

        // Non-primitive data type (reference types) (cannot be null)
        // Start with upper case letters
        // Reference types all have the same size
        // Includes Arrays, Classes, Interfaces etc
        String name = "John"; // The only reference type defined by Java
        
        // other use
        final int z = 12; // cannot assign z = something
        int y;
        y = 10;
        x = 5;

        // Widening (automatic) casting
        // byte -> short -> char -> int -> long -> float -> double
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        // Narrowing (manual) casting
        // double -> float -> long -> int -> char -> short -> byte
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9

        System.out.println(name);
        System.out.println(x+y+z+w+d+e+s+f);
        System.out.println(b);
        System.out.println(c);


    }
}

// %% Operators
class S2 {
    void m1() {

        // Addition operator
        int x = 1, y = 1;
        String w = "a", z = "a";
        System.out.println( "x + y = " + (x+y) );
        System.out.println( "w + z = " + (w+z) );
        
        //Arithmetic operators +,-,*,/,%,++,--
        //Assignment operators =,+=,-=,*=,/=,%=,&=,|=,^=,>>=,<<=
        //Comparison operators ==,!=,>,<,>=,<=
        //Logical operators &&,||,!
        //Bitwise operators &,|,~,^,<<,>>,>>>

    }
}

