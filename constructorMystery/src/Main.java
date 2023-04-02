/*
    Points to make
    1.  Show how instantiating using a default child constructor will NOT use (inherit) the super default constructor
        UNLESS there is a default constructor in the child (even if the static type is the super class) - uncomment line 14
    2.  Show how a child class WILL call the default constructor of the super if no explicit call to a super constructor is made - uncomment line 15
    3.  Show how the super class constructor MUST be called first in a child constructor - try to move line 7 in Bravo.java

 */

public class Main {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("instantiating a new Alpha(i)");
        Alpha x = new Alpha(i); // Static type of Alpha; using the constructor having an integer parameter

//        System.out.println();
//        System.out.println("instantiating a new Bravo() - compile time error");
//        Alpha y = new Bravo();  // The Bravo class does NOT have a default constructor so this generates a compile time error

        System.out.println();
        System.out.println("instantiating a new Bravo(\"z\")");
        Alpha z = new Bravo("z");   // The Bravo constructor having a String parameter does NOT explicitly call a parent constructor so the default constructor will be called

        System.out.println();
        System.out.println("instantiating a new Bravo(1)");
        Alpha p = new Bravo(1); // The Bravo constructor having an integer parameter DOES explicitly call the parent constructor having an integer parameter so the parent default constructor is NOT used
    }
}