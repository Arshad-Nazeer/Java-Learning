package L68_Enums;

public enum Day {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
    // constant objects calls a constructor to associate the object with a number

     private final int dayNumber;

    Day(int dayNumber){
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return this.dayNumber;
    }
}
