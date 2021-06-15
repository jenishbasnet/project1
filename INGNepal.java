import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
//importing javax.swing package
import java.awt.Font;       
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//importing java.awt package        
import java.util.ArrayList;
//importing arraylist from java.util pacakge       
                
public class INGNepal{
        
    private JFrame window1; 
            
    private JTextField tfVacancy;
    private JTextField tfDesignation;
    private JTextField tfWorkingHour;
    private JTextField tfJobType;
    private JTextField tfSalary;
    private JTextField tfVacancyFT;
    private JTextField tfStaffNameFT;
    private JTextField tfJoiningDateFT;
    private JTextField tfQualificationFT;
    private JTextField tfAppointedByFT;
            
    private JTextField tfVacancy1;
    private JTextField tfDesignation1;
    private JTextField tfWorkingHour1;
    private JTextField tfJobType1;
    private JTextField tfShift1;
    private JTextField tfWages1;
    private JTextField tfVacancyPT;
    private JTextField tfStaffNamePT;
    private JTextField tfJoiningDatePT;
    private JTextField tfQualificationPT;
    private JTextField tfAppointedByPT;
    private JTextField tfTerminate;
           
    ArrayList<StaffHire> li = new ArrayList<StaffHire>();
    //global variable
            
         
    public INGNepal(){
            initializeFrame();
            initializeMenu();
            initializeFullTimeStaff();
            initializePartTimeStaff();      
        }//Constructor
            private void initializeFrame(){
                window1 = new JFrame("INGNepal");
                window1.setSize(730,823);
                window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window1.setLayout(null);
                window1.setResizable(false);
        
            }//Initialized size, close operation, layout, tittle of frame and resizable propert of frame 
                
