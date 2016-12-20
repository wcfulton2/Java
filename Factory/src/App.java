/**
 * Created by Bfult on 12/19/2016.
 */
public class App {

    public static void main(String[] args){

        Animal Pet1 = Factory.getAnimal("DOG");

        Pet1.sayHello();

        Animal Pet2 = Factory.getAnimal("CAT");

        Pet2.sayHello();

        Animal Pet3 = Factory.getAnimal("HAMSTER");

        Pet3.sayHello();
    }


}
