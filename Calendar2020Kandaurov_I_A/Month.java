package Calendar2020Kandaurov_I_A;

public class Month {
    public NameOfMonth.NFMth monthName;
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
            someMonth[x].putDayName(dayCounter);
            if(dayCounter == 6 || dayCounter == 7)
                someMonth[x].putFreeDay();
            else
                someMonth[x].putWorkDay();
            dayCounter++;
            if(dayCounter == 8)
            {
                dayCounter = 1;
            }
            if(monthCounter == 2 && x == 28) {
                someMonth[29].putNullDay();
                someMonth[30].putNullDay();
                break;
            }
            if((monthCounter == 4 || monthCounter == 6 || monthCounter == 9 || monthCounter == 11) && (x == 29)) {
                someMonth[30].putNullDay();
                break;
            }
        }
        monthCounter++;
    }

    public void getPartyDay(int numberOfDay)
    {
        someMonth[numberOfDay].putFreeDay();
    }

    public void showDayOfMonth(int numberOfDay)
    {
        someMonth[numberOfDay].showDayStatus();
        someMonth[numberOfDay].showDayName();
    }

    public void showMonthName() {
        if (monthName == NameOfMonth.NFMth.January) {
            System.out.print("Январь ");
            return;
        }
        if (monthName == NameOfMonth.NFMth.February) {
            System.out.print("Февраль ");
            return;
        }
        if (monthName == NameOfMonth.NFMth.March) {
            System.out.print("Март ");
            return;
        }
        if (monthName == NameOfMonth.NFMth.April) {
            System.out.print("Апрель ");
            return;
        }
        if (monthName == NameOfMonth.NFMth.May) {
            System.out.print("Май ");
            return;
        }
        if (monthName == NameOfMonth.NFMth.June) {
            System.out.print("Июнь ");
            return;
        }
        if (monthName == NameOfMonth.NFMth.July) {
            System.out.print("Июль ");
            return;
        }
        if (monthName == NameOfMonth.NFMth.August) {
            System.out.print("Август ");
            return;
        }
        if (monthName == NameOfMonth.NFMth.September) {
            System.out.print("Сентябрь ");
            return;
        }
        if (monthName == NameOfMonth.NFMth.October) {
            System.out.print("Октябрь ");
            return;
        }
        if (monthName == NameOfMonth.NFMth.November) {
            System.out.print("Ноябрь ");
            return;
        }
        if (monthName == NameOfMonth.NFMth.December) {
            System.out.print("Декабрь ");
            return;
        }
    }
}
