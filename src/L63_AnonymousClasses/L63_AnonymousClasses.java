package L63_AnonymousClasses;

public class L63_AnonymousClasses {
    public static void main(String[] args) {
        // A class that doesn't have a name
        // Cannot be reused
        // Add custom behaviour without having to create a new class
        // when we need a single object of a class that is differnt than the others
        // Often used for one time uses (TImmerTask, Runnable, Callbacks)

        Dog dog = new Dog();
        dog.speak();

        // created a separate child class for a talking dog that doesn't say woof woof
        TalkingDog talkingDog = new TalkingDog();
        talkingDog.speak();

        Dog dog2 = new Dog(){
            // add custom behaviour here to create an anonymous class that is not named and cannot be reused from a pre existing class
            // define unique properties and override methods
            @Override
            void speak(){
                System.out.println("Scooby Doo says RUH ROH");
            }
        };

        dog2.speak();
    }
}
