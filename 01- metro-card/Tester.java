public class MetroCard {
    private double time; 
    private double fee; 
    private double balance; 
    private String status; 
    private int rides;


    // constructors 
    public MetroCard(double t, double f, String s, int r) { // student card
        this.time = t;
        this.fee = f;
        this.status = s;
        this.rides = r;

        // default info 
        s = "Student";
        r = 3; 
    }

    // normal card
    public MetroCard(double t, double f, double b, double s) {
        this.fee = f;
        this.status = s;
        this.balance = b;

        // default values 
        b = "5.50";
        f = 2.75;
        s = "Pay To Go";
    }


    // behaviors 
    // 5:30 -> 20:30
    public void swipe() {
        if(s = "Student") {
            if(t < 5.30 || t > 20.30) {
            r = 0; 
            System.out.println("Your card is invalid at this time.");
            }
            
            else {
                System.out.println("You have" + r + "rides left.");
            }
        }

        if(s = "Pay to Go") {
            
        }
    }

}
  
