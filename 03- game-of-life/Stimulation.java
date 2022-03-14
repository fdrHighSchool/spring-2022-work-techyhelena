import java.util.*;
public class Stimulation {
    public static void main(String[] args) {
        // make 2d array that stores random 0 and 1s (true and false basically)
        Cell[][] grid = new Cell[10][10]; // col by row
        Scanner s = new Scanner(System.in); // will be used to update screen

        // testing to see if board properly displays
        displayBoard(grid);

    } // end main

        public static void createBoard(Cell[][] grid) {
          for(int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[0].length; c++) {
              // fill board with random 1 and 0 to get it working
              grid[r][c] = new Cell((int)(Math.random()*2)); // creating new object within nested loop
            }
          }
        }
        public static void displayBoard(Cell[][] grid) {
          for(int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[r].length; c++) {
              System.out.println(grid[r][c] + " ");
            }
            // System.out.println();
          }
         }

        // make updateBoard method (next gen)

        // String input = s.nextLine(); // to update screen
        // make new array to make new gen

        // count neighbor method for each cell
        // will determine the status of the next gen
        // use mod to wrap around - go back to the beginning
        /*
        public int countNeighbors(int r, int c) {
          int count = 0;
          // creating a 3 by 3 grid around cell
          for(int row = -1; row <= 1; row++) {
            for(int col = -1; col <= 1; col++) {
              if(grid[row + r] [col + c].getStatus() == 1) {
                count++;
              }
            }
          }
          //don't count the cell (the one we're tracking) as its own neighbor
          if(grid[r][c].getStatus == 1) {
            count--;
          }
          return count;
        }
        */




} // ends class
