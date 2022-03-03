public class MetroCard {
    // instance variables
    private int rides;
    private String id; 
    private String time;


    // constructors
    public MetroCard() {
        // this.status = s;
        this.rides = 3;
        this.id = "34587902";
    }

    public void swipe(String t) {
        if(this.rides == 0) { //if student has no rides
            System.out.println("Insufficent rides available.");

        }
        else if(timeParts(t) < 530 || timeParts(t) > 2030 ) { // time limit during 5:30 AM to 8:30 PM
            System.out.println("You may not use your card during these hours.");
            this.rides = 0;
        }

        else {
            this.rides = this.rides--;
            System.out.println("You have " + this.rides + " rides remaining.");
        }

    }


    //mutator method 
    // start of a new day 
    public void refresh() {
        if(timeParts(this.time) == 530) { 
            this.rides = 3;
        }
    }

    public int getRides() {
        return this.rides;
    }

    public int timeParts(String t) {
        this.time = t;
        int colon = t.indexOf(":");

        int hour = Integer.parseInt(t.substring(0, colon));
        int min = Integer.parseInt(t.substring(colon + 1));

        return hour + min;
    }

    public String getTime() {
        // this.time = t;
        int colon = this.time.indexOf(":");

        int hour = Integer.parseInt(this.time.substring(0, colon));
        int min = Integer.parseInt(this.time.substring(colon + 1));
        return "hour: " + hour + " min: " + min;
    }

    
     public String toString() {
         return "There is " + this.rides + " rides remaining in card number " + this.id;
     }
<<<<<<< HEAD
    */
=======
    
>>>>>>> ebceb8e2d32d5c4d92d0b3be41cdce4884cb1bc9

}
