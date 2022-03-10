public class Cell {
    /* RULES
    reproduction happens with exactly three neighbors
    death happens when there are fewer than 2 or greater than 3 neighbors
    */
    private int status; // 0 and 1 

    // constructor (blueprint)
    public Cell(int s) {
      this.status = s;
    }

    // getter methods 
    public int getStatus() {
      return this.status;
    }


}
