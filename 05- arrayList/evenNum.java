import java.util.*;
public class evenNum {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(50);
    // fill array with numbers
    for(int i = 0; i < arr.size; i++) {
      arr.add((int)Math.random() * 50);
      System.out.println(arr);
    }



    // filter (remove odd values)
    // can check using % 2

  }
}
