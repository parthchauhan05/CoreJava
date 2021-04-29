public class A2Q2 {
    public static void main(String[] args){
        Animal lion = new Animal("lion", "roar", "deer", "jungle", "male", 4);
        Animal deer = new Animal("deer", "bellow", "grass", "jungle", "female", 4);
        Animal peacock = new Animal ("peacock", "scream", "insect", "jungle", "male", 2);

        lion.makeSound(3);
        lion.eat();
        deer.makeSound(4);
        deer.eat();
        peacock.makeSound(5);
        peacock.eat();
    }
}

class Animal {
    private String name, animalSound, animalFood, habitat, gender;
    private int numberOfLegs;

    public Animal() {
        this.animalFood = "Corn";
        this.animalSound = "Blah Blah!";
        this.gender = "Male";
        this.habitat = "House";
        this.name = "Human";
        this.numberOfLegs = 2;
    }

    public Animal(String name, String animalSound, String animalFood, String habitat, String gender, int numberOfLegs){
        this.animalFood = animalFood;
        this.animalSound = animalSound;
        this.gender = gender;
        this.habitat = habitat;
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }

    public void makeSound(int x) {
        for (int i =0; i< x; i++){
            System.out.println(this.animalSound);
        }
    }

    public void eat() {
        System.out.println(this.name + " has eaten " + this.animalFood);
    }

}
