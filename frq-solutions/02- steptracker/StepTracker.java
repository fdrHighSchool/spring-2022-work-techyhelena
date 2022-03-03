public class StepTracker {
    private int minSteps; 
    private int steps;
    private int days; 

    public StepTracker(int min) {
        this.minSteps = min; 
    }

    public void addDailySteps(int steps) {
        // accumlates info about steps, in readings taken once per day
    }

    public int activeDays(int days) {
        // returns the number of active days
        return 0;
    }


    public double averageSteps() {
        // divide the total number of steps taken by the number of days tracked
        return 0.0;
    }

    
}