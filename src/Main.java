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
    }

    // Generator random numbers
    public static int getRandomNum(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}