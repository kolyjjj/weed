package li.koly.user.service;

import li.koly.user.domain.User;
import li.koly.user.repository.UserRepository;
import li.koly.user.utils.UserBuilder;

import java.util.Arrays;
import java.util.List;

public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(String name) {
        User user = userRepository.findOne((root, query, cb) -> cb.equal(root.get("name"), name));
        return user;
    }

    public User save(User user) {
        return userRepository.save(user);
    }
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
