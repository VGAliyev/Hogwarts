public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String studentName, int spellPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(studentName, spellPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void compareFacultyStudent(Gryffindor student) {
        int s1Points = this.getBravery() + this.getHonor() + this.getNobility();
        int s2Points = student.getBravery() + student.getHonor() + student.getNobility();

        if(s1Points > s2Points) {
            System.out.println(this.getStudentName() + " is a better Gryffindor than " + student.getStudentName());
        } else if (s1Points < s2Points){
            System.out.println(student.getStudentName() + " is a better Gryffindor than " + this.getStudentName());
        } else {
            System.out.println("Students have the same score");
        }
    }
}
