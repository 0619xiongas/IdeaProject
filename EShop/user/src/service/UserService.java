package service;

import eshop_entity.User;

public interface UserService {
    User login(User user) throws Exception;
}
