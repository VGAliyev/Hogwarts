public class PrintService {
    public void printStudentInformation(Gryffindor gryffindor) {
        baseInformation(gryffindor, "Gryffindor");
        System.out.printf("It has the following characteristics:\nNobility = %d\nHonor = %d\nBravery = %d",
                gryffindor.getNobility(),
                gryffindor.getHonor(),
                gryffindor.getBravery());
        System.out.println();
    }

    public void printStudentInformation(Hufflepuff hufflepuff) {
        baseInformation(hufflepuff, "Hufflepuff");
        System.out.printf("It has the following characteristics:\nHard Work = %d\nLoyalty = %d\nHonesty = %d",
                hufflepuff.getHardWork(),
                hufflepuff.getLoyalty(),
                hufflepuff.getHonesty());
        System.out.println();
    }

    public void printStudentInformation(Ravenclaw ravenclaw) {
        baseInformation(ravenclaw, "Ravenclaw");
        System.out.printf("It has the following characteristics:\nMind = %d\nWisdom = %d\nWit = %d\nCreativity = %d",
                ravenclaw.getMind(),
                ravenclaw.getWisdom(),
                ravenclaw.getWit(),
                ravenclaw.getCreation());
        System.out.println();
    }

    public void printStudentInformation(Slytherin slytherin) {
        baseInformation(slytherin, "Slytherin");
        System.out.printf("It has the following characteristics:\nCunning = %d\nDetermination = %d\nAmbition = %d\nResourcefulness = %d\nLust For Power = %d",
                slytherin.getCunning(),
                slytherin.getDetermination(),
                slytherin.getAmbition(),
                slytherin.getResourcefulness(),
                slytherin.getLustForPower());
        System.out.println();
    }

    private void baseInformation(Hogwarts student, String facultyName) {
        System.out.printf("Student %s is a %s student\n", student.getStudentName(), facultyName);
        System.out.printf("He has a spellcasting power of %d and a transgression range of %d feet.\n",
                student.getSpellPower(),
                student.getTransgressionDistance());
    }
}
