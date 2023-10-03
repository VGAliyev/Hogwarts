public class Hogwarts {
    private final String studentName;
    private final int spellPower;
    private final int transgressionDistance;

    public Hogwarts(String studentName, int spellPower, int transgressionDistance) {
        this.studentName = studentName;
        this.spellPower = spellPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    /**
     * Compare students by spell power and transgression distance
     * @param student - Hogwarts object (student)
     */
    public void compareStudentsBySPAndTD(Hogwarts student) {
        String spellPowerString;

        if (this.getSpellPower() > student.getSpellPower()) {
            spellPowerString = this.getStudentName() + " has more spellcasting power than " + student.getStudentName();
        } else {
            spellPowerString = this.getStudentName() + " has less spellcasting power than " + student.getStudentName();
        }
        if (this.getTransgressionDistance() > student.getTransgressionDistance()) {
            spellPowerString += ", and greater transgression distance.";
        } else {
            spellPowerString += ", and less transgression distance.";
        }

        System.out.println(spellPowerString);
    }
}
