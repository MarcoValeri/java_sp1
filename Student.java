public class Student {

    private String firstName, lastName, name;
    private int totalScore, quizCounter;

    public Student(String firstName, String LastName) {
        name = firstName + " " + lastName;
    }

    public String getName() {
        return name;
    }

    public void addQuizScore(int score) {
        totalScore+= score;
        quizCounter++;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public double getAverageScore() {
        double value = totalScore / quizCounter;
        return value;
    }

}