package AnimalShelter;

import java.util.LinkedList;

public class AnimalShelterMgtSystem {
    private LinkedList<Dog> dogs = new LinkedList<>();
    private LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0;

    // Enqueue operation
    public void enqueue(Animal animal) {
        animal.setArrivalNum(order);
        order++;

        if (animal instanceof Dog) {
            dogs.addLast((Dog) animal);
        } else if (animal instanceof Cat) {
            cats.addLast((Cat) animal);
        }
    }

    // DequeueAny to Adopt the oldest animal
    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            System.out.println("No animals available for adoption.");
            return null;
        } else if (dogs.isEmpty()) {
            return dequeueCat(); // Only cats available
        } else if (cats.isEmpty()) {
            return dequeueDog(); // Only dogs available
        } else {
            // Return oldest animal
            Dog oldestDog = dogs.peek();
            Cat oldestCat = cats.peek();

            if (oldestDog.isOlderThan(oldestCat)) {
                return dequeueDog();
            } else {
                return dequeueCat();
            }
        }
    }

    // DequeueDog: Adopt oldest dog
    public Dog dequeueDog() {
        if (!dogs.isEmpty()) {
            return dogs.poll();
        } else {
            System.out.println("No dogs available for adoption.");
            return null;
        }
    }

    // DequeueCat: Adopt oldest cat
    public Cat dequeueCat() {
        if (!cats.isEmpty()) {
            return cats.poll();
        } else {
            System.out.println("No cats available for adoption.");
            return null;
        }
    }

    public static void main(String[] args) {
        AnimalShelterMgtSystem shelter = new AnimalShelterMgtSystem();

        // Animals added to shelter
        shelter.enqueue(new Dog("Buddy"));
        shelter.enqueue(new Cat("Whiskers"));
        shelter.enqueue(new Dog("Max"));
        shelter.enqueue(new Cat("Luna"));

        // Adopt animals
        System.out.println("Adopt Any: " + shelter.dequeueAny().getName());
        System.out.println("Adopt Dog: " + shelter.dequeueDog().getName());
        System.out.println("Adopt Cat: " + shelter.dequeueCat().getName());

        // New animals added to shelter
        shelter.enqueue(new Dog("Charlie"));
        shelter.enqueue(new Cat("Bella"));

        // Adopt all animals
        System.out.println("Adopt Any: " + shelter.dequeueAny().getName());
        System.out.println("Adopt Dog: " + shelter.dequeueDog().getName());
        System.out.println("Adopt Cat: " + shelter.dequeueCat().getName());
    }
}


