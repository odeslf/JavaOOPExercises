public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    @Override
    public String toString() {
        return  day +
                "/" + month +
                "/" + year;
    }
}

class TestDate {
    public static void main(String[] args) {

        //Test constructor and toString
        Date d1 = new Date(1,2,2014);
        System.out.println(d1);

        //Test Setters and Getters
        d1.setMonth(11);
        d1.setDay(27);
        d1.setYear(1997);
        System.out.println(d1);
        System.out.println(d1.getDay());
        System.out.println(d1.getMonth());
        System.out.println(d1.getYear());

        // Test setDate()
        d1.setDate(20,5,1997);
        System.out.println(d1);

    }
}
