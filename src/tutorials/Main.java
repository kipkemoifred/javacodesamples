package tutorials;

import tutorials.functional.Demo;
import tutorials.functional.DemoImpl;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class Main {
    static int a=2;

    // Using the volatile keyword to ensure visibility across threads
    private volatile boolean flag = false;

    public static void main(String[] args) throws IOException {
//        new DemoImpl().demonstrate("jdhbfnvjhvbn", "My name");



        final int num=1;
//        num=2;



//        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Watermelon");


        // with lambda
        Demo demo = (message, user) -> System.out.println(message.concat(" ").concat(user));

        // without lambda
        Demo demo1 = new DemoImpl(){
            @Override
            public void demonstrate(String message, String user) {
                super.demonstrate(message, user);
            }
        };

        demo.demonstrate("Me again", "with lambda");
        demo1.demonstrate("Me again", " without lambda");
//        Stream

//        Path filePath = Paths.get("D:\\Applications\\Messaging\\messaging_app_3.5\\Add_Names.aspx");
//        List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
//        System.out.println(lines);


        // Using method reference
//        List<String> fruits = Arrays.asList("Apple", "Orange", "Banana","fasdfsa");
//        fruits.forEach(System.out::println);

    }
}

