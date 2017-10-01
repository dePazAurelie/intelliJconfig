package org.kreognenberg.service;

import org.kreognenberg.model.User;

import java.util.List;

public interface UserService {
    User register(User newUser) throws Exception;
    User logUser(String username, String password) throws Exception;
    User getById(Integer Id);
    List<User> getAll();
}