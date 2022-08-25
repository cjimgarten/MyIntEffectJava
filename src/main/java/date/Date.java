package date;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (Date.isInvalidDate(day, month, year)) {
            throw new IllegalArgumentException("invalid date");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if (Date.isInvalidDate(day, month, year)) {
            throw new IllegalArgumentException("invalid day");
        }
        this.day = day;
    }

    public void setMonth(int month) {
        if (Date.isInvalidDate(day, month, year)) {
            throw new IllegalArgumentException("invalid month");
        }
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static boolean isInvalidDate(int day, int month, int year) {
        return day < 1 || day > 31 || month < 1 || month > 12;
    }

    public String toString() {
        return "day:"+day+", month:"+month+", year:"+year;
    }
}

class Main {
    public static void main(String[] args) {
        Date d1 = new Date(1, 10, 2022);
        d1.setDay(1);
        d1.setMonth(7);
        System.out.println(d1);
    }
}
