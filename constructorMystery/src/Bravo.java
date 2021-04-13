public class Bravo extends Alpha {
    public Bravo(String x) {
        System.out.println("Bravo(" + x + ")");
    }

    public Bravo(int i) {
        super(i);
        System.out.println("Bravo(" + i + ")");
    }
}
