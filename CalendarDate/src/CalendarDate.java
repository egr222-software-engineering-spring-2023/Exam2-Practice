public class CalendarDate implements Comparable<CalendarDate> {
    private int year;
    private int month;
    private int day;

    public CalendarDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }

    public String toString() {
        return year + "/" + String.format("%02d", month) + "/" + String.format("%02d", day);
    }

    @Override
    public int compareTo(CalendarDate o) {
        if (year == o.year) {           // can use == because year is an integer (which is a primitive)
            if (month == o.month) {
                return day - o.day;
            } else {
                return month - o.month;
            }
        }
        else {
            return year - o.year;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o.getClass() == getClass()) {      // first we must confirm that the object is NOT NULL AND that the object is the expected class
            CalendarDate other = (CalendarDate) o;          // cast the object to the expected class
            return year == other.year && month == other.month && day == other.day;  // use Boolean Zen to return TRUE if equals; FALSE otherwise
        }
        else {
            return false;   // we only reach this point if the object is either NULL or not the expected type (so return FALSE)
        }
    }

//    The implementation below is a "flawed" implementation of equals because it behaves incorrectly if the class is extended to child classes
//    (See PowerPoint from 10/21/2021)

//    @Override
//    public boolean equals(Object o) {
//        if (o instanceof CalendarDate) {
//            CalendarDate other = (CalendarDate) o;
//            return year == other.year && month == other.month && day == other.day;
//        }
//        else {
//            return false;
//        }
//     }
}