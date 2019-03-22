package lesson2;

/**
 * გადაწყვეტილების მიღება SWitch-ის დახმარებით
 */
public class DecisionMakingSwitch {

    private static void printCurrentWeekDay(String curretWeekDay) {
        switch (curretWeekDay) {
            case "MONDAY":
                System.out.println("დღეს მაქვს გამოცდა");
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

    public static void main(String[] args) {
        DateUtil.printCurrentWeekDay("THURDSDAY");

    }
}
