public class StudentTest {

    public static void main(String[] args) {
        
        // Obj Student 1
        Student student1 = new Student("Sam", "Wise");
        student1.addQuizScore(90);
        student1.addQuizScore(70);
        student1.addQuizScore(80);
        System.out.println(student1.getName());
        System.out.println("Total score: " + student1.getTotalScore());
        System.out.println("Average score " + student1.getAverageScore());
    }

}