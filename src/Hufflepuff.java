public class Hufflepuff extends Hogwarts {
    private final int hardWork;
    private final int loyalty;
    private final int honor;

    public Hufflepuff(String studentName, int spellPower, int transgressionDistance, int hardWork, int loyalty, int honor) {
        super(studentName, spellPower, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonor() {
        return honor;
    }

    /**
     * Compare Hufflepuff faculty students
     * @param student - Hufflepuff object (student)
     */
    public void compareFacultyStudent(Hufflepuff student) {
        int s1Points = this.getHardWork() + this.getHonor() + this.getLoyalty();
        int s2Points = student.getHardWork() + student.getHonor() + student.getLoyalty();

        if(s1Points > s2Points) {
            System.out.println(this.getStudentName() + " is a better Hufflepuff than " + student.getStudentName());
        } else if (s1Points < s2Points){
            System.out.println(student.getStudentName() + " is a better Hufflepuff than " + this.getStudentName());
        } else {
            System.out.println("Students have the same score");
        }
    }
}
