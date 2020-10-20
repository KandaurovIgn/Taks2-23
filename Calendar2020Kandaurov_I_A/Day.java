package Calendar2020Kandaurov_I_A;

public class Day {

    private DayOfWeek.DWeek dayName;
    private int dayStatus;//1-День свободен 2-День занят 0-Дня не сушествует

    public void putFreeDay() {
        dayStatus = 1;
    }

    public void putWorkDay() {
        dayStatus = 2;
    }

    public void putNullDay() {
        dayStatus = 0;
    }

    public void showDayName() {
        if (dayName == DayOfWeek.DWeek.Monday) {
            System.out.print("Понедельник");
            return;
        }
        if (dayName == DayOfWeek.DWeek.Tuesday) {
            System.out.print("Вторник");
            return;
        }
        if (dayName == DayOfWeek.DWeek.Wednesday) {
            System.out.print("Среда");
            return;
        }
        if (dayName == DayOfWeek.DWeek.Thursday) {
            System.out.print("Четверг");
            return;
        }
        if (dayName == DayOfWeek.DWeek.Friday) {
            System.out.print("Пятница");
            return;
        }
        if (dayName == DayOfWeek.DWeek.Saturday) {
            System.out.print("Суббота");
            return;
        }
        if (dayName == DayOfWeek.DWeek.Sunday) {
            System.out.print("Воскресенье");
            return;
        }
    }

    public void showDayStatus() {
        if (dayStatus == 1) {
            System.out.print("Выходной ");
            return;
        }
        if (dayStatus == 2) {
            System.out.print("Рабочий/Занятой ");
            return;
        }
        if (dayStatus == 0) {
            System.out.print("Такого дня нет! ");
            return;
        }
    }

    public void putDayName(int dayCounter) {
        switch (dayCounter) {
            case (1): {
                this.dayName = DayOfWeek.DWeek.Monday;
                break;
            }
            case (2): {
                this.dayName = DayOfWeek.DWeek.Tuesday;
                break;
            }
            case (3): {
                this.dayName = DayOfWeek.DWeek.Wednesday;
                break;
            }
            case (4): {
                this.dayName = DayOfWeek.DWeek.Thursday;
                break;
            }
            case (5): {
                this.dayName = DayOfWeek.DWeek.Friday;
                break;
            }
            case (6): {
                this.dayName = DayOfWeek.DWeek.Saturday;
                break;
            }
            case (7): {
                this.dayName = DayOfWeek.DWeek.Sunday;
                break;
            }
            default:
                this.dayName = DayOfWeek.DWeek.Sunday;
        }
    }
}


