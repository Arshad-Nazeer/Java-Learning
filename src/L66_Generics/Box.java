package L66_Generics;

// Box is going to act as a container
public class Box<Thing> {
    Thing item;

    public void setItem(Thing thing) {
        item = thing;
    }

    public Thing getItem() {
        return item;
    }
}
