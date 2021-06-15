public class PartTimeStaffHire extends StaffHire{
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    // Attributes  
public PartTimeStaffHire(int vacancyNumber,String designation,String jobType,int workingHour,int wagesPerHour,String shifts){
    super(vacancyNumber,designation,jobType); // add vacacny number for part time staff adn store it on staff hie
    this.workingHour = workingHour;
    this.wagesPerHour = wagesPerHour;         // initialize new variable as attribute
    this.shifts = shifts;
    String staffName = "";
    String joiningDate = "";
    String qualification = "";
    String appointedBy = "";
    boolean joined = false;
    boolean terminated = false;
    }//Constructor
    public int getWorkingHour(){
        return workingHour;   
    }
    public int getWagesPerHour(){
    return wagesPerHour;
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
    public String getShifts(){
    return shifts;
    }
    public boolean getJoined(){
    return joined;
    }
    public boolean getTerminated(){
    return terminated;
    }// Getter (Encapsulation)
    public void setWorkingHour(int workingHour){
        this.workingHour = workingHour;
    }
    public void setWagesPerHour(int wagesPerHour){
        this.wagesPerHour = wagesPerHour;
    }
    public void setStaffName(String staffName){
        this.staffName = staffName;
    }
    public void setJoiningDate(String joiningDate){
        this.joiningDate = joiningDate;
    }
    public void setQualification(String qualification){
        this.qualification = qualification;
    }
    public void setAppointedBy(String appointedBy){
        this.appointedBy = appointedBy;
    }
    public void setShifts(String shifts){
        if (joined == false){
           this.shifts = shifts;
        }
    }
    public void setJoined(boolean joined){
        this.joined = joined;
    }
    public void setTerminated(boolean terminated){
        this.terminated = terminated;
    }//Setter (Encapsulation)
    public void hirePartTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy){
         if (joined == false){                  //Checks is joined is false 
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;     // if joined is false initialze new value as attribute
            this.appointedBy = appointedBy;
            this.terminated = false;
            this.joined = true;
            }   
            else{
                System.out.println("Staff"+getStaffName()+"is already appointed at"+getJoiningDate());
            }
    }// Hire Part Time Staff
    public void terminateStaff(){
        if(terminated == true){         //checks if terminated is true
        System.out.println("This staff is already terminated.");        //if true displays that staff can't be terminated
        }
        else{   // if terminated is true
        this.staffName = "";
        this.joiningDate = "";
        this.qualification = "";    // sets all the attribute to empy and
        this.appointedBy = "";
        this.joined = false;         // initializes joined as false  
        this.terminated = true;      // initialize terminate as true
        }
    }// terminates the staff
    public void printDetails(){
    super.printDetails();
        if (joined == true) {           // checks if joined status is true
          System.out.println("Staff Nameof the staff :"+getStaffName());
          System.out.println("Wages per hour of the staff :"+getWagesPerHour());
          System.out.println("Working hour of the staff :"+getWorkingHour());
          System.out.println("Joined date of the staff :"+getJoiningDate());            //prints detail of the staff
          System.out.println("Qualifcation of the staff :"+getQualification());
          System.out.println("Income per day of the staff :"+((getWagesPerHour()*getWorkingHour())));
        }
    }// Displays the detail of part time staff
}