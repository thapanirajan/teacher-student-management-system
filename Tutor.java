/**
 * The Tutor class represnts a tutor extending the Teacher class with additional attribute such as salary, specialization, academic qualification, performance index and certification status.
 */
public class Tutor extends Teacher{
    //additional attributes for Tutor
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    
    //constructor with ten parameters
    Tutor(int teacherId,String teacherName, String address,String workingType,String employmentStatus, int workingHours,double salary,String specialization,String academicQualifications,int performanceIndex){
        super(teacherId, teacherName, address, workingType, employmentStatus);
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
        
        //calling a mutator method 
        setWorkingHours(workingHours);
    
    }
    
    //Accessor method for Tutor attributes
    public double getSalary(){
        return this.salary;
    }
    public String getSpecialization(){
        return this.specialization;
    }
    
    public String getAcademicQualifications(){
        return this.academicQualifications;
    }
    
    public int getPerformanceIndex(){
        return this.performanceIndex;
    }
    
    public boolean getIsCertified(){
        return this.isCertified;
    }
    
    /**
     * sets salary of the tutor based on performance index and working hours.
     * updates certification status if criteria are met.
     */
    public void setSalary(double newSalary, int newPerformanceIndex){
        if(newPerformanceIndex > 5 && getWorkingHours() > 20 ){
            double appraisal = 0;
            if(newPerformanceIndex > 5 && newPerformanceIndex < 7){
                appraisal = salary * 0.05;
            }
            else if( newPerformanceIndex > 8 && newPerformanceIndex < 9){
                appraisal = salary * 0.1;
            }
            else if (newPerformanceIndex == 10){
                appraisal = salary * 0.2;
            }
            this.salary = newSalary + appraisal;
            this.isCertified = true;
            System.out.println("congratulations you have been certified and your salary has been updated");
        }
        else{
            System.out.println("Performance index or working hours not sufficient for certification. Salary update failed.");
        }
    }
    
  
    /**
     * removes the tutor if not certified 
     */
    public void removeTutor(){
        if(!isCertified){
            this.salary = 0;
            this.specialization = "";
            this.academicQualifications = "";
            this.performanceIndex = 0;
            this.isCertified = false;
            System.out.println("Tutor successfully removed");
        }
    }
    
    //Displays the details of Tutor 
    public void display(){
        System.out.println("");
        
        if(!isCertified){
            //calling display method from the parent class Teacher
            super.display();
            System.out.println("-------Tutor--------");
        }
        else{
            //calling display method from the parent class Teacher
            super.display();
            System.out.println("-------Tutor--------");
            System.out.println("Salary: "+ getSalary());
            System.out.println("Specialization: "+getSpecialization());
            System.out.println("Academic Qualifications: "+ getAcademicQualifications());
            System.out.println("Performance Index: "+ getPerformanceIndex());
        }
    }
}
    
