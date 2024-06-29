import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;

public class GUI {
    // creating arraylist for teacher class
    ArrayList <Teacher> teacherArray = new ArrayList <Teacher> ();
        
    //Decalaring all the JFrame used in program
    JFrame homeFrame,LecturerGUIFrame,TutorGUIFrame,gradeAssignmentGUIFrame,setSalaryGUIFrame,removeTutorFrame;
    
    //Decalring all the JPanel used in program
    JPanel homePanel,LecturerPanel,TutorPanel,gradeAssignmentPanel,setSalaryPanel,removeTutorPanel;
    
    //Declaring all the JLabel used in program
    JLabel title,LecturerTitle,TeacherID,TeacherName,Address,WorkingType,EmploymentStatus,gradedScore,Department,YearsOfExperience,WorkingHours,
    TutorTitle,TutorTeacherID,TutorTeacherName,TutorAddress,TutorWorkingType,academicQualifications,TutorEmploymentStatus,TutorWorkingHours,Salary,Specialization,PerformanceIndex,gradeAssignmentTitle,gradeTeacherId,gradedScoreJLabel,departmentGrade,YOE,
    setSalaryTitle,TeacherID_setSalary,salary_setSalary,performanceIndex_setSalary,titleRemoveTutor,removeTutorTeacherID,removeTutorTeacherName;

    JTextField TeacherIDTextField,TeacherNameTextField,AddressTextField, WorkingTypeTextField,EmploymentStatusTextField,DepartmentTextField,academicQualificationsTextField,yearsOfExperienceTextField,workingHoursTextField,
    TutorTeacherIDTextField,TutorTeacherNameTextField,TutorAddressTextField,TutorWorkingTypeTextField,TutorEmploymentStatusTextField,TutorWorkingHoursTextField,SalaryTextField,SpecializationTextField,performanceIndexTextField,
    gradeTeacherIDTextField,gradedScoreJLabelTextField,departmentGradeTextField,YOETextField,
    TeacherID_setSalaryTextField,salary_setSalary_TextField2,performanceIndex_setSalary_TextField,removeTutorTeacherIDTextField,removeTutorTeacherNameTextField;
    
    //Declaring all the JButton used in program
    JButton LecturerButton,TutorButton,addLecturer,clearButton,gradeAssignmentButton,BackButton,DisplayButton,
    TutorBackButton,TutorClearButton,TutorDisplayButton,addTutorButton,setSalaryButton,removeTutorButton,
    gradeBackButton,gradeAssignmentButton2,displayButton2,
    setSalaryBackButton,setSalaryButton2,removeTutorBackButton,removeTutorButton2,gradeAssignmentClearButton,clearRemoveTutor;
    
    //declaring all the JTextarea used in program
    JTextArea aboutus;

    ImageIcon profile;
    Image image,newImage;

