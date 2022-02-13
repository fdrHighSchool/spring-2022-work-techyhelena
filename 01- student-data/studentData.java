public class studentData {
    public static void main(String[] args) {
      // student 1
      String id1 = "1234567";
      String name1 = "Jimmy Smith";
      boolean cc1 = true;
      int[] grades1 = {90, 80, 95, 90, 100};
  
      // student 2
      String id2 = "9876543";
      String name2 = "Maria Hernandez";
      boolean cc2 = false;
      int[] grades2 = {95, 100, 100, 90, 90};
  
      // student 3
      String id3 = "1357911";
      String name3 = "Jamal Jenkins";
      boolean cc3 = false;
      int[] grades3 = {85, 85, 95, 100, 90};
  
      // student 4
      String id4 = "2468101";
      String name4 = "Ramiz Ahmed";
      boolean cc4 = true;
      int[] grades4 = {90, 100, 75, 85, 90};
  
      // student 5
      String id5 = "1928374";
      String name5 = "Michael Green";
      boolean cc5 = true;
      int[] grades5 = {80, 80, 65, 55, 90};
  
      // creating instances of the Student class
      Student student1 = new Student("9876543", "Jimmy Smith", true, new int[] {90, 80, 95, 90, 100});
      Student student2 = new Student("1234567", "Maria Hernandez", false, new int[] {95, 100, 100, 90, 90});
      Student student3 = new Student("1357911", "Jamal Jenkins", false, new int[] {85, 85, 95, 100, 90});
      Student student4 = new Student("2468101", "Ramiz Ahmed", true, new int[] {90, 100, 75, 85, 90});
      Student student5 = new Student("1928374", "Michael Green", true, new int[] {80, 80, 65, 55, 90});
  
      // calling getter methods to display data
      System.out.println(student1.getName() + "'s average is: " + student1.getAverage());
      System.out.println(student2.getName() + "'s average is: " + student2.getAverage());

      // getting student IDs
      System.out.println("Student 1's ID is: " + student1.getID());
      System.out.println("Student 5's ID is: " + student5.getID());
  
      // decision making based off of data attached to the object
      // if (student1.getCloseContact()) {
      //   System.out.println("Please report to the auditorium for your take-home COVID test");
      // }
      // else {
      //   System.out.println("You are not a close contact, keep masking! Get boosted!");
      // }

      // changing the status of close contact 
      if(student1.getCloseContact() == false) {
        student1.setCloseContact(true);
        System.out.println(student1.getName() + ", You're now a close contact, please report to the auditorium for your take-home COVID test");
      } 
      else {
        // student1.setCloseContact(true);
        System.out.println(student1.getName() + ", You're now a close contact, please report to the auditorium for your take-home COVID test");

      }
      
      if(student2.getCloseContact() == false) {
        student1.setCloseContact(true);
      } 
      else {
        student2.setCloseContact(true);
      }
        System.out.println(student2.getName() + ", You're now a close contact, please report to the auditorium for your take-home COVID test");
      

        if(student3.getCloseContact() == false) {
          student3.setCloseContact(true);
        } 
        else {
          student3.setCloseContact(true);
        }
        System.out.println(student3.getName() + ", You're now a close contact, please report to the auditorium for your take-home COVID test");
      

        if(student4.getCloseContact() == false) {
          student4.setCloseContact(true);
        } 
        else {
          student4.setCloseContact(true);
        }
        System.out.println(student4.getName() + ", You're now a close contact, please report to the auditorium for your take-home COVID test");
      

        if(student5.getCloseContact() == false) {
          student5.setCloseContact(true);
        } 
        else {
          student5.setCloseContact(true);
        }
        System.out.println(student5.getName() + ", You're now a close contact, please report to the auditorium for your take-home COVID test");
      

      // else {
      //   System.out.println("You are not a close contact, keep masking! Get boosted!");
      // }
      
      
    } // end main method
  
  } // end class