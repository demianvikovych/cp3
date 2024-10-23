public class MyCalendar {
    static int year = 2023;
    static int month = 4;
    static int day = 9;
    static String myDate() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }
    static int days() {
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonths[i];
        }
        totalDays += day;
        return totalDays;
    }
    static String monthName() {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", 
                               "July", "August", "September", "October", "November", "December"};
        return monthNames[month - 1]; 
    }
    public static void main(String[] args) {
        System.out.println("Date: " + MyCalendar.myDate());
        System.out.println("Days from the beginning of year: " + MyCalendar.days());
        System.out.println("Month name: " + MyCalendar.monthName());
    }
}