    // frame for home page 
    public GUI(){
        homeFrame = new JFrame("Home Page");
        
        homePanel = new JPanel();
        homePanel.setLayout(null);
        homeFrame.add(homePanel);


        profile = new ImageIcon("homepage.png");
        // resize the image
        image = profile.getImage();
        newImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        profile = new ImageIcon(newImage);

        title = new JLabel("Welcome To Teacher Management System");
        title.setBounds(430,28,1000,114);
        title.setFont(new Font("Georgia", Font.PLAIN, 45));
        title.setIcon(profile);
        homePanel.add(title);

        aboutus = new JTextArea("\n\n The Teacher management System is desiged to optimize the management of  teachers, tutors and lecturers"
        +"\n\n With its user-friendly interface, you can easily add  new staff assign grades, set salaries for tutors and much " 
        +"\n\n more. Simply click on either 'Lecturer' or 'Tutor' to begin managing the staff according  to your needs.");

        // About us - Home Page
        aboutus.setBounds(0,256,1855,407);
        aboutus.setEditable(false);
        aboutus.setFont(new Font("Georgia",Font.PLAIN,35));
        aboutus.setForeground(Color.BLACK);
        aboutus.setLineWrap(true);
        homePanel.add(aboutus);

        
        //create button named LecturerButton - Home page
        LecturerButton = new JButton("Lecturer");
        LecturerButton.setBounds(460,762,227,62);
        LecturerButton.setBackground(Color.BLACK);
        LecturerButton.setForeground(Color.WHITE);
        LecturerButton.setFont(new Font("Georgia",Font.BOLD,16));
        homePanel.add(LecturerButton);
        LecturerButton.addActionListener(new ActionListener(){
            //actionPerformed(Action event e method calls callLecturer() when LecturerButton is clicked
            public void actionPerformed(ActionEvent e){
                callLecturer();
                homeFrame.dispose();
            }
        });
      
        
        //Tutor Button - Home Page
        TutorButton = new JButton("Tutor");
        TutorButton.setBounds(1044,762,277,62);
        TutorButton.setBackground(Color.BLACK);
        TutorButton.setForeground(Color.WHITE);
        TutorButton.setFont(new Font("Georgia",Font.BOLD,16));
        homePanel.add(TutorButton);
        TutorButton.addActionListener(new ActionListener(){
            @Override
            // this method calls callTutor() method when TutorButton is clicked
            public void actionPerformed(ActionEvent e){
                callTutor();
                homeFrame.dispose();
            }
        });
        homeFrame.setSize(1855,920);
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setLocationRelativeTo(null);
        homeFrame.setResizable(false);
        homeFrame.setVisible(true);
    }
    
   
    //frame for lecturer page
    void callLecturer(){
            //JFrame for Lecturer Page
            LecturerGUIFrame = new JFrame();
    
            //JPanel for Lecturer Page
            LecturerPanel = new JPanel();
            LecturerPanel.setLayout(null);
            LecturerPanel.setBounds(0,0,800,50);
            LecturerPanel.setBackground(new Color(214, 214, 214));
            LecturerGUIFrame.add(LecturerPanel);
            
            //Title
            LecturerTitle = new JLabel("Teacher Management System");
            LecturerTitle.setBounds(303,16,535,45);
            LecturerTitle.setFont(new Font("Georgia",Font.BOLD,35));
            LecturerPanel.add(LecturerTitle);
    
            //Teacher ID
            TeacherID = new JLabel("Teacher ID");
            TeacherID.setBounds(154,108,298,47);
            TeacherID.setFont(new Font("Georgia",Font.PLAIN,24));
            LecturerPanel.add(TeacherID);
            
            TeacherIDTextField = new JTextField();
            TeacherIDTextField.setBounds(154,161,394,50);
            TeacherIDTextField.setFont(new Font("Georgia",Font.PLAIN,18));
            LecturerPanel.add(TeacherIDTextField);
    
    
            //Teacher Name
            TeacherName = new JLabel("Teacher Name ");
            TeacherName.setBounds(154,241,298,47);
            TeacherName.setFont(new Font("Georgia",Font.PLAIN,24));
            LecturerPanel.add(TeacherName);
    
            TeacherNameTextField= new JTextField();
            TeacherNameTextField.setBounds(154,297,394,50);
            TeacherNameTextField.setFont(new Font("Georgia",Font.PLAIN,18));
            LecturerPanel.add(TeacherNameTextField);
    
    
            //Address
            Address = new JLabel("Address");
            Address.setBounds(154,377,298,47);
            Address.setFont(new Font("Georgia",Font.PLAIN,24));
            LecturerPanel.add(Address);
    
            AddressTextField = new JTextField();
            AddressTextField.setBounds(154,434,394,50);
            AddressTextField.setFont(new Font("Georgia",Font.PLAIN,18));
            LecturerPanel.add(AddressTextField);
    
    
            //Working Type
            WorkingType = new JLabel("Working Type");
            WorkingType.setBounds(154,514,298,47);
            WorkingType.setFont(new Font("Georgia",Font.PLAIN,24));
            LecturerPanel.add(WorkingType);
    
            WorkingTypeTextField = new JTextField();
            WorkingTypeTextField.setBounds(154,570,394,50);
            WorkingTypeTextField.setFont(new Font("Georgia",Font.PLAIN,18));
            LecturerPanel.add(WorkingTypeTextField);
    
    
            //Employment Status
            EmploymentStatus = new JLabel("Employment Status");
            EmploymentStatus.setBounds(664,108,298,47);
            EmploymentStatus.setFont(new Font("Georgia",Font.PLAIN,24));
            LecturerPanel.add(EmploymentStatus);
    
            EmploymentStatusTextField = new JTextField();
            EmploymentStatusTextField.setBounds(664,161,394,50);
            EmploymentStatusTextField.setFont(new Font("Georgia",Font.PLAIN,18));
            LecturerPanel.add(EmploymentStatusTextField);
    
    
            //Department
            Department = new JLabel("Department");
            Department.setBounds(664,241,298,47);
            Department.setFont(new Font("Georgia",Font.PLAIN,24));
            LecturerPanel.add(Department);
    
            DepartmentTextField = new JTextField();
            DepartmentTextField.setBounds(664,297,394,50);
            DepartmentTextField.setFont(new Font("Georgia",Font.PLAIN,18));
            LecturerPanel.add(DepartmentTextField);
    
    
            //Years of Experience
            YearsOfExperience = new JLabel("Years Of Experience");
            YearsOfExperience.setBounds(664,377,298,47);
            YearsOfExperience.setFont(new Font("Georgia",Font.PLAIN,24));
            LecturerPanel.add(YearsOfExperience);
    
            //JSpinner - years of experience 
            yearsOfExperienceTextField = new JTextField();
            yearsOfExperienceTextField.setBounds(664, 434, 394, 50);
            yearsOfExperienceTextField.setFont(new Font("Georgia", Font.PLAIN, 18));
            LecturerPanel.add(yearsOfExperienceTextField);
    
    
            //Working hours
            WorkingHours = new JLabel("Working Hours");
            WorkingHours.setBounds(664,514,298,47);
            WorkingHours.setFont(new Font("Georgia",Font.PLAIN,24));
            LecturerPanel.add(WorkingHours);
    
            //JSpinner for Working hours
            workingHoursTextField = new JTextField();
            workingHoursTextField.setBounds(664, 570, 394, 50);
            workingHoursTextField.setFont(new Font("Georgia", Font.PLAIN, 18));
            LecturerPanel.add(workingHoursTextField);
            
            
            //Add Lecturer Button
            addLecturer = new JButton("Add Lecturer");
            addLecturer.setBounds(1301,288,249,45);
            addLecturer.setFont(new Font("Georgia",Font.BOLD,18));
            addLecturer.setBackground(Color.BLACK);
            addLecturer.setForeground(Color.WHITE);
            addLecturer.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    addLecturer();
                }
            });
            LecturerPanel.add(addLecturer);
    
    
            //Grade Assignment Button
            gradeAssignmentButton = new JButton("Grade Assignment");
            gradeAssignmentButton.setBounds(1301,450,249,45);
            gradeAssignmentButton.setFont(new Font("Georgia",Font.BOLD,16));
            gradeAssignmentButton.setBackground(Color.BLACK);
            gradeAssignmentButton.setForeground(Color.WHITE);
            gradeAssignmentButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    callGradeAssignment();
                    LecturerGUIFrame.dispose();
                }
            });
            LecturerPanel.add(gradeAssignmentButton);
    
            
            //Display Button
            DisplayButton = new JButton("Display");
            DisplayButton.setBounds(804,731,254,45);
            DisplayButton.setFont(new Font("Georgia",Font.BOLD,16));
            DisplayButton.setBackground(Color.BLACK);
            DisplayButton.setForeground(Color.WHITE);
            DisplayButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    display();
                }
            });
            LecturerPanel.add(DisplayButton);
            
    
            //Back Button
            BackButton = new JButton("Back");
            BackButton.setBounds(154,731,193,45);
            BackButton.setFont(new Font("Georgia",Font.BOLD,16));
            BackButton.setBackground(Color.BLACK);
            BackButton.setForeground(Color.WHITE);
            BackButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    new GUI();
                    LecturerGUIFrame.dispose();
                }
                
            });
            LecturerPanel.add(BackButton);
    
    
            //Clear Button 
            clearButton = new JButton("Clear");
            clearButton.setBounds(452,731,243,45);
            clearButton.setFont(new Font("Georgia",Font.BOLD,16));
            clearButton.setBackground(Color.BLACK);
            clearButton.setForeground(Color.WHITE);
            
            clearButton.addActionListener(new ActionListener(){
                // TeacherIDTextField,TeacherNameTextField,AddressTextField, WorkingTypeTextField,EmploymentStatusTextField,DepartmentTextField,academicQualificationsTextField
                @Override
                public void actionPerformed(ActionEvent e){
                    clear();
                }
            });
            LecturerPanel.add(clearButton);
            
            LecturerGUIFrame.setSize(1855,920);
            LecturerGUIFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            LecturerGUIFrame.setResizable(false);
            LecturerGUIFrame.setVisible(true);
        }
        
    void addLecturer(){
        if (TeacherIDTextField.getText().trim().isEmpty() || TeacherNameTextField.getText().trim().isEmpty() || AddressTextField.getText().trim().isEmpty() || WorkingTypeTextField.getText().trim().isEmpty() || EmploymentStatusTextField.getText().trim().isEmpty() ||DepartmentTextField.getText().trim().isEmpty() || yearsOfExperienceTextField.getText().trim().isEmpty() || workingHoursTextField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(LecturerGUIFrame,"One or more text Fileds are empty","Alert",JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                int TeacherID = Integer.parseInt(TeacherIDTextField.getText());
                String TeacherName = TeacherNameTextField.getText();
                String address = AddressTextField.getText();
                String working_type = WorkingTypeTextField.getText();
                String emplyoyment_status = EmploymentStatusTextField.getText();
                String department = DepartmentTextField.getText();
                int years_of_experience = Integer.parseInt(yearsOfExperienceTextField.getText());
                int working_hours = Integer.parseInt(workingHoursTextField.getText());

                

                boolean isTeacherIDUnique = true;
                
                for (Teacher obj : teacherArray){
                    if (obj instanceof Lecturer){
                        if (TeacherID == obj.getTeacherId()){
                            JOptionPane.showMessageDialog(null,"The teacher you are trying to add already exist in our system");
                            isTeacherIDUnique = false; 
                        }
                    }
                }
                if (years_of_experience>20) {
                    JOptionPane.showMessageDialog(LecturerGUIFrame, "Years of experience must not exeed 20 ","warning",JOptionPane.WARNING_MESSAGE);
                    isTeacherIDUnique = false;
                }

                if(working_hours>20){
                    JOptionPane.showMessageDialog(LecturerGUIFrame,"Working Hour must not exceed 20","warning",JOptionPane.WARNING_MESSAGE);
                    isTeacherIDUnique = false;
                }

                if(isTeacherIDUnique){
                    Lecturer lecturerObj = new Lecturer(TeacherID, TeacherName, address, working_type, emplyoyment_status, department, years_of_experience, working_hours);
                    teacherArray.add(lecturerObj);
                    JOptionPane.showMessageDialog(null, "Lecturer added Sucessfully","Added",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Please input data in correct format ", "message Box", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
    }

    void grade(){
        if (gradeTeacherIDTextField.getText().trim().isEmpty() || gradedScoreJLabelTextField.getText().trim().isEmpty() ||departmentGradeTextField.getText().trim().isEmpty() || YOETextField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(gradeAssignmentGUIFrame, "Text field found empty", "Text Field found empty",JOptionPane.WARNING_MESSAGE);
        }
        else{
            
            try{
                int teacherID = Integer.parseInt(gradeTeacherIDTextField.getText());
                int gradedScore = Integer.parseInt(gradedScoreJLabelTextField.getText());
                String department = departmentGradeTextField.getText();
                int years_of_experience = Integer.parseInt(YOETextField.getText());


                for (Teacher obj:teacherArray ){
                    if(obj instanceof Lecturer){
                        if(obj.getTeacherId() == teacherID ){
                            Lecturer lecturer = (Lecturer) obj;
                            if(lecturer.getDepartment().equals(department)) {                                
                                if (years_of_experience>=5) {
                                    lecturer.gradeAssignment(teacherID , department, years_of_experience);
                                    char grade;
                                    if (gradedScore >= 70){
                                        grade = 'A';
                                    }
                                    else if(gradedScore >=60 && gradedScore <70){
                                        grade = 'B';
                                    }
                                    else if(gradedScore >= 50 && gradedScore <60){
                                        grade = 'C';
                                    }
                                    else if(gradedScore >=40 && gradedScore <50){
                                        grade = 'D';
                                    }
                                    else{
                                        grade = 'E';
                                    }
                                    JOptionPane.showMessageDialog(gradeAssignmentGUIFrame, "Teacher ID:"+teacherID
                                    +"\nGrade: "+gradedScore
                                    +"\nDepartment: " +department
                                    +"\nYears of Experience: "+years_of_experience);
                                    JOptionPane.showMessageDialog(null, "Assignment graded successfully!\nGrade: " + grade, "Grade Information", JOptionPane.INFORMATION_MESSAGE);
                                }
                                else{
                                    JOptionPane.showMessageDialog(gradeAssignmentGUIFrame,"Years of experience must be greater or equals to 5 to grade the assignment ","warning",JOptionPane.WARNING_MESSAGE);
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(gradeAssignmentGUIFrame,"Incorrect department ","warning",JOptionPane.WARNING_MESSAGE);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"The teacher id you have entered is not registered in the system.","WARNING",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
            catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "please input data in correct format ", "message Box", JOptionPane.INFORMATION_MESSAGE);
            }
          
        }
    }

    void cleargrade() {
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear all the textField? ", "confirm box", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            gradeTeacherIDTextField.setText(" ");
            gradedScoreJLabelTextField.setText(" ");
            departmentGradeTextField.setText(" ");
            YOETextField.setText(" ");
        }
    }
    
    
    void callGradeAssignment(){
        gradeAssignmentGUIFrame = new JFrame("Grade Assignment");

        gradeAssignmentPanel = new JPanel();
        gradeAssignmentPanel.setLayout(null);

    
        gradeAssignmentGUIFrame.add(gradeAssignmentPanel);
        gradeAssignmentTitle = new JLabel("GRADE ASSIGNMENT");
        gradeAssignmentTitle.setBounds(600,0,493,106);
        gradeAssignmentTitle.setFont(new Font("Georgia",Font.BOLD,40));
        gradeAssignmentPanel.add(gradeAssignmentTitle);

        gradeTeacherId = new JLabel("Teacher ID");
        gradeTeacherId.setBounds(450,154,480,72);
        gradeTeacherId.setFont(new Font("Georgia",Font.PLAIN,30));
        gradeAssignmentPanel.add(gradeTeacherId);

        gradeTeacherIDTextField = new JTextField();
        gradeTeacherIDTextField.setBounds(1000,154,310,52);
        gradeTeacherIDTextField.setFont(new Font("Georgia",Font.PLAIN,25));
        gradeAssignmentPanel.add(gradeTeacherIDTextField);

        gradedScoreJLabel = new JLabel("Graded Score");
        gradedScoreJLabel.setBounds(450,307,480,72);
        gradedScoreJLabel.setFont(new Font("Georgia",Font.PLAIN,30));
        gradeAssignmentPanel.add(gradedScoreJLabel);

        gradedScoreJLabelTextField = new JTextField();
        gradedScoreJLabelTextField.setBounds(1000,307,310,52);
        gradedScoreJLabelTextField.setFont(new Font("Georgia",Font.PLAIN,25));
        gradeAssignmentPanel.add(gradedScoreJLabelTextField);


        departmentGrade = new JLabel("Department");
        departmentGrade.setBounds(450,460,480,72);
        departmentGrade.setFont(new Font("Georgia",Font.PLAIN,30));
        gradeAssignmentPanel.add(departmentGrade);

        departmentGradeTextField  = new JTextField();
        departmentGradeTextField.setBounds(1000,460,310,52);
        departmentGradeTextField.setFont(new Font("Georgia",Font.PLAIN,25));
        gradeAssignmentPanel.add(departmentGradeTextField);

        YOE = new JLabel("Years Of Experience");
        YOE.setBounds(450,613,480,72);
        YOE.setFont(new Font("Georgia",Font.PLAIN,30));
        gradeAssignmentPanel.add(YOE);

        YOETextField = new JTextField();
        YOETextField.setBounds(1000,613,310,52);
        YOETextField.setFont(new Font("Georgia",Font.PLAIN,25));
        gradeAssignmentPanel.add(YOETextField);

        gradeBackButton = new JButton("Back");
        gradeBackButton.setBounds(450,773,200,50);
        gradeBackButton.setFont(new Font("Georgia",Font.PLAIN,20));
        gradeBackButton.setForeground(Color.WHITE);
        gradeBackButton.setBackground(Color.BLACK);
        gradeBackButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                gradeAssignmentGUIFrame.dispose();
                callLecturer();
            }
        });
        gradeAssignmentPanel.add(gradeBackButton);


        gradeAssignmentButton2 = new JButton("Grade Assignment");
        gradeAssignmentButton2.setBounds(722,773,300,50);
        gradeAssignmentButton2.setFont(new Font("Georgia",Font.PLAIN,20));
        gradeAssignmentButton2.setForeground(Color.WHITE);
        gradeAssignmentButton2.setBackground(Color.BLACK);
        gradeAssignmentButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                grade();
            }
        });
        gradeAssignmentPanel.add(gradeAssignmentButton2);

        gradeAssignmentClearButton = new JButton("Clear");
        gradeAssignmentClearButton.setBounds(1094,773,200,50);
        gradeAssignmentClearButton.setFont(new Font("Georgia",Font.PLAIN,20));
        gradeAssignmentClearButton.setForeground(Color.WHITE);
        gradeAssignmentClearButton.setBackground(Color.BLACK);
        gradeAssignmentClearButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                cleargrade();
            }
        });
        gradeAssignmentPanel.add(gradeAssignmentClearButton);


        gradeAssignmentGUIFrame.setSize(1855,920);
        gradeAssignmentGUIFrame.setResizable(false);
        gradeAssignmentGUIFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gradeAssignmentGUIFrame.setVisible(true);

    }
    
    void clear(){
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear all the textField? ", "confirm box", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            TeacherIDTextField.setText(" ");
            TeacherNameTextField.setText(" ");
            AddressTextField.setText(" ");
            WorkingTypeTextField.setText(" ");
            EmploymentStatusTextField.setText(" ");
            DepartmentTextField.setText(" ");
            yearsOfExperienceTextField.setText(" ");
            workingHoursTextField.setText(" ");
            JOptionPane.showMessageDialog(null, "All text field cleared", "messageBox", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    void display(){
        if (TeacherIDTextField.getText().trim().isEmpty() || TeacherNameTextField.getText().trim().isEmpty() || AddressTextField.getText().trim().isEmpty() || WorkingTypeTextField.getText().trim().isEmpty() || EmploymentStatusTextField.getText().trim().isEmpty() ||DepartmentTextField.getText().trim().isEmpty() || yearsOfExperienceTextField.getText().trim().isEmpty() || workingHoursTextField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(LecturerGUIFrame,"One or more text Fileds are empty","Alert",JOptionPane.WARNING_MESSAGE);
        }
        else{
            try{
                int TeacherID = Integer.parseInt(TeacherIDTextField.getText());
                String TeacherName = TeacherNameTextField.getText();
                String address = AddressTextField.getText();
                String working_type = WorkingTypeTextField.getText();
                String emplyoyment_status = EmploymentStatusTextField.getText();
                String department = DepartmentTextField.getText();
                int years_of_experience = Integer.parseInt(yearsOfExperienceTextField.getText());
                int working_hours = Integer.parseInt(workingHoursTextField.getText());
    
                JOptionPane.showMessageDialog(null,"Teacher ID: " + TeacherID + 
                "\nTeacher Name: "+ TeacherName
                +"\n Address: "+ address
                +"\nWorking Type:" +working_type
                +"\nEmployment Status"+emplyoyment_status
                +"\nDepartment: "+department
                +"\nYears of experience: "+years_of_experience
                +"\nWorking Hours: "+working_hours);
    
            }
            catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "please input data in correct format ", "message Box", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
   
    //Tutor 
    void callTutor() {
        //JFrame for Tutor
        TutorGUIFrame = new JFrame("Tutor");

        //JPanel for Tutor
        TutorPanel = new JPanel();
        TutorPanel.setLayout(null);
        TutorPanel.setBackground(new Color(214, 214, 214));
        TutorGUIFrame.add(TutorPanel);
        
        
        //Title
        TutorTitle = new JLabel("Teacher Management System");
        TutorTitle.setBounds(303,16,535,45);
        TutorTitle.setFont(new Font("Georgia",Font.BOLD,35));
        TutorPanel.add(TutorTitle);

        
        //Teacher ID 
        TutorTeacherID = new JLabel("Teacher ID");
        TutorTeacherID.setBounds(154,108,298,47);
        TutorTeacherID.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(TutorTeacherID);
        

        //Teacher ID text field
        TutorTeacherIDTextField = new JTextField();
        TutorTeacherIDTextField.setBounds(154,161,394,50);
        TutorTeacherIDTextField.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(TutorTeacherIDTextField);

        
        //Teacher Name
        TutorTeacherName = new JLabel("Teacher Name ");
        TutorTeacherName.setBounds(154,241,298,47);
        TutorTeacherName.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(TutorTeacherName);

        //Teacher Name Text Field
        TutorTeacherNameTextField= new JTextField();
        TutorTeacherNameTextField.setBounds(154,297,394,50);
        TutorTeacherNameTextField.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(TutorTeacherNameTextField);


        //Address
        TutorAddress = new JLabel("Address");
        TutorAddress.setBounds(154,377,298,47);
        TutorAddress.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(TutorAddress);


        //Address Text Field
        TutorAddressTextField = new JTextField();
        TutorAddressTextField.setBounds(154,434,394,50);
        TutorAddressTextField.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(TutorAddressTextField);


        //Working Type
        TutorWorkingType = new JLabel("Working Type");
        TutorWorkingType.setBounds(154,514,298,47);
        TutorWorkingType.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(TutorWorkingType);


        //Working Type Text Field
        TutorWorkingTypeTextField = new JTextField();
        TutorWorkingTypeTextField.setBounds(154,570,394,50);
        TutorWorkingTypeTextField.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(TutorWorkingTypeTextField);

        //academic Qualification
        academicQualifications = new JLabel("Academic Qualification");
        academicQualifications.setBounds(154,654,298,47);
        academicQualifications.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(academicQualifications);


        //Academic Qualification Text Field
        academicQualificationsTextField = new JTextField();
        academicQualificationsTextField.setBounds(154,710,394,50);
        academicQualificationsTextField.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(academicQualificationsTextField);


        //Tutor Employment Status 
        TutorEmploymentStatus = new JLabel("Employment Status");
        TutorEmploymentStatus.setBounds(664,108,298,47);
        TutorEmploymentStatus.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(TutorEmploymentStatus);


        //Employment Staus Text Field
        TutorEmploymentStatusTextField = new JTextField();
        TutorEmploymentStatusTextField.setBounds(664,161,394,50);
        TutorEmploymentStatusTextField.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(TutorEmploymentStatusTextField);


        //Working Hours
        TutorWorkingHours = new JLabel("Working Hours");
        TutorWorkingHours.setBounds(664,241,298,47);
        TutorWorkingHours.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(TutorWorkingHours);

        //Working Hours Text Field
        TutorWorkingHoursTextField = new JTextField();
        TutorWorkingHoursTextField.setBounds(664,297,394,50);
        TutorWorkingHoursTextField.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(TutorWorkingHoursTextField);


        //Salary
        Salary = new JLabel("Salary");
        Salary.setBounds(664,377,298,47);
        Salary.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(Salary);

        //Salary Text Field
        SalaryTextField = new JTextField();
        SalaryTextField.setBounds(664,434,394,50);
        SalaryTextField.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(SalaryTextField);


        //Specialization
        Specialization = new JLabel("Specialization");
        Specialization.setBounds(664,514,298,47);
        Specialization.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(Specialization);


        //Specialization Text Field
        SpecializationTextField = new JTextField();
        SpecializationTextField.setBounds(664,570,394,50);
        SpecializationTextField.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(SpecializationTextField);


        //Performance Index
        PerformanceIndex = new JLabel("Performance Index");
        PerformanceIndex.setBounds(664,654,298,47);
        PerformanceIndex.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(PerformanceIndex);


        performanceIndexTextField = new JTextField();
        performanceIndexTextField.setBounds(664,710,394,50);
        performanceIndexTextField.setFont(new Font("Georgia",Font.PLAIN,24));
        TutorPanel.add(performanceIndexTextField);
        

        //Back Button
        TutorBackButton = new JButton("Back");
        TutorBackButton.setBounds(154,811,193,40);
        TutorBackButton.setFont(new Font("Georgia", Font.BOLD , 18));
        TutorBackButton.setBackground(Color.BLACK);
        TutorBackButton.setForeground(Color.WHITE);
        TutorBackButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new GUI();
                TutorGUIFrame.dispose();
            }
        });
        TutorPanel.add(TutorBackButton);

        //Clear Button
        TutorClearButton = new JButton("Clear");
        TutorClearButton.setBounds(471,811,254,40);
        TutorClearButton.setFont(new Font("Georgia",Font.BOLD,18));
        TutorClearButton.setBackground(Color.BLACK);
        TutorClearButton.setForeground(Color.WHITE);
        TutorClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                clearTextField();
            }
        });
        TutorPanel.add(TutorClearButton);

        //Display Button
        TutorDisplayButton = new JButton("Display");
        TutorDisplayButton.setBounds(804,811,254,40);
        TutorDisplayButton.setFont(new Font("Georgia",Font.BOLD,18));
        TutorDisplayButton.setBackground(Color.BLACK);
        TutorDisplayButton.setForeground(Color.WHITE);
        TutorDisplayButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                TutorDisplay();
            }
        }); 
        TutorPanel.add(TutorDisplayButton);

        //Add Tutor Button
        addTutorButton = new JButton("Add Tutor");
        addTutorButton.setBounds(1235,297,254,40);
        addTutorButton.setBackground(Color.BLACK);
        addTutorButton.setForeground(Color.WHITE);
        addTutorButton.setFont(new Font("Georgia",Font.BOLD,18));
        addTutorButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                addTutor();
            }
        });
        TutorPanel.add(addTutorButton);

        //Set Salary Button
        setSalaryButton = new JButton("Set Salary");
        setSalaryButton.setBounds(1235,416,254,40);
        setSalaryButton.setBackground(Color.BLACK);
        setSalaryButton.setForeground(Color.white);
        setSalaryButton.setFont(new Font("Georgia",Font.BOLD,18));
        setSalaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                setSalary();
            }
        });
        TutorPanel.add(setSalaryButton);

        //Remove tutor Button
        removeTutorButton = new JButton("Remove Tutor");
        removeTutorButton.setBounds(1235,533,254,40);
        removeTutorButton.setBackground(Color.BLACK);
        removeTutorButton.setForeground(Color.white);
        removeTutorButton.setFont(new Font("Georgia",Font.BOLD,18));
        removeTutorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                TutorGUIFrame.dispose();
                removeTutor();
            }
        });
        TutorPanel.add(removeTutorButton);
        

        TutorGUIFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TutorGUIFrame.setSize(1855,920);
        TutorGUIFrame.setResizable(false);
        TutorGUIFrame.setVisible(true);
        }
   
    void addTutor(){
        if(TutorTeacherIDTextField.getText().trim().isEmpty() || TutorTeacherNameTextField.getText().trim().isEmpty() || TutorAddressTextField.getText().trim().isEmpty() || TutorWorkingTypeTextField.getText().trim().isEmpty() || TutorWorkingHoursTextField.getText().trim().isEmpty() || academicQualificationsTextField.getText().trim().isEmpty()|| TutorEmploymentStatusTextField.getText().trim().isEmpty() || SalaryTextField.getText().trim().isEmpty() || SpecializationTextField.getText().trim().isEmpty() || performanceIndexTextField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please fill all the TextField","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                int teacherid = Integer.parseInt(TutorTeacherIDTextField.getText());
                String teacherName = TutorTeacherNameTextField.getText();
                String address = TutorAddressTextField.getText();
                String workingType = TutorWorkingTypeTextField.getText();
                int workingHour = Integer.parseInt(TutorWorkingHoursTextField.getText());
                String academicQualification = academicQualificationsTextField.getText();
                String employmentStatus = TutorEmploymentStatusTextField.getText();
                int salary = Integer.parseInt(SalaryTextField.getText());
                String specialization = SpecializationTextField.getText();
                int performanceIndex = Integer.parseInt(performanceIndexTextField.getText());

                boolean isTeacherUnique = true;
                for (Teacher obj : teacherArray){
                    if (obj instanceof Tutor){
                        if (teacherid == obj.getTeacherId()){
                            JOptionPane.showInternalMessageDialog(null, "This teacher id already exist in our system","Check",JOptionPane.ERROR_MESSAGE);
                            isTeacherUnique = false;
                        }
                    }
                }
                if (workingHour>15){
                    JOptionPane.showMessageDialog(null,"Working hours maximum limit is 15","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                    isTeacherUnique = false;
                }
                if(performanceIndex>10){
                    JOptionPane.showInternalMessageDialog(null, "Performance Index maximum limit is 10","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                    isTeacherUnique = false;
                }

                if(isTeacherUnique){
                    Tutor tutorobj = new Tutor(teacherid, teacherName, address, workingType, employmentStatus, workingHour, salary, specialization, academicQualification, performanceIndex);
                    teacherArray.add(tutorobj);
                    JOptionPane.showMessageDialog(null, "Tutor sucessfully added","ADDED",JOptionPane.INFORMATION_MESSAGE);
                }

            }
            catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null,"Invalid Input","INVALID",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
   
    void displaySalary(){
        if (TeacherID_setSalaryTextField.getText().trim().isEmpty() || salary_setSalary_TextField2.getText().trim().isEmpty() || performanceIndex_setSalary_TextField.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill out all the Text Field","WARNING",JOptionPane.WARNING_MESSAGE);
        }

        else{
            try{
                int teacher_id = Integer.parseInt(TeacherID_setSalaryTextField.getText());
                int salary = Integer.parseInt((salary_setSalary_TextField2.getText()));
                int performance_Index = Integer.parseInt(performanceIndex_setSalary_TextField.getText()); 

                for (Teacher obj :teacherArray){
                    if (obj instanceof Tutor){
                        if(obj.getTeacherId() == teacher_id){
                            Tutor tutor = (Tutor) obj;
                            if(tutor.getWorkingHours()>12){
                                if(performance_Index>5){
                                    tutor.setSalary(salary, performance_Index);  // the method to grade the assignment from Lecturer is called here 
                                    JOptionPane.showMessageDialog(null,"Salary of tutor set.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                                    JOptionPane.showMessageDialog(null,"Teacher ID:" +teacher_id
                                    +"\nSalary: " +salary
                                    +"\nPerformance Index: "+performance_Index);
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"performance index must be greater than 5","Wrong input",JOptionPane.WARNING_MESSAGE);
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"working hours must be greater than 12","Wrong input",JOptionPane.WARNING_MESSAGE);
                            }
                            
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Teacher id not matched","!!",JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            }
            catch(NumberFormatException n){
                JOptionPane.showInternalMessageDialog(null, "INVALID INPUT","Number format exception",JOptionPane.WARNING_MESSAGE);
            }


        }
    }
    
    void setSalary(){
        setSalaryGUIFrame = new JFrame("Set Salary");
        setSalaryPanel = new JPanel();
        setSalaryGUIFrame.add(setSalaryPanel);
        setSalaryPanel.setLayout(null);

        setSalaryTitle = new JLabel("SET SALARY");
        setSalaryTitle.setBounds(749,11,493,106);
        setSalaryTitle.setFont(new Font("Georgia",Font.BOLD,40));
        setSalaryPanel.add(setSalaryTitle);

        TeacherID_setSalary = new JLabel("Teacher ID");
        TeacherID_setSalary.setBounds(443,221,480,72);
        TeacherID_setSalary.setFont(new Font("Georgia",Font.PLAIN,30));
        setSalaryPanel.add(TeacherID_setSalary);

        TeacherID_setSalaryTextField = new JTextField();
        TeacherID_setSalaryTextField.setBounds(1080,221,310,52);
        TeacherID_setSalaryTextField.setFont(new Font("Georgia",Font.PLAIN,25));
        setSalaryPanel.add(TeacherID_setSalaryTextField);

        salary_setSalary = new JLabel("New Salary");
        salary_setSalary.setBounds(443,374,480,72);
        salary_setSalary.setFont(new Font("Georgia",Font.PLAIN,30));
        setSalaryPanel.add(salary_setSalary);

        salary_setSalary_TextField2 = new JTextField();
        salary_setSalary_TextField2.setBounds(1080,374,310,52);
        salary_setSalary_TextField2.setFont(new Font("Georgia",Font.PLAIN,25));
        setSalaryPanel.add(salary_setSalary_TextField2);


        performanceIndex_setSalary = new JLabel("Performance Index");
        performanceIndex_setSalary.setBounds(443,527,480,72);
        performanceIndex_setSalary.setFont(new Font("Georgia",Font.PLAIN,30));
        setSalaryPanel.add(performanceIndex_setSalary);

        performanceIndex_setSalary_TextField  = new JTextField();
        performanceIndex_setSalary_TextField.setBounds(1080,527,310,52);
        performanceIndex_setSalary_TextField.setFont(new Font("Georgia",Font.PLAIN,25));
        setSalaryPanel.add(performanceIndex_setSalary_TextField);

        setSalaryBackButton = new JButton("Back");
        setSalaryBackButton.setBounds(443,716,268,50);
        setSalaryBackButton.setFont(new Font("Georgia",Font.PLAIN,20));
        setSalaryBackButton.setBackground(Color.BLACK);
        setSalaryBackButton.setForeground(Color.WHITE);
        setSalaryBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                setSalaryGUIFrame.dispose();
                callTutor();
            }
        });
        setSalaryPanel.add(setSalaryBackButton);

        setSalaryButton2 = new JButton("Set Salary");
        setSalaryButton2.setBounds(1080,709,310,50);
        setSalaryButton2.setFont(new Font("Georgia",Font.PLAIN,20));
        setSalaryButton2.setBackground(Color.BLACK);
        setSalaryButton2.setForeground(Color.WHITE);
        setSalaryButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                displaySalary();
            }
        });
        setSalaryPanel.add(setSalaryButton2);

    
        setSalaryGUIFrame.setSize(1855,920);
        setSalaryGUIFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSalaryGUIFrame.setVisible(true);
        setSalaryGUIFrame.setResizable(false);


   }


    void callRemoveTutor() {
    if(removeTutorTeacherIDTextField.getText().trim().isEmpty() || removeTutorTeacherNameTextField.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(null,"Please fill all the TextField","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    else{
        try {
            int teacher_id = Integer.parseInt(removeTutorTeacherIDTextField.getText());
            String teacher_name = removeTutorTeacherNameTextField.getText();

            for (Teacher obj: teacherArray){
                if(obj instanceof Tutor){
                    if (teacher_id == obj.getTeacherId()) {
                            Tutor tutobj = (Tutor) obj;
                            tutobj.removeTutor();
                            teacherArray.remove(tutobj);
                            JOptionPane.showMessageDialog(null, "Tutor  removed Sucesfully!!","Removed",JOptionPane.INFORMATION_MESSAGE);
                            JOptionPane.showMessageDialog(null,"Removed Tutor details:\n "
                            +"\nTeacher Name: "+teacher_name 
                            +"\nTeacher id: "+teacher_id,"REMOVED",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Invalid Teacher ID ","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        catch(NumberFormatException n){
            JOptionPane.showMessageDialog(null,"Please enter data in correct format","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
}
   

    void removeTutor(){
        removeTutorFrame = new JFrame("Remove Tutor.");
        removeTutorPanel = new JPanel();
        removeTutorPanel.setLayout(null);
        removeTutorFrame.add(removeTutorPanel);

        titleRemoveTutor = new JLabel("Remove Tutor");
        titleRemoveTutor.setBounds(715,124,397,113);
        titleRemoveTutor.setFont(new Font("Georgia",Font.BOLD,50));
        removeTutorPanel.add(titleRemoveTutor);

        removeTutorTeacherID = new JLabel("Teacher ID: ");
        removeTutorTeacherID.setBounds(475,340,480,71);
        removeTutorTeacherID.setFont(new Font("Georgial",Font.PLAIN,24));
        removeTutorPanel.add(removeTutorTeacherID);

        removeTutorTeacherIDTextField = new JTextField();
        removeTutorTeacherIDTextField.setBounds(1018,340,310,52);
        removeTutorTeacherIDTextField.setFont(new Font("Georgia",Font.PLAIN,24));
        removeTutorPanel.add(removeTutorTeacherIDTextField);

        removeTutorTeacherName = new JLabel("Teacher Name: ");
        removeTutorTeacherName.setBounds(475,500,480,71);
        removeTutorTeacherName.setFont(new Font("Georgial",Font.PLAIN,24));
        removeTutorPanel.add(removeTutorTeacherName);

        removeTutorTeacherNameTextField = new JTextField();
        removeTutorTeacherNameTextField.setBounds(1018,500,310,52);
        removeTutorTeacherNameTextField.setFont(new Font("Georgia",Font.PLAIN,24));
        removeTutorPanel.add(removeTutorTeacherNameTextField);

        removeTutorBackButton = new JButton("Back ");
        removeTutorBackButton.setBounds(475,651,281,50);
        removeTutorBackButton.setBackground(Color.BLACK);
        removeTutorBackButton.setForeground(Color.WHITE);
        removeTutorBackButton.setFont(new Font("Georgia",Font.PLAIN,20));
        removeTutorBackButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                removeTutorFrame.dispose();
                callTutor();
            }
        });
        removeTutorPanel.add(removeTutorBackButton);

        removeTutorButton2 = new JButton("Remove Tutor");
        removeTutorButton2.setBounds(800,651,300,50);
        removeTutorButton2.setBackground(Color.BLACK);
        removeTutorButton2.setForeground(Color.WHITE);
        removeTutorButton2.setFont(new Font("Georgia",Font.PLAIN,20));
        removeTutorButton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                callRemoveTutor();
            }
        });
        removeTutorPanel.add(removeTutorButton2);

        clearRemoveTutor = new JButton("Clear");
        clearRemoveTutor.setBounds(1128,651,200,50);
        clearRemoveTutor.setBackground(Color.BLACK);
        clearRemoveTutor.setForeground(Color.WHITE);
        clearRemoveTutor.setFont(new Font("Georgia",Font.PLAIN,20));
        removeTutorPanel.add(clearRemoveTutor);


        removeTutorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        removeTutorFrame.setSize(1855,920);
        removeTutorFrame.setResizable(false);
        removeTutorFrame.setVisible(true);
    }
    void TutorDisplay(){
        if (TutorTeacherIDTextField.getText().trim().isEmpty() || TutorTeacherNameTextField.getText().trim().isEmpty() || TutorAddressTextField.getText().trim().isEmpty() || TutorWorkingTypeTextField.getText().trim().isEmpty() || TutorWorkingHoursTextField.getText().trim().isEmpty() || academicQualificationsTextField.getText().trim().isEmpty()|| TutorEmploymentStatusTextField.getText().trim().isEmpty() || SalaryTextField.getText().trim().isEmpty() || SpecializationTextField.getText().trim().isEmpty() || performanceIndexTextField.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null,"Please fill all the TextField","ERROR",JOptionPane.ERROR_MESSAGE);
        }

        else{
            try{
                int teacherid = Integer.parseInt(TutorTeacherIDTextField.getText());
                String teacherName = TutorTeacherNameTextField.getText();
                String address = TutorAddressTextField.getText();
                String workingType = TutorWorkingTypeTextField.getText();
                int workingHour = Integer.parseInt(TutorWorkingHoursTextField.getText());
                String academicQualification = academicQualificationsTextField.getText();
                String employmentStatus = TutorEmploymentStatusTextField.getText();
                int salary = Integer.parseInt(SalaryTextField.getText());
                String specialization = SpecializationTextField.getText();
                int performanceIndex = Integer.parseInt(performanceIndexTextField.getText());
            
                JOptionPane.showMessageDialog(null,"Teacher ID: " + teacherid
                +"\nTeacher Name: "+ teacherName
                +"\nAddress: "+ address
                +"\nWorking Type:" +workingType
                +"\nWorking Hour:" +workingHour
                +"\nAcademic Qualification:" +academicQualification
                +"\nEmployment Status: "+employmentStatus
                +"\nSalary: "+salary
                +"\nSpecialization: "+specialization
                +"\nPerformance Index : "+performanceIndex);
            }

            catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "please input data in correct format ", "message Box", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    void clearTextField(){
        int choice = JOptionPane.showConfirmDialog(TutorGUIFrame, "Are you sure you want to clear all the textField? ", "confirm box", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            TutorTeacherIDTextField.setText(" ");
            TutorTeacherNameTextField.setText(" ");
            TutorAddressTextField.setText(" ");
            TutorWorkingTypeTextField.setText(" ");
            TutorWorkingHoursTextField.setText(" ");
            academicQualificationsTextField.setText(" ");
            TutorEmploymentStatusTextField.setText(" ");
            SalaryTextField.setText(" ");
            SpecializationTextField.setText(" ");
            performanceIndexTextField.setText(" ");

        }
    }
    

    public static void main(String[] args){
        new GUI();
    }
}