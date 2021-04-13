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
        if (year == o.year) {
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
        if (o != null && o.getClass() == getClass()) {
            CalendarDate other = (CalendarDate) o;
            return year == other.year && month == other.month && day == other.day;
        }
        else {
            return false;
        }
    }

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