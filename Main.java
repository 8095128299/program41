public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", "B.Tech CSE", 5);

        student.registerCourse (new Course("Mathematics", 85));
        student.registerCourse(new Course("Data Structures", 38));
        student.registerCourse(new Course("Operating Systems", 45));
        student.registerCourse(new Course("Algorithms", 30));

        student.displayStudentDetails();
        student.displayLowMarks();
    }
}