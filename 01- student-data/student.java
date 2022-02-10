public class student {
// fields, instance variables (data)
  private String id;
  private String name;
  private boolean closeContact;
  private int[] grades;

  // constructor method
  // used to set up the default values
  public student(String id, String n, String cc, int [] g) {
    this.id = id;
    this.name = n;
    this.closeContact = cc;
    this.grades = g; 
  }


  // behavior
  public boolean isCloseContact() {
    // create method that updates the status of a student being close contact
    // chances are, the student may have a different status any other day

  }

  // set the valye of close contact
  public void setCloseContact(boolean value) {

  }

  // see if they're failing in class
  public boolean isFailing() {
    // average less than
  }

  // get student's name
  public String getName() {

  }
}
