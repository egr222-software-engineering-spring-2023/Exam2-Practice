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
        Alpha x = new Alpha(i);
//        Alpha y = new Bravo();
//        Alpha z = new Bravo("z");
        Alpha p = new Bravo(1);
    }
}