package kg.medExpo.medExpo.service;

import kg.medExpo.medExpo.model.User;
import kg.medExpo.medExpo.model.dto.AuthDto;
import kg.medExpo.medExpo.model.dto.UserDto;

public interface UserService {

    User createUser(UserDto userDto) throws Exception;

}
