import com.fasterxml.jackson.databind.ObjectMapper;
import de.telran.model.Address;
import de.telran.model.Phone;
import de.telran.model.User;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        User user =mapper.readValue(Main.class.getResourceAsStream("user_with_address.json"), User.class);
        System.out.println(user);

       Phone[] phones = {new Phone("+49","12483003"),
            new Phone("+7", "12456237237")};

        User user1 = new User("Ivan","Ivanov", new Address("Lesnyay","Moskau"),
                phones);
       mapper.writeValue(new File("user1.json"), user1);


    }
}
