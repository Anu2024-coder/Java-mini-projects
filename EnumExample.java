public class EnumExample {
    // Define an enum
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day today = Day.MONDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the week!");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            case SUNDAY:
                System.out.println("Relax, it's Sunday!");
                break;
            default:
                System.out.println("Just a regular day.");
        }
    }
}
