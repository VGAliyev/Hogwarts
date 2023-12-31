public class Ravenclaw extends Hogwarts {
    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creation;

    public Ravenclaw(String studentName, int spellPower, int transgressionDistance, int mind, int wisdom, int wit, int creation) {
        super(studentName, spellPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public int calculateSpecificAbilitiesSum() {
        return getMind() + getWisdom() + getWit() + getCreation();
    }

    /**
     * Compare Ravenclaw faculty students
     * @param student - Ravenclaw object (student)
     */
    public void compareFacultyStudent(Ravenclaw student) {
        if(this.calculateSpecificAbilitiesSum() > student.calculateSpecificAbilitiesSum()) {
            System.out.println(this.getStudentName() + " is a better Ravenclaw than " + student.getStudentName());
        } else if (this.calculateSpecificAbilitiesSum() < student.calculateSpecificAbilitiesSum()){
            System.out.println(student.getStudentName() + " is a better Ravenclaw than " + this.getStudentName());
        } else {
            System.out.println("Students have the same score");
        }
    }
}
