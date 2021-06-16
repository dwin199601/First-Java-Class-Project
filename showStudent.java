public class showStudent {
    public static void main(String[] args) {
        Student studentOne = new Student();
        studentOne.setId(2341578);
        studentOne.setCredits(4);
        studentOne.setPoints(20);

        studentOne.CalculateGpa();

        studentOne.DisplayValues();

    }
}
