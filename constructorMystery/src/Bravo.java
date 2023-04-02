public class Bravo extends Alpha {
    /*
    This constructor does NOT explicitly call a parent constructor
    so the DEFAULT parent constructor will be called
     */
    public Bravo(String x)
    {
        System.out.println("Bravo(" + x + ")");
    }

    /*
    This constructor explicitly calls the parent constructor having an integer parameter
     */
    public Bravo(int i) {
        super(i);
        System.out.println("Bravo(" + i + ")");
    }
}
