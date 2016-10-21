package li.koly.user.dto;

import li.koly.user.domain.User;

public class UserTransformer {
    public static UserDto transform(User user) {
        UserDto userDto = new UserDto();
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        return userDto;
    }
}
