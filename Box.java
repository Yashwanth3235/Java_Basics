// Using Generic class 

public class Box<T> {
    private T item;

    public void setItem(T item)
    {
        this.item = item;
    }
    public T getItem()
    {
        return item;
    }

    public static void main(String[] args)
    {
        // Create a box for integer
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(10);
        System.out.println("Integer value:" + integerBox.getItem());

        // Create a Box for string
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello world!");
        System.out.println("String value:" + stringBox.getItem());

    }
}
