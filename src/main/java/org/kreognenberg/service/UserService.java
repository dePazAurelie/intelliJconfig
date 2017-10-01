package org.kreognenberg.service;

import org.kreognenberg.model.UsersEntity;
import java.util.List;

public interface UserService {
    UsersEntity register(UsersEntity newUser) throws Exception;
    UsersEntity logUser(String username, String password) throws Exception;
    UsersEntity getById(Integer Id);
    List<UsersEntity> getAll();
}