public class Tester {
    public static void main(String[] args) {
        StepTracker tr = new StepTracker(10000);

        tr.addDailySteps(27000);
        System.out.println("Total days: " + tr.totalDays());
        System.out.println("Total Steps: " + tr.totalSteps());
        System.out.println("Active Days: " + tr.activeDays());
        System.out.println("Average Steps " + tr.averageSteps());
    }
}
