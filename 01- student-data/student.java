public class Student {
  // fields, instance varaibles (data)
  // each instance of the Student class gets a copy of each variable
  private String id;
  private String name;
  private boolean closeContact;
  private int[] grades;

  // constuctor method
  public Student(String id, String n, boolean cc, int[] g) {
    this.id = id;
    this.closeContact = cc;
    this.grades = g;
  }

  // behaviors (methods)

  // get the close contact status of the student
  public boolean getCloseContact() {
    return this.closeContact;
  } // end isCloseContact method

  // set the value of close contact
  // changing the status of close contact
  public boolean setCloseContact(boolean value) {
    if(value = false) {
      this.closeContact = true;
    }
    else { // if true -> remain as true
      return this.closeContact;
    }
    return this.closeContact;
  }

  // see if the student is failing
  public boolean isFailing() {
    if(getAverage() < 65) {
      return true;
    }
    return false;
  }

  // get object's name value
  public String getName() {
    return this.name;
  }

  // get student id
  public String getID() {
    return this.id;
  }

  public double getAverage() {
    int total = 0;

    for (int grade : this.grades) {
      total += grade;
    } // end for-each loop
    return total / grades.length;
  } // end getAverage method

  public String toString() {
    return this.name + ": " + this.id;
  }

}
