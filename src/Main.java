import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("The Hogwarts");

        Gryffindor[] gryffindors = {
                new Gryffindor("Harry Potter",
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100)),
                new Gryffindor("Hermione Granger",
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100)),
                new Gryffindor("Ron Weasley",
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100)),
        };

        // Compare students of Gryffindor
        gryffindors[0].compareFacultyStudent(gryffindors[1]);

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zachariah Smith",
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100)),
                new Hufflepuff("Cedric Diggory",
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100)),
                new Hufflepuff("Justin Finch-Fletchley",
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100)),
        };

        // Compare students of Hufflepuff
        hufflepuffs[1].compareFacultyStudent(hufflepuffs[2]);

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Zhou Chang",
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100)),
                new Ravenclaw("Padma Patil",
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100)),
                new Ravenclaw("Marcus Belby",
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100),
                        getRandomNum(0, 100)),
        };

        // Compare students of Ravenclaw
        ravenclaws[0].compareFacultyStudent(ravenclaws[2]);
    }

    // Generator random numbers
    public static int getRandomNum(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}