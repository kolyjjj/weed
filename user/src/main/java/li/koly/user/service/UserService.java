package li.koly.user.service;

import li.koly.user.domain.User;
import li.koly.user.utils.UserBuilder;

import java.util.Arrays;
import java.util.List;

public class UserService {
    public List<User> getUsers() {
        return Arrays.asList(
                new UserBuilder()
                        .withLoginName("koly")
                        .withFirstName("koly")
                        .withLastName("Li")
                        .build()
        );
    }
}
