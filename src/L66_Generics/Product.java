package L66_Generics;

// compatible with any types in place of T and U
public class Product<T, U> {
    T item;
    U price;

    public Product(T item, U price) {
        this.item = item;
        this.price = price;
    }

    public T getItem() {
        return this.item;
    }

    public U getPrice() {
        return this.price;
    }
}
