public class StaffHire{
    public int vacancyNumber;
    public String designation;
    public String jobType;
    //Attributes
  public StaffHire(int vacancyNumber,String designation,String jobType){   
    this.vacancyNumber = vacancyNumber;  //adds vacacny number for part time staff
    this.designation = designation;        // initialize new variable as attribute
    this.jobType = jobType;
  }    //Constructor
  public int getVacancyNumber(){
    return vacancyNumber;
  }
  public String getDesignation(){
    return designation;
  }
  public String getJobType(){
    return jobType;
  } //Getter (Encapsulation)
  public void setVacancyNumber(int vacancyNumber){
    this.vacancyNumber = vacancyNumber;
  }
  public void setDesignation(String designation){
    this.designation = designation;
  }
  public  void setJobType(String jobType){
    this.jobType = jobType;
  }    // Setter (Encapsulation)
    public void printDetails(){          
    System.out.println("Vacancy Number of the staff :"+getVacancyNumber());
    System.out.println("Designation of the staff :"+getDesignation());
    System.out.println("Job Type of the staff :"+getJobType());         
    }    //To display details of staff
}