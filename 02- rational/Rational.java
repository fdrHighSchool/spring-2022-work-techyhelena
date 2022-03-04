public class Rational {
  // instance variables -> cannot be accessed outside of this file
  private int num;
  private int den;

  // constructor 
  public Rational() {
    // set num and den default values 
    this.num = 0;
    this.den = 1;
  }

  // overloaded constructor 
  public Rational(int n, int d) {
    this.num = n;
    this.den = d;
  }
 
  public void printRational() {
    System.out.println(this.num + "/" + this.den);
  }
  
  public String toString() {
    return this.num + "/" + this.den;
  }
  
  public void negate() {
    this.num = num * -1;
  }
  
  public void invert() {
    // make variable to save changes 
    int temp = this.num;
    this.num = this.den; 
    this.den = temp; 
  }

  public double toDouble() {
    return (double)(this.num) / (this.den);
  }

  // reduce method

  // add method 
   
}