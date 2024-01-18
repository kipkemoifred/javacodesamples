package tutorials.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateExample {

        public static void main(String[] args) {
            LocalDate myObj = LocalDate.now(); // Create a date object
            System.out.println(myObj); // Display the current date

            LocalDateTime myDateObj = LocalDateTime.now();
            System.out.println("Before formatting: " + myDateObj);
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("After formatting: " + formattedDate);
        }

}
