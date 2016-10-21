package li.koly.user.controller;

import li.koly.user.dto.UserDto;
import li.koly.user.dto.UserTransformer;
import li.koly.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "{loginName}", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public UserDto getUserByLoginName(@PathVariable String loginName) {
        return UserTransformer.transform(userService.getUser(loginName));
    }
}
