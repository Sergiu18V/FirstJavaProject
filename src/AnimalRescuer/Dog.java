package AnimalRescuer;

public class Dog {
    private String name = "York";
    private int age = 12;
    private int health = 9;
    private int hunger = 10;
    private int temper = 10;
    private String favoriteFood = "Whatever I am eating at the moment";
    private String favoriteActivity = "Taking long walks";

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHealth() {
        return health;
    }

    public int getHunger() {
        return hunger;
    }

    public int getTemper() {
        return temper;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }
    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setTemper(int temper) {
        this.temper = temper;
    }

    public void setFavoriteFood(String newFavoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void setFavoriteActivity(String newFavoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }
}

