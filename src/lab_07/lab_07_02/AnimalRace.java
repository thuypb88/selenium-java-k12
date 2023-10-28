package lab_07.lab_07_02;

public class AnimalRace {
    public static void main(String[] args) {
        Animal horse = new Animal("Horse", 75);
        Animal tiger = new Animal("Tiger", 100);
        Animal dog = new Animal("Dog", 60);

        int horseSpeed = horse.speed();
        int tigerSpeed = tiger.speed();
        int dogSpeed = dog.speed();

        printResults(horse, horseSpeed);
        printResults(tiger, tigerSpeed);
        printResults(dog, dogSpeed);

        findWinner(horseSpeed, tigerSpeed, dogSpeed);
    }

    public static void printResults(Animal animal, int speed) {
        System.out.println("Animal: " + animal.getName());
       // System.out.println("Max Speed: " + animal.getMaxSpeed() + " km/h");
        System.out.println("Speed: " + speed + " km/h");
        System.out.println();
    }
    public static void findWinner(int horseSpeed, int tigerSpeed, int dogSpeed) {
        if (horseSpeed > tigerSpeed && horseSpeed > dogSpeed) {
            System.out.println("Winner is Horse, with speed: " + horseSpeed + " km/h");
        } else if (tigerSpeed > horseSpeed && tigerSpeed > dogSpeed) {
            System.out.println("Winner is Tiger, with speed: " + tigerSpeed + " km/h");
        } else if (dogSpeed > horseSpeed && dogSpeed > tigerSpeed) {
            System.out.println("Winner is Dog, with speed: " + dogSpeed + " km/h");
        } else {
            System.out.println("It's a tie!");
        }

    }
}
