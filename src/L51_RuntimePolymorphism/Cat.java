package L51_RuntimePolymorphism;

public class Cat implements Animal{
    @Override
    public void speak(){
        System.out.println("The cat goes MEOW!");
    }
}
