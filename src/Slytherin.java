public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;

    public Slytherin(String studentName, int spellPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(studentName, spellPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    /**
     * Compare Slytherin faculty students
     * @param student - Slytherin object (student)
     */
    public void compareFacultyStudent(Slytherin student) {
        int s1Points = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getLustForPower();
        int s2Points = student.getCunning() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getLustForPower();

        if(s1Points > s2Points) {
            System.out.println(this.getStudentName() + " is a better Slytherin than " + student.getStudentName());
        } else if (s1Points < s2Points){
            System.out.println(student.getStudentName() + " is a better Slytherin than " + this.getStudentName());
        } else {
            System.out.println("Students have the same score");
        }
    }
}
