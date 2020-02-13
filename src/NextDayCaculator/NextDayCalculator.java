package NextDayCaculator;

public class NextDayCalculator {
    private static int month=0;
    private static int year=0;
    public static int getMonth(){
        return NextDayCalculator.month;
    }
    public static int getYear(){
        return NextDayCalculator.year;
    }

    public static boolean isLeapYear(int year){
        // Nhung nam chia het cho 4 ma khong chia het cho 100 la nam nhuan
        // Nhung nam chia het cho 100 ma khong chia het cho 400 khong phai la nam nhuan
        // Nhung nam chi het dong thoi cho 100 va 400 la nam nhuan
        if(year % 4 == 0)
            if(year % 100 == 0)
                if(year % 400 == 0)
                    return true;
                else
                    return false;
            else
                return true;
        else
            return false;
    }

    public static int nextDay(int currentDay, int currentMonth, int currentYear){
        int numberOfDayInMonth = 0;

        final int JANUARY = 1;
        final int FEBRUARY = 2;
        final int MARCH = 3;
        final int APRIL = 4;
        final int MAY = 5;
        final int JUNE = 6;
        final int JULY = 7;
        final int AUGUST = 8;
        final int SEPTEMBER= 9;
        final int OCTOBER = 10;
        final int NOVEMBER = 11;
        final int DECEMBER = 12;

        switch(currentMonth){
            case FEBRUARY:
                if(NextDayCalculator.isLeapYear(currentYear))
                    numberOfDayInMonth =29;
                else
                    numberOfDayInMonth = 28;

                if(currentDay < numberOfDayInMonth) {
                    NextDayCalculator.month = FEBRUARY;
                    NextDayCalculator.year = currentYear;
                    return currentDay + 1;
                }
                else {
                    NextDayCalculator.month = currentMonth +1;
                    NextDayCalculator.year = currentYear;
                    return 1;
                }

            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER: numberOfDayInMonth =31;
                if(currentDay < numberOfDayInMonth) {
                    NextDayCalculator.month = currentMonth;
                    NextDayCalculator.year = currentYear;
                    return currentDay + 1;
                }
                else {
                    if(currentMonth == DECEMBER) {
                        NextDayCalculator.month = JANUARY;
                        NextDayCalculator.year = currentYear +1;
                    }
                    else {
                        NextDayCalculator.month = currentMonth +1;
                        NextDayCalculator.year = currentYear;

                    }
                    return 1;
                }

            case JUNE:
            case APRIL:
            case SEPTEMBER:
            case NOVEMBER: numberOfDayInMonth = 30;
                if(currentDay < numberOfDayInMonth) {
                    NextDayCalculator.month = currentMonth;
                    NextDayCalculator.year = currentYear;
                    return currentDay + 1;
                }
                else {
                    NextDayCalculator.month = currentMonth + 1;
                    NextDayCalculator.year = currentYear;
                    return 1;
                }
        }
        return -1;
    }

}
