package lesson2;

public class DateUtil {

    protected static void printCurrentWeekDay(String curretWeekDay) {
        switch (curretWeekDay) {
            case "MONDAY":
                System.out.println("ეს მანქანა წარმოებული იქნა ორშაბათს");
                break;
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURDSDAY":
            case "FRIDAY":
            case "SATURDAY":
            case "SUNDAY": {
                System.out.println("დღეს არის ნორმალური მზიანი დღე:" + curretWeekDay);
                break;
            }
            default: {
                System.out.println("არცერთი პირობა არ დაკმაყოფილდა");
                break;
            }
        }
    }

}
