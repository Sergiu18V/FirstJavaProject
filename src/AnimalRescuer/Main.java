package AnimalRescuer;

public class Main {
    public static void main(String[] args) {
        Dog york = new Dog();
        System.out.println("My name is " + york.name + ".");
        System.out.println("I am " + york.age + " years old.");
        System.out.println("My food level is " + york.hunger + ".");

        Vet doctor = new Vet();
        System.out.println("My doctor is specialized in " + doctor.specialization +".");

        Food food = new Food();
        System.out.println("The brand of food I like to eat is " + food.name + ".");

        Adopter rescuer = new Adopter();
        System.out.println("My adopter's name is " + rescuer.name + ".");

        Activity running = new Activity();
        System.out.println("My favorite activity is " + running.activity + ".");
    }

}

