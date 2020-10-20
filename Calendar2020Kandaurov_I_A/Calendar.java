package Calendar2020Kandaurov_I_A;

import java.util.Scanner;

public class Calendar {
    private Month[] someCalendar;

    Calendar() {
        someCalendar = new Month[12];

        for (int x = 0; x < 12; x++) {
            someCalendar[x] = new Month();
        }

        someCalendar[0].monthName = NameOfMonth.NFMth.January;//Заполнение дней Января
        someCalendar[0].initialWorkDay();
        for (int x = 0; x < 8; x++) {//Праздники
            someCalendar[0].getPartyDay(x);
        }

        someCalendar[1].monthName = NameOfMonth.NFMth.February;//Заполнение дней Февраля
        someCalendar[1].initialWorkDay();
        someCalendar[1].getPartyDay(23);

        someCalendar[2].monthName = NameOfMonth.NFMth.March;//Заполнение дней Марта
        someCalendar[2].initialWorkDay();
        someCalendar[2].getPartyDay(8);

        someCalendar[3].monthName = NameOfMonth.NFMth.April;//Заполнение дней Апреля
        someCalendar[3].initialWorkDay();

        someCalendar[4].monthName = NameOfMonth.NFMth.May;//Заполнение дней Мая
        someCalendar[4].initialWorkDay();
        for (int x = 0; x < 5; x++) {//Праздники
            someCalendar[4].getPartyDay(x);
        }
        someCalendar[4].getPartyDay(10);

        someCalendar[5].monthName = NameOfMonth.NFMth.June;//Заполнение дней Июня
        someCalendar[5].initialWorkDay();
        someCalendar[5].getPartyDay(11);

        someCalendar[6].monthName = NameOfMonth.NFMth.July;//Заполнение дней Июля
        someCalendar[6].initialWorkDay();

        someCalendar[7].monthName = NameOfMonth.NFMth.August;//Заполнение дней Августа
        someCalendar[7].initialWorkDay();

        someCalendar[8].monthName = NameOfMonth.NFMth.September;//Заполнение дней Сентяря
        someCalendar[8].initialWorkDay();

        someCalendar[9].monthName = NameOfMonth.NFMth.October;//Заполнение дней Октября
        someCalendar[9].initialWorkDay();

        someCalendar[10].monthName = NameOfMonth.NFMth.November;//Заполнение дней Ноября
        someCalendar[10].initialWorkDay();
        someCalendar[10].getPartyDay(3);

        someCalendar[11].monthName = NameOfMonth.NFMth.December;//Заполнение дней Декабря
        someCalendar[11].initialWorkDay();
    }

    void showDay() {
        int month;
        int day;
        Scanner s1 = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Введите Дату (Формат /Даты/ Месяц,День)");
            while (true) {
                System.out.print("Месяц:");
                month = s1.nextInt();
                if (month < 13 && month > 0)
                    break;
                else
                    System.out.println("Ошибка ввода!");
            }
            month--;
            while (true) {
                System.out.print("День:");
                day = s1.nextInt();
                if (day < 32 && day > 0)
                    break;
                else
                    System.out.println("Ошибка ввода!");
            }
            day--;
            someCalendar[month].showMonthName();
            someCalendar[month].showDayOfMonth(day);
        }
    }
}
