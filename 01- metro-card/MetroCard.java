public class MetroCard {
    // instance variables
    // private String status;
    // private double balance;
    private int rides;
    // private double fee;
    private String time;


    // constructors
    // public MetroCard(String s, double b) {
    //     this.status = s;
    //     this.balance = b;
    // }

    public MetroCard(String t) {
        // this.status = s;
        this.time = t;
        this.rides = 3;
    }

    public void swipe() {
        if(this.rides == 0) { //if student has no rides
            System.out.println("Insufficent rides available.");

        }
        else if(timeParts(this.time) < 530 || timeParts(this.time) > 2030 ) { // time limit during 5:30 AM to 8:30 PM
            System.out.println("You may not use your card during these hours.");
            this.rides = 0;
        }

        else if(timeParts(this.time) == 00) { // if midnight refresh # of rides
            this.rides = 3;
        }

        else {
            this.rides = this.rides--;
            System.out.println("You have " + this.rides + " rides remaining.");
        }



    } // end swipe()

    // public double getBalance() {
    //     return this.balance;
    // }

    public int getRides() {
        return this.rides;
    }


    public int timeParts(String t) {
        this.time = t;
        int colon = t.indexOf(":");

        int hour = Integer.parseInt(t.substring(0, colon));
        int min = Integer.parseInt(t.substring(colon + 1, 4));


        return hour + min;
    }

    public String getTime() {
        // this.time = t;
        int colon = this.time.indexOf(":");

        int hour = Integer.parseInt(this.time.substring(0, colon));
        int min = Integer.parseInt(this.time.substring(colon + 1, 4));
        return "hour: " + hour + " min: " + min;

    }

    /*
     public String toString() {
         return
     }
    */ 

}