            private void initializeMenu(){
                        JMenuBar menuBar = new JMenuBar();
                        menuBar.setBounds(0,0,730,26);
                        window1.add(menuBar);
                        //Added menu bar to frame
                        JMenu mnFile = new JMenu("File");
                        menuBar.add(mnFile);
                        //Added file menu to menu bar
                        JMenu mnAbout = new JMenu("About");
                        menuBar.add(mnAbout);
                        //Added about menu to menu bar
                        JMenuItem mniNew = new JMenuItem("New");
                        mnFile.add(mniNew);
                        mniNew.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent ae){
                                   newForm();
                                } // calss newForm() method
                        });
                        JMenuItem mniExit = new JMenuItem("Exit");
                        mnFile.add(mniExit);
                        mniExit.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent ae){
                                    System.exit(JFrame.EXIT_ON_CLOSE);
                                }
                        });
                        
                        // Added New and Exit menu item to file menu
                        
                        JMenuItem mniVersion = new JMenuItem("Version");
                        mnAbout.add(mniVersion);
                        mniVersion.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent ae){
                                    JOptionPane.showMessageDialog(window1,"Version 1.0.1","Version",JOptionPane.INFORMATION_MESSAGE);
                                }
                        });
                        
                        JMenuItem mniDeveloper = new JMenuItem("Developer");
                        mnAbout.add(mniDeveloper);
                        mniDeveloper.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent ae){
                                    JOptionPane.showMessageDialog(window1,"Developed by : Jenish Basnet","Developer",JOptionPane.INFORMATION_MESSAGE);
                                }
                        });
                        // Added developer and version menu item to about menu
                    }//For menu in Frame
                    
                private void initializeFullTimeStaff(){
                        Font headingFont = new Font("Arial",Font.ITALIC,20);
                        
                        JLabel lblHeadingFullTime = new JLabel("__________________________FOR FULL TIME_______________________________E");
                        lblHeadingFullTime.setBounds(0,38,820,30);
                        lblHeadingFullTime.setFont(headingFont);
                        window1.add(lblHeadingFullTime);
                        //JLabel for heading of full time form
                        JLabel lblVacancy = new JLabel("Vacancy Number :");
                        lblVacancy.setBounds(42,80,106,14);
                        window1.add(lblVacancy);
                        //JLabel for vacancy number
                        JLabel lblDesignation = new JLabel("Designation :");
                        lblDesignation.setBounds(65,110,86,14);
                        window1.add(lblDesignation);
                        //JLabel fo designation
                        JLabel lblWorkingHour = new JLabel("Working hour per day :");
                        lblWorkingHour.setBounds(12,140,130,16);
                        window1.add(lblWorkingHour);
                        //JLabel for working hour
                        JLabel lblJobType = new JLabel("Job Type :");
                        lblJobType.setBounds(410,75,86,14);
                        window1.add(lblJobType);
                        //JLabel for job type
                        JLabel lblSalary = new JLabel("Salary :");
                        lblSalary.setBounds(424,105,86,14);
                        window1.add(lblSalary);
                        //JLabel for salary
                        JLabel lblVacancyFT = new JLabel("Vacancy number :");
                        lblVacancyFT.setBounds(42,200,106,14);
                        window1.add(lblVacancyFT);
                        //JLabel for vacancy
                        JLabel lblStaffNameFT = new JLabel("StaffName :");
                        lblStaffNameFT.setBounds(75,230,106,14);
                        window1.add(lblStaffNameFT);
                        //JLabel for staff name
                        JLabel lblJoiningDateFT = new JLabel("Joining Date :");
                        lblJoiningDateFT.setBounds(63,260,106,14);
                        window1.add(lblJoiningDateFT);
                        //JLabel for joining date
                        JLabel lblQualificationFT = new JLabel("Qualification :");
                        lblQualificationFT.setBounds(400,200,106,14);
                        window1.add(lblQualificationFT);
                        //JLabel for qualification
                        JLabel lblAppointedByFT = new JLabel("Appointed by :");
                        lblAppointedByFT.setBounds(400,230,106,14);
                        window1.add(lblAppointedByFT);
                        //JLabel for appointed by
                        tfVacancy = new JTextField();
                        tfVacancy.setBounds(180,78,180,20);
                        window1.add(tfVacancy);
                        //JTextField for vacancy number
                        tfDesignation = new JTextField();
                        tfDesignation.setBounds(180,109,180,20);
                        window1.add(tfDesignation);
                        //JTextField for designation
                        tfWorkingHour = new JTextField();
                        tfWorkingHour.setBounds(180,142,180,20);
                        window1.add(tfWorkingHour);
                        //JTextField for working hour
                        tfJobType = new JTextField();
                        tfJobType.setBounds(500,73,180,20);
                        window1.add(tfJobType);
                        //JTextField for job type
                        tfSalary = new JTextField();
                        tfSalary.setBounds(500,105,180,20);
                        window1.add(tfSalary);
                        //JTextField for salary
                        tfVacancyFT = new JTextField();
                        tfVacancyFT.setBounds(180,199,180,20);
                        window1.add(tfVacancyFT);
                        //JTextField for vacancy number to appoint
                        tfStaffNameFT = new JTextField();
                        tfStaffNameFT.setBounds(180,229,180,20);
                        window1.add(tfStaffNameFT);
                        //JTextField for staff name
                        tfJoiningDateFT = new JTextField();
                        tfJoiningDateFT.setBounds(180,259,180,20);
                        window1.add(tfJoiningDateFT);
                        //JTextField for joining date
                        tfQualificationFT = new JTextField();
                        tfQualificationFT.setBounds(500,199,180,20);
                        window1.add(tfQualificationFT);
                        //JTextField for qualification
                        tfAppointedByFT = new JTextField();
                        tfAppointedByFT.setBounds(500,229,180,20);
                        window1.add(tfAppointedByFT);
                        //JTextField for appointed by
                        JButton btnAddFullTime = new JButton("Add");
                        btnAddFullTime.setBounds(500,146,180,30);
                        window1.add(btnAddFullTime);
                        btnAddFullTime.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent ae){
                                addFullTime();     //calls addFullTime() method
                            }
                        });
                        //JButton to add vacancy number for full time staff
                        JButton btnAppointFullTime = new JButton("Appoint");
                        btnAppointFullTime.setBounds(500,259,180,30);
                        window1.add(btnAppointFullTime);
                        btnAppointFullTime.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent ae){
                                appointFullTime();    //calls appointFullTime()method
                            }
                        });
                        //JButton to appoint full time staff
                    
                        JButton btnClearFullTime = new JButton("Clear");
                        btnClearFullTime.setBounds(500,309,180,30);
                        window1.add(btnClearFullTime);
                        btnClearFullTime.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent ae){
                                clearFullTime();      //calls clearFullTime()method
                            }
                        });
                        //JButton to clear all the text field
                        JButton btnDisplayFullTime = new JButton("Display");
                        btnDisplayFullTime.setBounds(180,309,180,30);
                        window1.add(btnDisplayFullTime);
                        btnDisplayFullTime.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent ae){
                                displayFullTime();    //calls displayFullTime()method
                            }
                        });
                        //JButton to display the detail of full time staff
                    }// For Full Time Staff
    
            private void initializePartTimeStaff(){
                    Font headingFont = new Font("Arial",Font.ITALIC,20);
                    
                    JLabel lblHeadingPartTime = new JLabel("__________________________FOR PART TIME_______________________________");
                    lblHeadingPartTime.setBounds(0,390,823,30);
                    lblHeadingPartTime.setFont(headingFont);
                    window1.add(lblHeadingPartTime);
                    //JLabel for heading of part time form
                    
                    JLabel lblVacancy1 = new JLabel("Vacancy Number :");
                    lblVacancy1.setBounds(42,430,106,14);
                    window1.add(lblVacancy1);
                    //JLabel for vacancy number
                    JLabel lblDesignation1 = new JLabel("Designation :");
                    lblDesignation1.setBounds(65,460,86,14);
                    window1.add(lblDesignation1);
                    //JLabel for designation
                    JLabel lblWorkingHour1 = new JLabel("Working hour per day :");
                    lblWorkingHour1.setBounds(12,490,130,16);
                    window1.add(lblWorkingHour1);
                    //JLabel for working hour
                    JLabel lblJobType1 = new JLabel("Job Type :");
                    lblJobType1.setBounds(412,430,86,14);
                    window1.add(lblJobType1);
                    //JLabel for job type
                    JLabel lblShift1 = new JLabel("Shift  :");
                    lblShift1.setBounds(432,460,86,14);
                    window1.add(lblShift1);
                    //JLabel for shift
                    JLabel lblWages1 = new JLabel("Wages per hour :");
                    lblWages1.setBounds(374,490,105,14);
                    window1.add(lblWages1);
                    //JLabel for wages
                    
                    JLabel lblVacancyPT = new JLabel("Vacancy number :");
                    lblVacancyPT.setBounds(42,559,106,14);
                    window1.add(lblVacancyPT);
                    //JLabel for vacancy number to appoint
                    JLabel lblStaffNamePT = new JLabel("StaffName :");
                    lblStaffNamePT.setBounds(75,589,106,14);
                    window1.add(lblStaffNamePT);
                    //JLabel for staff name
                    JLabel lblJoiningDatePT = new JLabel("Joining Date :");
                    lblJoiningDatePT.setBounds(63,619,106,14);
                    window1.add(lblJoiningDatePT);
                    //JLabel for joining date
                    JLabel lblQualificationPT = new JLabel("Qualification :");
                    lblQualificationPT.setBounds(400,559,106,14);
                    window1.add(lblQualificationPT);
                    //JLabel for qualification
                    JLabel lblAppointedByPT = new JLabel("Appointed by :");
                    lblAppointedByPT.setBounds(400,589,106,14);
                    window1.add(lblAppointedByPT);
                    //JLabel for appointed by
                    JLabel lblTerminate = new JLabel("Vacancy number :");
                    lblTerminate.setBounds(42,750,106,14);
                    window1.add(lblTerminate);
                    //JLabel for vacancy number to terminate
                    tfVacancy1 = new JTextField();
                    tfVacancy1.setBounds(180,429,180,20);
                    window1.add(tfVacancy1);
                    //JTextField for vacancy number to add
                    tfDesignation1 = new JTextField();
                    tfDesignation1.setBounds(180,459,180,20);
                    window1.add(tfDesignation1);
                    //JTextField for designation
                    tfWorkingHour1 = new JTextField();
                    tfWorkingHour1.setBounds(180,489,180,20);
                    window1.add(tfWorkingHour1);
                    //JTextField for working hour
                    tfJobType1 = new JTextField();
                    tfJobType1.setBounds(500,429,180,20);
                    window1.add(tfJobType1);
                    //JTextField for job type
                    tfShift1 = new JTextField();
                    tfShift1.setBounds(500,459,180,20);
                    window1.add(tfShift1);
                    //JTextField for shift
                    tfWages1= new JTextField();
                    tfWages1.setBounds(500,489,180,20);
                    window1.add(tfWages1);
                    //JTextField for wages
                    tfVacancyPT = new JTextField();
                    tfVacancyPT.setBounds(180,558,180,20);
                    window1.add(tfVacancyPT);
                    //JTextField for vacancy number to appoint
                    tfStaffNamePT = new JTextField();
                    tfStaffNamePT.setBounds(180,588,180,20);
                    window1.add(tfStaffNamePT);
                    //JTextField for staff name
                    tfJoiningDatePT = new JTextField();
                    tfJoiningDatePT.setBounds(180,618,180,20);
                    window1.add(tfJoiningDatePT);
                    //JTextField for joing date
                    tfQualificationPT = new JTextField();
                    tfQualificationPT.setBounds(500,558,180,20);
                    window1.add(tfQualificationPT);
                    //JTextField for qualification
                    tfAppointedByPT = new JTextField();
                    tfAppointedByPT.setBounds(500,588,180,20);
                    window1.add(tfAppointedByPT);
                    //JTextField for appointed by                                    
                    tfTerminate = new JTextField();
                    tfTerminate.setBounds(180,749,180,20);
                    window1.add(tfTerminate);
                    //JTextField for vacacny number to terminate
                    JButton btnAddPartTime = new JButton("Add");
                    btnAddPartTime.setBounds(500,519,180,30);
                    window1.add(btnAddPartTime);
                    btnAddPartTime.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent ae){
                            addPartTime();  //calls addPartTime()method
                        }
                    });
                    //JButton to add vacancy number for part time staff
                    JButton btnAppointPartTime = new JButton("Appoint");
                    btnAppointPartTime.setBounds(500,639,180,30);
                    window1.add(btnAppointPartTime);
                    btnAppointPartTime.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent ae){
                            appointPartTime();  //calls appointPartTime()method
                        }
                    });
                    //JButton to appoint part time staff
                    JButton btnClearPartTime = new JButton("Clear");
                    btnClearPartTime.setBounds(500,689,180,30);
                    window1.add(btnClearPartTime);
                    btnClearPartTime.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent ae){
                            clearPartTime();    //calls clearPartTime()method
                        }
                    });
                    //JButton to clear all the text field of part time form
                    JButton btnDisplayPartTime = new JButton("Display");
                    btnDisplayPartTime.setBounds(180,689,180,30);
                    window1.add(btnDisplayPartTime);
                    btnDisplayPartTime.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent ae){
                           displayPartTime();   //calls displayPartTime() method
                        }
                    });
                    //JButton to display detail of part time staff
                    JButton btnTerminate = new JButton("Terminate");
                    btnTerminate.setBounds(500,743,180,30);
                    window1.add(btnTerminate);
                    btnTerminate.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent ae){
                            terminate();    //calls terminate() method
                        }
                    });
                    //JButton to terminate part time staff
                        
                }//FOR Part Time
            
        public void newForm(){
            tfVacancy.setText(null);
            tfDesignation.setText(null);
            tfWorkingHour.setText(null);
            tfJobType.setText(null);
            tfSalary.setText(null);
            tfVacancyFT.setText(null);
            tfStaffNameFT.setText(null);
            tfJoiningDateFT.setText(null);
            tfQualificationFT.setText(null);
            tfAppointedByFT.setText(null);
            tfVacancy1.setText(null);
            tfDesignation1.setText(null);
            tfWorkingHour1.setText(null);
            tfJobType1.setText(null);       //initializes the value of all text field as empty
            tfShift1.setText(null);
            tfWages1.setText(null);        
            tfVacancyPT.setText(null);
            tfStaffNamePT.setText(null);
            tfJoiningDatePT.setText(null);
            tfQualificationPT.setText(null);
            tfAppointedByPT.setText(null);
            tfTerminate.setText(null);
        }//method to clear all the text field
        
        public void clearFullTime(){
            tfVacancy.setText(null);
            tfDesignation.setText(null);
            tfWorkingHour.setText(null);
            tfJobType.setText(null);        //initializes the value of text field as empty
            tfSalary.setText(null);
            tfVacancyFT.setText(null);
            tfStaffNameFT.setText(null);
            tfJoiningDateFT.setText(null);
            tfQualificationFT.setText(null);
            tfAppointedByFT.setText(null);
        }//method to clear all the text field of full time form
        
        public void clearPartTime(){
            tfVacancy1.setText(null);
            tfDesignation1.setText(null);
            tfWorkingHour1.setText(null);
            tfJobType1.setText(null);
            tfShift1.setText(null);
            tfWages1.setText(null);        //initializes the value of text field as empty
            tfVacancyPT.setText(null);
            tfStaffNamePT.setText(null);
            tfJoiningDatePT.setText(null);
            tfQualificationPT.setText(null);
            tfAppointedByPT.setText(null);
            tfTerminate.setText(null);
        }//method to clear all the text field of part time form
        
        public void addFullTime(){
            try{
                String vacancyNumber = tfVacancy.getText();
                String designation = tfDesignation.getText();
                String workingHour = tfWorkingHour.getText();
                String jobType = tfJobType.getText();
                String salary = tfSalary.getText();
                //Getting input value from text field
            
                    if (vacancyNumber.trim().equals("") || designation.trim().equals("") || workingHour.trim().equals("") ||  jobType.trim().equals("") || salary.trim().equals("")){
                        JOptionPane.showMessageDialog(window1,"Please fill all the fields before adding it","Error",JOptionPane.ERROR_MESSAGE);
                        //if any of the text field is empty shows an error message
                    }else{
                        int VacancyNumber = Integer.parseInt(vacancyNumber);
                        int WorkingHour = Integer.parseInt(workingHour);
                        int Salary = Integer.parseInt(salary);
                        //Converted string variable into integer
                        if (WorkingHour > 24) { //Checks if working hour is more than 24
                            JOptionPane.showMessageDialog(window1,"Employee cant work for more than 24 hours in a day","Error",JOptionPane.ERROR_MESSAGE);
                        }else{ //if working hour is less than 24 
                                boolean vacancyStatus = true;
                                for (StaffHire s:li){   //for each staff in list 
                                    if(s.getVacancyNumber() == VacancyNumber){  //compares if vacancy number exist in the list
                                        vacancyStatus = false;
                                        break;
                                    }
                                  }
                                if(vacancyStatus == true){  //check if vacancy staus is true
                                    li.add(new FullTimeStaffHire(VacancyNumber,designation,jobType ,Salary, WorkingHour));
                                    JOptionPane.showMessageDialog(window1,"Vacancy number sucessfully added","Information",JOptionPane.INFORMATION_MESSAGE);
                                }else{  //if vacancy status is false
                                    JOptionPane.showMessageDialog(window1,"Vacancy number already exists","Error",JOptionPane.ERROR_MESSAGE);
                                       
                                }
                            }
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(window1,"Please enter the form with proper data.","ERROR",JOptionPane.ERROR_MESSAGE);
                return;
        
            }// Catches number format exception
        }//method to add vacancy number for full time staff
    
        public void addPartTime(){
        try{
            String vacancyNumber = tfVacancy1.getText();
            String designation = tfDesignation1.getText();
            String workingHour = tfWorkingHour1.getText();
            String jobType = tfJobType1.getText();
            String shift = tfShift1.getText();
            String wages = tfWages1.getText();
            //Getting input value from text field
        
                if (vacancyNumber.trim().equals("") || designation.trim().equals("") || workingHour.trim().equals("") ||  jobType.trim().equals("") || shift.trim().equals("") || wages.trim().equals("")){
                    JOptionPane.showMessageDialog(window1,"Please fill all the fields before adding it","Error",JOptionPane.ERROR_MESSAGE);
                    //if any of the text field is empty shows an error message
                }else{
                    int VacancyNumber = Integer.parseInt(vacancyNumber);
                    int WorkingHour = Integer.parseInt(workingHour);
                    int Wages = Integer.parseInt(wages);
                    //Converted string variable into integer
                    if (WorkingHour > 24) { //Checks if working hour is more than 24
                            JOptionPane.showMessageDialog(window1,"Employee cant work for more than 24 hours in a day","Error",JOptionPane.ERROR_MESSAGE);
                        }else{//if working hour is less than 24 
                            boolean vacancyStatus = true;
                            for(StaffHire s:li){    //for each staff in list
                                if(s.getVacancyNumber() == VacancyNumber){  //compares if vacancy number exist in the list
                                    vacancyStatus = false;
                                    break;
                                }
                            }
                            if (vacancyStatus == true){ //if vacancy status is true
                                li.add(new PartTimeStaffHire(VacancyNumber,designation,jobType,WorkingHour,Wages,shift));
                                JOptionPane.showMessageDialog(window1,"Vacancy number added to the list","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                            }else{ //if vacancy status is false
                                JOptionPane.showMessageDialog(window1,"Vacancy number already exists","Error",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                }   
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(window1,"Please enter the form with proper data.","ERROR",JOptionPane.ERROR_MESSAGE);
                return;
            }// Catches number format exception  
        }//method to add vacancy number for part time staff
    
    public void appointFullTime(){
        try{
            String vacancyNumber1 = tfVacancyFT.getText();
            String staffName = tfStaffNameFT.getText();
            String joiningDate = tfJoiningDateFT.getText();
            String qualification =tfQualificationFT.getText();
            String appointedBy = tfAppointedByFT.getText();
            //Getting input value from text field
            if (vacancyNumber1.trim().equals("") || staffName.trim().equals("") || joiningDate.trim().equals("") || qualification.trim().equals("") || appointedBy.trim().equals("")){
                JOptionPane.showMessageDialog(window1,"Please fill all the fields before appointing staff","Error",JOptionPane.ERROR_MESSAGE);
                //if any of text field is empty shows an error message
            }else{
                int VacancyNumber = Integer.parseInt(vacancyNumber1);
                //Converted string variable into integer
                boolean vacancyStatus = false;
                
                for (StaffHire sh : li){    //for each staff in list
                    if (sh.getVacancyNumber() == VacancyNumber){    //compares if vacancy number exist in the list
                        vacancyStatus = true;
                        if(sh instanceof FullTimeStaffHire){    //checks if object sh is isntance of FullTimeStaffHire
                            FullTimeStaffHire ft = (FullTimeStaffHire) sh;
                            if(ft.getJoined() == true){ //Checks if joined status of staff is true
                                JOptionPane.showMessageDialog(window1,"Staff has been already appointed","Error",JOptionPane.ERROR_MESSAGE);
                            }else{ // if joined status is false
                                ft.hireFullTimeStaff(staffName,joiningDate,qualification,appointedBy);
                                //calls hireFullTimeStaff() method from FullTimeStaffClass
                                String message = "Staff "+staffName+" has been apointed as full time staff" ;
                                JOptionPane.showMessageDialog(window1,message,"Sucessfyly appointed",JOptionPane.INFORMATION_MESSAGE);
                                clearFullTime();
                                break;
                                
                            
                            }
                        } else {    //if vacancy number doesn't exist in the list
                            vacancyStatus = false;
                        }
                    }
                }
                if(vacancyStatus == false){ //if vacancy status is false 
                        JOptionPane.showMessageDialog(window1,"Vacancy number doesnt exists or is of part time staff.","Error",JOptionPane.ERROR_MESSAGE);
                    }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(window1,"Please enter the form with proper data.","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }// Catches number format exception
        
    }// method to appoint full time staff
    public void appointPartTime(){
        try{
            String vacancyNumber1 = tfVacancyPT.getText();
            String staffName = tfStaffNamePT.getText();
            String joiningDate = tfJoiningDatePT.getText();
            String qualification =tfQualificationPT.getText();
            String appointedBy = tfAppointedByPT.getText();
            //Getting input value from text field
            if (vacancyNumber1.trim().equals("") || staffName.trim().equals("") || joiningDate.trim().equals("") || qualification.trim().equals("") || appointedBy.trim().equals("")){
                JOptionPane.showMessageDialog(window1,"Please fill all the fields before appointing staff","Error",JOptionPane.ERROR_MESSAGE);
                //if any of text field is empty shows an error message
            }else{
                int VacancyNumber = Integer.parseInt(vacancyNumber1);
                //Converted string variable into integer
                boolean vacancyStatus = false;
                
                for (StaffHire sh : li){    //for each staff in list
                    if (sh.getVacancyNumber() == VacancyNumber){    //compares if vacancy number exist in the list
                        vacancyStatus = true;
                        if(sh instanceof PartTimeStaffHire){    //checks if object sh is instance of PartTimeStaffHire
                            PartTimeStaffHire pt = (PartTimeStaffHire) sh;
                            if (pt.getJoined() == true){    //checks if joined status of staff is true
                               JOptionPane.showMessageDialog(window1,"Staff has been already appointed","Error",JOptionPane.ERROR_MESSAGE); 
                            }else{  //if joined status is falls
                                pt.hirePartTimeStaff(staffName,joiningDate,qualification,appointedBy);
                                //calls hirePartTimeStaff() method from PartTimeStaffClass
                                String message = "Staff "+staffName+" has been apointed as part time staff" ;
                                JOptionPane.showMessageDialog(window1,message,"Sucessfyly appointed",JOptionPane.INFORMATION_MESSAGE);
                                clearPartTime();
                                break;
                            }
                        } else{ //if vacancy number doesnt exist in the list
                            vacancyStatus = false;
                        }
                    }
                }
                if(vacancyStatus == false){ //checks if vacancy status is false
                        JOptionPane.showMessageDialog(window1,"Vacancy number doesnt exists or is of full time staff.","Error",JOptionPane.ERROR_MESSAGE);
                    }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(window1,"Please enter the form with proper data.","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }// Catches number format exception
        
    }//method to appooint part time staff
    public void terminate(){
        try{
            String VacancyNumber = tfTerminate.getText();
            //Geting vacancy number from text field
            if (VacancyNumber.trim().equals("")){   //checks if text field is empty
                JOptionPane.showMessageDialog(window1,"Please enter vacancy number","ERROR",JOptionPane.ERROR_MESSAGE);
            }else{ //if text field isn't empt
                int vacancyNumber = Integer.parseInt(VacancyNumber);
                //converted string variable into integer
                if (vacancyNumber < 0){ // if input value of vacancy number is less than 0
                    JOptionPane.showMessageDialog(window1,"Invalid vacancy number","ERROR",JOptionPane.ERROR_MESSAGE);
                }else{  // if input value of vacancy number is more than 0
                    boolean terminationStatus = false;
                    for (StaffHire sh : li){    //for each staff in list
                        if (sh instanceof PartTimeStaffHire){   //checks if object sh is instance of PartTimeStaffHire
                            PartTimeStaffHire pt = (PartTimeStaffHire) sh;
                            if (sh.getVacancyNumber() == vacancyNumber){    //compares if vacancy number exist in the list
                                terminationStatus = true;
                                String message = "Staff "+pt.getStaffName()+ ", has been terminated";
                                li.remove(pt); //removes staff from the list
                                pt.terminateStaff();
                                //calls terminateStaff() method from PartTimeStaffClass
                                JOptionPane.showMessageDialog(window1,message,"Information",JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        }else{
                            terminationStatus = false;
                        }
                    }
                    if(terminationStatus == false){ //checks if terminationStatus is false
                        JOptionPane.showMessageDialog(window1,"Vacancy number doesnt exists or is of full time staff.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(window1,"Invalid vacancy number","ERROR",JOptionPane.ERROR_MESSAGE);
            return; 
        }// Catches number format exception
    }// method to terminate part time staff
    public void displayFullTime(){
        if(li.size()<1){    //checks if list is empt
           JOptionPane.showMessageDialog(window1,"No data found to be displayed","ERROR",JOptionPane.ERROR_MESSAGE); 
        }else{  //if list isn't empt
            System.out.println();
            System.out.println("******Details of Full Time Staff*******");
            for (StaffHire sh : li){    //for each staff in list
                if (sh instanceof FullTimeStaffHire){
                    FullTimeStaffHire ft = (FullTimeStaffHire) sh;
                    ft.printDetails();
                }
                System.out.println();
            }
        } 
    }//method to display details of full time staff
    public void displayPartTime(){
        if(li.size()<1){    //checks if list is empty
           JOptionPane.showMessageDialog(window1,"No data found to be displayed for ","ERROR",JOptionPane.ERROR_MESSAGE); 
        }else{  //if list isn't empt
            System.out.println();
            System.out.println("*******Details of Part Time Staff*******");
            for (StaffHire sh:li){ //for each staff hire in list
                if(sh instanceof PartTimeStaffHire){    //checks if sh is the instance of PartTimeStaffHire
                    PartTimeStaffHire pt = (PartTimeStaffHire) sh;  // casting object of StaffHire as PartTimeStaffHire
                    pt.printDetails();     
                }
                System.out.println();
            }
        }
    }//method to display detail of part time staff

    public static void main(String [] args){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new INGNepal().window1.setVisible(true); //Object if INGNepal create
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//main method
}


   


