import java.util.Scanner;

public class Email {
  private String firstName; 
  private String lastName;
  private String password; 
  private String department;
  private int mainlboxCapcity; 
  private String alternateEmail; 

  // constructor to receive the firstName and lastName
  public Email(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;

    // call a mthod asking for the department - return the deparment
    this.department = setDeparment();
    System.out.println("Department: " + this.department);
  }

  // Ask for the department
  private String setDeparment( ) {
    System.out.print("DEPARTMENT CODES\nEnter the department\n1 for Sales\n2 for Accounting\n3 for Development\n0 for none\nEnter department code: ");
    Scanner in = new Scanner(System.in);
    // Scans the entry as an integer
    int departmentChoice = in.nextInt();

    if(departmentChoice == 1) {return "Sales"; }
    else if (departmentChoice == 2){ return "Accounting"; }
    else if (departmentChoice == 3) { return "Development"; }
    else { return ""; }
    
  }
  // Set the mailbox capcity
  
  // Set the alternate email

  // Change the password

}