package tutorials.generics;

public class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
class Mainbox{
    public static void main(String[] args) {


        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"apple", "banana", "orange"};

        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);

        System.out.println("Sum of integers: " + sum(3, 4));
        System.out.println("Sum of doubles: " + sum(2.5, 3.5));

        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello, Generics!");
        String message = stringBox.getContent();
        System.out.println(message);

        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(42);
        int value = integerBox.getContent();
        System.out.println(value);

    }
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}