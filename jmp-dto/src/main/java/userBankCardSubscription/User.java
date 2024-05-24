package userBankCardSubscription;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    String surname;
    LocalDate birthday = LocalDate.of(1900, 01, 01);
    static List<User> users = new ArrayList<>(); // may be Set. Is the order important

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

    public long getUserAge() {
        return ChronoUnit.YEARS.between(birthday, LocalDate.now());
    }
}
