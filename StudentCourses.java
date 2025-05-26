package Program4;

class StudentCourses { 
    String studentName; 
    String program; 
    int semester; 
    String[] courses; 
    int[] marks; 
 
    public StudentCourses(String name, String program, int semester, String[] courses, int[] marks) { 
        this.studentName = name; 
        this.program = program; 
        this.semester = semester; 
        this.courses = courses; 
        this.marks = marks; 
    } 
 
    public void display() { 
        System.out.println("Student Name: " + studentName); 
        System.out.println("Program: " + program); 
        System.out.println("Semester: " + semester); 
        System.out.println("Registered Courses:"); 
        for (int i = 0; i < courses.length; i++) { 
            System.out.println("- " + courses[i]); 
        } 
    } 
 
 
    public void showLowMarks() { 
        System.out.println("Courses with Marks < 40:"); 
        for (int i = 0; i < marks.length; i++) { 
            if (marks[i] < 40) { 
                System.out.println(courses[i] + ": " + marks[i]); 
            } 
        } 
    } 

     public static void main(String[] args) { 
        String[] courseList = {"Math", "English", "Science"}; 
        int[] markList = {45, 35, 28}; 
 
        StudentCourses std = new StudentCourses("Anjali", "B.Sc", 2, courseList, markList); 
 
        std.display(); 
        System.out.println("\n"); 
        std.showLowMarks(); 
    } 

} 
 
 
 
 
