import java.util.Random;

// Abstract class
abstract class Compartment {
    public abstract String notice();
}

// Subclasses
class FirstClass extends Compartment {
    public String notice() {
        return "First Class: Please maintain silence and comfort.";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment: Reserved for women passengers only.";
    }
}

class General extends Compartment {
    public String notice() {
        return "General Compartment: Ticket required for travel.";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Luggage Compartment: Keep baggage secured properly.";
    }
}

// Test class
public class TestCompartment {

    public static void main(String[] args) {

        Compartment[] compartments = new Compartment[10];
        Random rand = new Random();

        for (int i = 0; i < compartments.length; i++) {

            int choice = rand.nextInt(4) + 1;

            switch (choice) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        // Polymorphism in action
        for (Compartment c : compartments) {
            System.out.println(c.notice());
        }
    }
}
