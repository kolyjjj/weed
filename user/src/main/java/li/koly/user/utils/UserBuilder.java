package li.koly.user.utils;

import li.koly.user.domain.User;

public class UserBuilder {

    private String loginName;
    private String firstName;
    private String middleName;
    private String lastName;
    private Long userId;

    public User build() {
        User user = new User();
        user.setUserId(userId);
        user.setLoginName(loginName);
        user.setFirstName(firstName);
        user.setMiddleName(middleName);
        user.setLastName(lastName);
        return user;
    }

    public UserBuilder withLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }

    public UserBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public UserBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withId(Long id) {
        this.userId = id;
        return this;
    }
}
