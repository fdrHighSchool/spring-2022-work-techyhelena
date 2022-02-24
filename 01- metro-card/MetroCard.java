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
        if(timeParts(this.time) < 530 || timeParts(this.time) > 2030 ) {
            System.out.println("You may not use your card during these hours.");
            this.rides = 0;
        }
        
        else if(timeParts(this.time) == 0000) {
            this.rides = 3; 
        } 

        else if(this.rides == 0) {
            System.out.println("Insuffient rides available");

        }

        else {
            this.rides = this.rides--;
            System.out.println("You have " + this.rides + " rides remaining.");
        }
        
    }
    
    // public double getBalance() {
    //     return this.balance;
    // }

    public int getRides() {
        return this.rides;
    }


    public int timeParts(String t) {
        this.time = t;
        int colon = t.indexOf(":");
        // int lastColon = t.lastIndexOf(":");

        int hour = Integer.parseInt(t.substring(0, colon));
        int min = Integer.parseInt(t.substring(colon + 1));
        // int sec = Integer.parseInt(t.substring(lastColon + 1));


        return hour + min; 
    }

    public String getTime() {
        // this.time = t;
        int colon = this.time.indexOf(":");
        // int lastColon = this.time.lastIndexOf(":");

        int hour = Integer.parseInt(this.time.substring(0, colon));
        int min = Integer.parseInt(this.time.substring(colon + 1));
        // int sec = Integer.parseInt(this.time.substring(lastColon + 1));
        return "hour: " + hour + " min: " + min; 
        
    }

    // public String toString() {
    //     return
    // }

}