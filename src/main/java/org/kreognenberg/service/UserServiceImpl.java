package org.kreognenberg.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.kreognenberg.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private HashMap<String, User> users = new HashMap<String, User>();

    public User register(User newUser) throws Exception {
        if (!users.containsKey(newUser.getName())) {
            users.put(newUser.getName(), newUser);
            return newUser;

        } else {
            throw new Exception("User already exists !");
        }
    }


    public User logUser(String username, String password) throws Exception {
        if (users.get(username).getPassword().equals(password)) {
            return users.get(username);
        } else {
            throw new Exception("Id or password doesn't exit !");
        }
    }

    public List<User> getAll() {
        return new ArrayList<User>(users.values());
    }

    public User getById(Integer id) {
        for (Map.Entry<String, User> entry : users.entrySet()) {
            if (entry.getValue().getId() == id) {
                return entry.getValue();
            }
        }
        return null;
    }
}