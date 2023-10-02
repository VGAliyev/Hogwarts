public class Hufflepuff extends Hogwarts {
    private final int hardWork;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String studentName, int spellPower, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(studentName, spellPower, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    /**
     * Compare Hufflepuff faculty students
     * @param student - Hufflepuff object (student)
     */
    public void compareFacultyStudent(Hufflepuff student) {
        int s1Points = this.getHardWork() + this.getHonesty() + this.getLoyalty();
        int s2Points = student.getHardWork() + student.getHonesty() + student.getLoyalty();

        if(s1Points > s2Points) {
            System.out.println(this.getStudentName() + " is a better Hufflepuff than " + student.getStudentName());
        } else if (s1Points < s2Points){
            System.out.println(student.getStudentName() + " is a better Hufflepuff than " + this.getStudentName());
        } else {
            System.out.println("Students have the same score");
        }
    }
}
