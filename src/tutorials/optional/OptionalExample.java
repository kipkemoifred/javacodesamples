package tutorials.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        Optional<String> emptyOptional = Optional.empty();
        String value = null;//"Hello, Optional!";
        Optional<String> optionalWithValue = Optional.ofNullable(value);

        System.out.println(optionalWithValue);


        String[] str = new String[10];
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){  // check for value is present or not
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("string value is not present");
    }
}

