package Calendar2020Kandaurov_I_A;

import java.util.Scanner;

public class Main {

    enum DayOfWeek{ Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday}

    enum NamesOfMonth{January, February, March, April, May, June, July, August, September, October, November, December}

    public static void main(String[] args) {
        Calendar c1;
        c1 = new Calendar();
        c1.showDay();
    }
   static public class Day{

        private DayOfWeek DayName;
        private int dayStatus;//1-День свободен 2-День занят 0-Дня не сушествует

        public void putFreeDay()
        {
            dayStatus = 1;
        }

        public void putWorkDay()
        {
            dayStatus = 2;
        }

        public void showDayName()
        {
            if(DayName == DayOfWeek.Monday)
            {
                System.out.print("Понедельник");
                return;
            }
            if(DayName == DayOfWeek.Tuesday)
            {
                System.out.print("Вторник");
                return;
            }
            if(DayName == DayOfWeek.Wednesday)
            {
                System.out.print("Среда");
                return;
            }
            if(DayName == DayOfWeek.Thursday)
            {
                System.out.print("Четверг");
                return;
            }
            if(DayName == DayOfWeek.Friday)
            {
                System.out.print("Пятница");
                return;
            }
            if(DayName == DayOfWeek.Saturday)
            {
                System.out.print("Суббота");
                return;
            }
            if(DayName == DayOfWeek.Sunday)
            {
                System.out.print("Воскресенье");
                return;
            }
        }
        public void showDayStatus()
        {
            if (dayStatus == 1)
            {
                System.out.print("Выходной ");
                showDayName();
                return;
            }
            if (dayStatus == 2)
            {
                System.out.print("Рабочий/Занятой ");
                showDayName();
                return;
            }
            if (dayStatus == 0)
            {
                System.out.print("Такого дня нет ");
                return;
            }
        }

    }
   static public class Month extends Day
    {
        private NamesOfMonth monthName;
        private Day[] someMonth;
        static int dayCounter = 3;
        static int monthCounter = 1;

        Month()
        {
            someMonth = new Day[31];
            for(int x=0; x < 31; x++)
            {
                someMonth[x] = new Day();
            }
        }
        public void initialWorkDay()//Функция для инициализации месяца(Единых рабочих дней и выходных)
        {
            for (int x = 0; x < 31; x++) {
                someMonth[x].DayName = checkDayCounter(dayCounter);
                if(dayCounter == 6 || dayCounter == 7)
                    someMonth[x].dayStatus = 1;
                else
                someMonth[x].dayStatus = 2;
                dayCounter++;
                if(dayCounter == 8)
                {
                    dayCounter = 1;
                }
                if(monthCounter == 2 && x == 28) {
                    someMonth[29].dayStatus = 0;
                    someMonth[30].dayStatus = 0;
                    break;
                }
                if((monthCounter == 4 || monthCounter == 6 || monthCounter == 9 || monthCounter == 11) && (x == 29)) {
                    someMonth[30].dayStatus = 0;
                    break;
                }
            }
            monthCounter++;
        }
        public void showMonthName() {
            if (monthName == NamesOfMonth.January) {
                System.out.print("Январь ");
                return;
            }
            if (monthName == NamesOfMonth.February) {
                System.out.print("Февраль ");
                return;
            }
            if (monthName == NamesOfMonth.March) {
                System.out.print("Март ");
                return;
            }
            if (monthName == NamesOfMonth.April) {
                System.out.print("Апрель ");
                return;
            }
            if (monthName == NamesOfMonth.May) {
                System.out.print("Май ");
                return;
            }
            if (monthName == NamesOfMonth.June) {
                System.out.print("Июнь ");
                return;
            }
            if (monthName == NamesOfMonth.July) {
                System.out.print("Июль ");
                return;
            }
            if (monthName == NamesOfMonth.August) {
                System.out.print("Август ");
                return;
            }
            if (monthName == NamesOfMonth.September) {
                System.out.print("Сентябрь ");
                return;
            }
            if (monthName == NamesOfMonth.October) {
                System.out.print("Октябрь ");
                return;
            }
            if (monthName == NamesOfMonth.November) {
                System.out.print("Ноябрь ");
                return;
            }
            if (monthName == NamesOfMonth.December) {
                System.out.print("Декабрь ");
                return;
            }
        }
        DayOfWeek checkDayCounter(int dayCounter)
        {
            switch (dayCounter)
            {
                case(1):
                    return DayOfWeek.Monday;
                case(2):
                    return DayOfWeek.Tuesday;
                case(3):
                    return DayOfWeek.Wednesday;
                case(4):
                    return DayOfWeek.Thursday;
                case(5):
                    return DayOfWeek.Friday;
                case(6):
                    return DayOfWeek.Saturday;
                case(7):
                    return DayOfWeek.Sunday;
                default:
                    return DayOfWeek.Sunday;
            }
        }
    }
    static public class Calendar extends Month {
        private Month[] someCalendar;

