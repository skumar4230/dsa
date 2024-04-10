public class EnumExample {
    // Define an enum for days of the week
    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        // Accessing enum constants
        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);

        // Switch statement with enum
        switch (today) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("It's a weekday.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's a weekend.");
                break;
        }

        // Iterating over enum constants
        System.out.println("All days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
