public class Main {
    public static void main(String[] args) {
        CalendarDate d1 = new CalendarDate(1969, 7, 21);
        CalendarDate d2 = new CalendarDate(1980, 11, 4);

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(d1.compareTo(d2));
    }
}