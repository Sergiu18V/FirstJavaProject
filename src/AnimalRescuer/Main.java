package AnimalRescuer;

public class Main {
    public static void main(String[] args) {
        Dog york = new Dog();
//        System.out.println("My name is " + york.name + ".");
//        System.out.println("I am " + york.age + " years old.");
//        System.out.println("My food level is " + york.hunger + ".")
        york.setName("York");
        System.out.println(york.getName());
        york.setAge(12);
        System.out.println(york.getAge());
        york.setHealth(9);
        System.out.println(york.getHealth());
        york.setHunger(10);
        System.out.println(york.getHunger());

        Vet doctor = new Vet();
//        System.out.println("My doctor is specialized in " + doctor.specialization +".");
        doctor.setSpecialization("Doggos");
        System.out.println(doctor.getSpecialization());

        Food food = new Food();
        food.setName("Yummy");
        System.out.println(food.getName());
//        System.out.println("The brand of food I like to eat is " + food.name + ".");

        Adopter rescuer = new Adopter();
        rescuer.setName("Rox");
        System.out.println(rescuer.getName());
//        System.out.println("My adopter's name is " + rescuer.name + ".");

        Activity running = new Activity();
        running.setActivity("Walking");
        System.out.println(running.getActivity());
//        System.out.println("My favorite activity is " + running.activity + ".");
    }

}

