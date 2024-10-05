import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeasonExample {

    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String[] args) {
        Season season = checkSeason();
        if (season != null) {
            System.out.println(season);
        }
    }

    public static Season checkSeason() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the month:");
        String month;

        try {
            month = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Season season = null;
        switch (month.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                season = Season.WINTER;
                break;
            case "march":
            case "april":
            case "may":
                season = Season.SPRING;
                break;
            case "june":
            case "july":
            case "august":
                season = Season.SUMMER;
                break;
            case "september":
            case "october":
            case "november":
                season = Season.AUTUMN;
                break;
            default:
                System.out.println("No such month");
        }
        return season;
    }
}