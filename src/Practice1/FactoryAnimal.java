package Practice1;

public class FactoryAnimal {
    public Animal getAnimal(String type) {
        Animal animal = null;
        switch (type) {
            case "Dog":
                animal = new Dog();
                break;
            case "Cat":
                animal = new Cat();
                break;
        }
        return animal;
    }
}
