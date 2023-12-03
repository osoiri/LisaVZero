import model.User;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User user = User.getBuilder()
                .setUserId("Dragon001")
                .setName("Soumya")
                .setBirthday(LocalDate.of(1997, 6, 11))
                .build();
        System.out.println(user);
    }
}
