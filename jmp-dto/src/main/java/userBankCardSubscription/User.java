package userBankCardSubscription;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    String surname;
    LocalDate birthday = LocalDate.of(1900, 01, 01);
    static List<User> users = new ArrayList<>();

    public User(String name, String surname, LocalDate birthday){
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        users.add(this);
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public static List<User> getUsers(){
        return users;
    }
}
