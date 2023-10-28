package lab_07.lab_07_02;

import java.security.SecureRandom;

public class Animal {
    String name;
    int maxSpeed;

    public Animal(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public int speed() {
        return new SecureRandom().nextInt(maxSpeed) + 1;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
