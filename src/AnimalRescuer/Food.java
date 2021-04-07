package AnimalRescuer;

public class Food {
    private String name = "Yummy";
    double price = 30.99;
    int quantity = 6;
    int availability = 10;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}
