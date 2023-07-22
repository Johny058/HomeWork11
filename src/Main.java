import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {

        countTheYear(2023);
        defineAppVersion(0, 2021);
        defineAppVersion(1, 2023);
        printCardCeliveryDays(95);
        printCardCeliveryDays(101);
    }


    //public static void task1() {

    public static void countTheYear(int year) {

        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println(year + " год является высокостным");
        } else
            System.out.println(year + " год не является высокостным");
    }

    public static void defineAppVersion(int mobileOC, int mobileYear) {
        int currentYear = LocalDate.now().getYear();
        String mobileOCName = defineOCName(mobileOC);

        if (mobileYear != currentYear) {
            System.out.println("Для ОС " + mobileOCName + " установите облегченную версию приложения");
        } else {
            System.out.println("Для ОС " + mobileOCName + " установите обычную версию приложения");
        }
    }

    public static String defineOCName(int mobileOC) {
        String mobileOCName;
        switch (mobileOC) {
            case 0:
                mobileOCName = "IOS";
                break;
            case 1:
                mobileOCName = "Android";
                break;
            default:
                mobileOCName = "неизвестная ОС";
        }
        return mobileOCName;
    }

    public static int calcCardDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else
            return -1;
    }

    public static void printCardCeliveryDays(int distance) {
        int days = calcCardDeliveryDays(distance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
}