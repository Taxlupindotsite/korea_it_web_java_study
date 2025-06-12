package _31_Generic.Wildcard;

public class Main {

    public static void main(String[] args) {

//        Box<String> stringBox = new Box<>();
//        stringBox.setItem("Hello");
//
//        Box<Integer> integerBox = new Box<>();
//        integerBox.setItem(1234);
//
//        UnBoundedWildCard.printBox(stringBox);
//        UnBoundedWildCard.printBox(integerBox);

        Box<Dog> dogBox = new Box<>();
        dogBox.setItem(new Dog());

        Box<Cat> catBox = new Box<>();
        catBox.setItem(new Cat());

        Box<Animal> animalBox = new Box<>();
        animalBox.setItem(new Animal());


        ExtendsWildCard.makeSound(dogBox);
        ExtendsWildCard.makeSound(catBox);
        ExtendsWildCard.makeSound(animalBox);


    }

}
