public class StepTracker {
    private int minSteps; // used for the new object
    private int totalSteps; // used to calculate the average
    private int totalDays;  // used to calculate the average
    private int activeDays; //updated if it is greater than or equal to 10,000 steps

    public StepTracker(int min) {
        this.minSteps = min;
        this.totalSteps = 0;
        this.totalDays = 0;
        this.activeDays = 0;
    }

    public void addDailySteps(int steps) {
        // accumlates info about steps, in readings taken once per day


    }

    public int activeDays() {
        // returns the number of active days
        
    }


    public double averageSteps() {
        // divide the total number of steps taken by the number of days tracked
        // if days and steps are 0
        if(numDays == 0) {
          return 0.0;
        }

        else {
          return (double)(totalSteps) / totalDays;
        }
    }


}
