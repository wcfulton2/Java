/**
 * Created by Bfult on 12/19/2016.
 */
public class Factory {

    public static Animal getAnimal(String type) {
        if (type == null) {
            return null;
        } else if (type.equalsIgnoreCase("CAT")) {
            return new Cat();
        } else if (type.equalsIgnoreCase("DOG")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("HAMSTER")) {
            return new Hamster();
        }
        return null;
    } //end get
} // end Factory
