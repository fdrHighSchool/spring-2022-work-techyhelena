import java.util.*;
public class Stimulation {
    public static void main(String[] args) {
        // make 2d array that stores random 0 and 1s (true and false basically)
        Cell[][] grid = new Cell[10][10]; // col by row
        Scanner s = new Scanner(System.in); // will be used to update screen 

        // testing to see if board properly displays 

    } // end main 

        public static void createBoard(Cell[][] grid) {
          for(int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[0].length; c++) {
              grid[r][c] = new Cell(1);
            }
          }
        }          

        // fill board with random 1 and 0 to get it working 
        // public static void showBoard(Cell[][] grid) {
        // }

        

        // make updateBoard method (next gen)
        // make a new array for the next gen 
        // String input = s.nextLine(); // to update screen

        // count neighbor method for each cell 
        // will determine the status of the next gen 
        

    

} // ends class
