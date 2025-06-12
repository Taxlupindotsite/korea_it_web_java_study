package _31_Generic.Wildcard.LowerBoundedWildCard;

public class Main {

    public static void main(String[] args) {
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Maltese> malteseBox = new Box<>();

        SuperWildCard.putDog(animalBox);
//        SuperWildCard.putDog(malteseBox);
        SuperWildCard.putDog(dogBox);

    }
}
