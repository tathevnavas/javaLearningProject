package userBankCardSubscription;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalLong;

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

//    public static OptionalLong getUserAge(User user){
//        return users
//            .stream()
//            .filter(u -> u.name.equals(user.name) && u.surname.equals(user.surname))
//            .mapToLong(u -> ChronoUnit.YEARS.between(u.getBirthday(), LocalDate.now()))
//            .findFirst();
//    }

    public static List<User> getUsers(){
        return users;
    }
}
