public class Student {
    private int studentId;
    private int creditsNumber;
    private int pointsNumber;
    double gpa;

    public void setId(int ID) {
        studentId = ID;
    }

    public int getId() {
        return studentId;
    }

    public void setCredits(int credits) {
        creditsNumber = credits;
    }

    public int getCredits() {
        return creditsNumber;
    }

    public void setPoints(int points) {
        pointsNumber = points;
    }

    public int getPoints() {
        return pointsNumber;
    }

    public double CalculateGpa() {

        return gpa = pointsNumber / creditsNumber;
    }

    public Student(int StudID, int Points, int Credits) {
        studentId = StudID;
        creditsNumber = Credits;
        pointsNumber = Points;

    }

    public Student() {

    }

    public void DisplayValues() {
        System.out.println("The student id " + studentId);
        System.out.println("The number of credits " + creditsNumber);
        System.out.println("The number of points " + pointsNumber);
        System.out.println("The GPA is " + gpa);
    }

}