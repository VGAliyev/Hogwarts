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
     * @param s1 - Hogwarts object (student 1)
     * @param s2 - Hogwarts object (student 2)
     */
    public void compareStudentsBySPAndTD(Hogwarts s1, Hogwarts s2) {
        String spellPowerString;

        if (s1.getSpellPower() > s2.getSpellPower()) {
            spellPowerString = s1.getStudentName() + " has more spellcasting power than " + s2.getStudentName();
        } else {
            spellPowerString = s1.getStudentName() + " has less spellcasting power than " + s2.getStudentName();
        }
        if (s1.getTransgressionDistance() > s2.getTransgressionDistance()) {
            spellPowerString += ", and greater transgression distance.";
        } else {
            spellPowerString += ", and less transgression distance.";
        }

        System.out.println(spellPowerString);
    }
}
