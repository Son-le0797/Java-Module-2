package AutomatedTestingTDD.NextDayCalculator;

public class NextDayCalculator {

    public static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static String daysInMonth(int day, int month, int year) {
        int daysInMonth;
        switch (month) {
            case 2:
                if(isLeapYear(year)) {
                    daysInMonth = 29;
                }else {
                    daysInMonth = 28;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + month);
        }

        if(day < daysInMonth && day >= 1){
            day++;
        }
        else if(day == daysInMonth && month == 12) {
            day = 1;
            month = 1;
            year++;
        }else if(day == daysInMonth){
            day = 1;
            month++;
        }else{
            day++;
        }
        return String.format("%d/%d/%d",day,month,year);
    }



//    public static String display(int day, int month, int year){
//        String strDay = day + "";
//        String strMonth = month + "";
//        String strYear = year + "";
//        if(strDay.length()==1){
//            strDay ="0"+day;
//        }
//        if(strMonth.length()==1){
//            strMonth = "0"+month;
//        }
//        if(strYear.length() == 1){
//            strYear = "0"+year;
//        }
//        return String.format("%s/%s/%s",strDay,strMonth,strYear);
//    }
}
