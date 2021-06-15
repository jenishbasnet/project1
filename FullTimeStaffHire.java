 public class FullTimeStaffHire extends StaffHire{
     private int salary;
     private int workingHour;
     private String staffName;
     private String joiningDate;
     private String qualification;
     private String appointedBy;
     private boolean joined;
     // global variables
     
 public FullTimeStaffHire(int vacancyNumber,String designation,String jobType,int salary,int workingHour){ 
    super(vacancyNumber,designation,jobType);
    this.salary = salary;                                           //initialize new variable as attribute
    this.workingHour = workingHour;
    String staffName = "";                                                  // add vacancy number of full time staff
    String joiningDate = "";
    String qualification ="";
    String appointedBy = "";
    boolean joined = false;
    
    }// Constructor
    public int getSalary(){
        return salary;
    }
    public int getWorkingHour(){
        return workingHour;
    }
    public String getStaffName(){
        return staffName;
    }
    public String getJoiningDate(){
        return joiningDate;
    }
    public String getQualification(){
        return qualification;
    }
    public String getAppointedBy(){
        return appointedBy;
    }
    public boolean getJoined(){
        return joined;
    } // Getter (Encapsulation)
    public void setSalary(int salary){
        if (joined == false){
        this.salary = salary;
    }
        else 
        System.out.println("Therefore not possible to change the salary.");
    }// If its new joined part time staff 
    public void setWorkingHour(int workingHour){
        if(joined == false){
        this.workingHour = workingHour;
        }
    }
    public void setStaffName(String staffName){
        this.staffName = staffName;
    }
    public void setJoiningDate(String joinningDate){
        this.joiningDate = joiningDate;
    }
    public void setQualification(String qualification){
        this.qualification = qualification;
    }
    public void setAppointedBy(String appointedBy){
        this.appointedBy = appointedBy;
    }
    public void setJoined(boolean joined){
        this.joined = joined;
    }//Setter (Encapsulation)
   
    public void hireFullTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy){
        if(joined ==false){    //checks is joined status is false then
        this.staffName = staffName;
        this.joiningDate = joiningDate;
        this.qualification = qualification;         //initialize new value as attribute
        this.appointedBy = appointedBy;
        this.joined = true;
        }
        else
        System.out.println("Staff"+getStaffName()+"is already appointed at "+getJoiningDate());
    }// Hiring a new full time staff.
    public void printDetails(){
    super.printDetails();
        if (joined == true){           //Checks if joined status is true
        System.out.println("Name of the staff :"+getStaffName());
        System.out.println("Salary of the staff :"+getSalary());
        System.out.println("WorkingHour of the staff :"+getWorkingHour());
        System.out.println("Qualification of the staff :"+getQualification());       // prints detail of the staff
        System.out.println("Joining date of the staff :"+getJoiningDate());
        System.out.println("Staff appointed by :"+getAppointedBy());
        }
    }// Displays the details of full time staff.
}