/**
 * The Teacher class represents a teacher with attributes such as ID,name,address,working type,employment status and working hours.
 */
public class Teacher{
    //Attributes
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
    
    //constructor
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus){
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }
    
    //accessor method
    int getTeacherId(){
        return teacherId;
    }
    
    String getTeacherName(){
        return teacherName;
    }
    
    String getAddress(){
        return address;
    }
    
    String getWorkingType(){
        return workingType;
    }
    
    String getEmploymentStatus(){
        return employmentStatus;
    }
    
    int getWorkingHours(){
        return workingHours;
    }

    
    //method to set working hours
    void setWorkingHours(int workingHours){
        this.workingHours = workingHours; 
    }
    
    
    /**
     * Displays the details of the teacher
     */
    public void display(){
        System.out.println("--------Teacher----------");
        System.out.println("Teacher Id: "+ teacherId);
        System.out.println("Teacher Name: "+ teacherName);
        System.out.println("Address: "+ address);
        System.out.println("Working Type: "+workingType);
        System.out.println("Employment Status: "+ employmentStatus);
        
        if(workingHours > 0){
            System.out.println("Working Hour: "+ workingHours);
        }
        else{
            System.out.println("Working hour: Not Assigned");
        }
    }
}