        Calendar() {
            someCalendar = new Month[12];

            for (int x = 0; x < 12; x++) {
                someCalendar[x] = new Month();
            }

            someCalendar[0].monthName = NamesOfMonth.January;//Заполнение дней Января
                someCalendar[0].initialWorkDay();
                for (int x = 0; x < 8; x++) {//Праздники
                    someCalendar[0].someMonth[x].dayStatus = 1;
                }

            someCalendar[1].monthName = NamesOfMonth.February;//Заполнение дней Февраля
                someCalendar[1].initialWorkDay();
            someCalendar[1].someMonth[23].dayStatus = 1;

            someCalendar[2].monthName = NamesOfMonth.March;//Заполнение дней Марта
                someCalendar[2].initialWorkDay();
            someCalendar[2].someMonth[8].dayStatus = 1;

            someCalendar[3].monthName = NamesOfMonth.April;//Заполнение дней Апреля
                someCalendar[3].initialWorkDay();

            someCalendar[4].monthName = NamesOfMonth.May;//Заполнение дней Мая
                someCalendar[4].initialWorkDay();
            for (int x = 0; x < 5; x++) {//Праздники
                someCalendar[4].someMonth[x].dayStatus = 1;
            }
            someCalendar[4].someMonth[10].dayStatus = 1;

            someCalendar[5].monthName = NamesOfMonth.June;//Заполнение дней Июня
                someCalendar[5].initialWorkDay();
            someCalendar[5].someMonth[11].dayStatus = 1;

            someCalendar[6].monthName = NamesOfMonth.July;//Заполнение дней Июля
                someCalendar[6].initialWorkDay();

            someCalendar[7].monthName = NamesOfMonth.August;//Заполнение дней Августа
                someCalendar[7].initialWorkDay();

            someCalendar[8].monthName = NamesOfMonth.September;//Заполнение дней Сентяря
                someCalendar[8].initialWorkDay();

            someCalendar[9].monthName = NamesOfMonth.October;//Заполнение дней Октября
                someCalendar[9].initialWorkDay();

            someCalendar[10].monthName = NamesOfMonth.November;//Заполнение дней Ноября
                someCalendar[10].initialWorkDay();
            someCalendar[10].someMonth[3].dayStatus = 1;

            someCalendar[11].monthName = NamesOfMonth.December;//Заполнение дней Декабря
                someCalendar[11].initialWorkDay();
        }

        void showDay()
        {
            int month;
            int day;
           // String choice;

            Scanner s1 = new Scanner(System.in);
            while(true) {
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
                someCalendar[month].someMonth[day].showDayStatus();
                /*while(true){
                    System.out.println();
                    System.out.print("Повторить Ввод?(y/n):");
                    choice = s1.next();
                    if (choice == "y" || choice == "Y")
                        break;
                    else
                    {
                        break;
                    }
                }
                if (choice == "y" || choice == "Y")
                    continue;
                else
                    break;*/
            }
        }

    }
}
