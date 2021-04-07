package AnimalRescuer;

public class Main {
    public static void main(String[] args) {
        Dog york = new Dog();
//        System.out.println("My name is " + york.name + ".");
//        System.out.println("I am " + york.age + " years old.");
//        System.out.println("My food level is " + york.hunger + ".")
        york.setName("York");
        york.setAge(12);
        york.setHealth(9);
        york.setHunger(10);

        Vet doctor = new Vet();
//        System.out.println("My doctor is specialized in " + doctor.specialization +".");
        doctor.setSpecialization("Doggos");

        Food food = new Food();
        food.setName("Yummy");
//        System.out.println("The brand of food I like to eat is " + food.name + ".");

        Adopter rescuer = new Adopter();
        rescuer.setName("Rox");
//        System.out.println("My adopter's name is " + rescuer.name + ".");

        Activity running = new Activity();
        running.setActivity("Walking");
//        System.out.println("My favorite activity is " + running.activity + ".");
    }

}

