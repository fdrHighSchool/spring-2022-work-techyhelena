import java.util.*;
public class Main {
  public static void main(String[] args) {

   // making instance
    Rational rational1 = new Rational();
    Rational rational2 = new Rational(2, 3);
    
    // rational1.printRational();
    // rational2.printRational();
   
    // testing methods 
    rational2.negate();   
    rational2.toDouble();
  }
}