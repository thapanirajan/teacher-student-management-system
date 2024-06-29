/**
 * The Lecturer class represnts a lecturer, extending the Teacher class with additional attributes such as department,years of experience, graded score, and grading status.
 */
public class Lecturer extends Teacher {
    // Additional attributes for Lecturer
    private String department;
    private int yearOfExperience;
    private int gradedScore;
    private boolean hasGraded;

    // Constructor with seven parameters
    public Lecturer(int teacherId, String teacherName, String address, String workingType,String employmentStatus,String department, int yearOfExperience,int workingHours){
        // Call to superclass constructor with five parameters
        super(teacherId, teacherName, address, workingType, employmentStatus);
        setWorkingHours(workingHours);
        // Initialize additional attributes for Lecturer
        this.department = department;
        this.yearOfExperience = yearOfExperience;
        this.gradedScore = 0;  // Assign gradedScore as 0
        this.hasGraded = false;  // Assign hasGraded to false
    }

    // Accessor methods for Lecturer class attributes
    public String getDepartment() {
        return department;
    }

    public int getYearsOfExperience() {
        return yearOfExperience;
    }

    public int getGradedScore() {
        return gradedScore;
    }

    public boolean getHasGraded() {
        return hasGraded;
    }

    // Mutator method for gradedScore
    public void setGradedScore(int gradedScore) {
        this.gradedScore = gradedScore;
    }
   

    // Method to grade assignments
    public void gradeAssignment(int gradedScore, String department, int yearsOfExperience) {
        // Check conditions for grading
        if (yearsOfExperience >= 5 && this.department.equals(department)) {
            // Grade assignments based on specified criteria
            if (gradedScore >= 70) {
                this.gradedScore = gradedScore;
                this.hasGraded = true;
            } else if (gradedScore >= 60) {
                this.gradedScore = gradedScore;
                this.hasGraded = true;
            } else if (gradedScore >= 50) {
                this.gradedScore = gradedScore;
                this.hasGraded = true;
            } else if (gradedScore >= 40) {
                this.gradedScore = gradedScore;
                this.hasGraded = true;
            } else {
                this.gradedScore = gradedScore;
                this.hasGraded = true;
            }           
        } else {
            // Display a message if conditions for grading are not met
            System.out.println("Lecturer has not graded yet.");
        }
    }

    /**
     * Displays the details of Lecturer.
     */
    public void display() {
        System.out.println("");
        // Call the display method in the Teacher class to display common attributes
        super.display();
        
        System.out.println("-------Lecturer--------");
        // Display Lecturer-specific attributes
        System.out.println("Department: " + department);
        System.out.println("Years of Experience: " + yearOfExperience);

        // Display gradedScore or a message if not graded yet
        if (hasGraded) {
            System.out.println("Graded Score: " + gradedScore);
        } else {
            System.out.println("Score has not been graded yet.");
        }
    }
}
