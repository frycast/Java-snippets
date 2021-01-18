/*
Useful resources:
* https://www.w3schools.com/java/
*/

class S {
    void m1() {
        System.out.println("S initialising");
    }
}

// %% Data types and casting
class S1 extends S {
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
class S2 extends S {
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

// %% String methods
class S3 extends S {
    void m1() {
        String txt = "Hello World";
        String txt2 = "!";
        System.out.println(txt.toUpperCase());  
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("World"));
        System.out.println(txt.concat(txt2));
        System.out.println("\\ It\'s some \"quotations\" \\");
    }
}

// %% Math
class S4 extends S {
    void m1() {
        Math.max(5, 10);
        Math.min(5, 10);
        Math.sqrt(64);
        Math.abs(-4.7);
        Math.random(); // In [0.0, 1.0)
        int r = (int)(Math.random() * 101);  // from 0 to 100
        System.out.println("Random number = " + r);
    }
}

// %% Conditionals
class S5 extends S {
    void m1() {
        // if statement
        System.out.println("if statement");
        int time = 17;
        if (time < 10) {
            System.out.println("Good morning");
        } else if (time < 20) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }

        // ternary operator
        System.out.println("ternary operator");
        String result = (time < 18) ? "Good day" : "Good evening";
        System.out.println(result);

        // switch block
        System.out.println("switch block");
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Another day");
        }

        // while loop
        System.out.println("while loop");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // do while loop
        System.out.println("do while loop");
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        // for loop
        System.out.println("for loop");
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }

        // for-each loop
        System.out.println("for each loop");
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String k : cars) {
            System.out.println(k);
        }

        // break out of a loop
        System.out.println("Break out of for loop");
        for (int k = 0; k < 10; k++) {
            if (k == 4) {
                break;
            }
            System.out.println(k);
        }

        // continue to skip rest of loop
        System.out.println("Continue in for loop");
        for (int k = 0; k < 10; k++) {
            if (k == 4) {
              continue; // doesn't print 4
            }
            System.out.println(k);
        }
    }
}

// %% Arrays
class S6 extends S {
    void m1() {
        // This can only be done at initialisation
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println(cars[0]);
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println("Array length = " + cars.length);
        System.out.println("Print 1D array with for");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("Print 1D array with for-each");
        for (String i : cars) {
            System.out.println(i);
        }

        // Multidimensional (jagged) arrays (not matrices)
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7
        System.out.println("Print 2D array with for");
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
              System.out.println(myNumbers[i][j]);
            }
        }
        System.out.println("Print 2D array with for-each");
        for (int[] row : myNumbers) {
            for ( int ij : row ) {
                System.out.println(ij);
            }
        }
    }
}

// %% Method overloading 
// https://www.w3schools.com/java/java_methods_overloading.asp
class S7 extends S {
    void m1() {
    }
}
