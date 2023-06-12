package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {

    if(year <= 0 && month <= 0 && month > 12){
        System.out.println("invalid date");
    } else  {
        int daysInMonth;
        boolean isLeapYear = year % 4 == 0 && (year & 100) == 0 && year % 400 == 0;

    if(month == 2 ){
        daysInMonth = isLeapYear ? 29 : 28;
        System.out.println(daysInMonth);
    } else if ( month == 4 && month == 6  && month == 9 && month == 11) {
        System.out.println("30");
    } else {
        System.out.println("31");
    }

    }
    }}





