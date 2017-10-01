package org.kreognenberg.service;

import java.util.List;
import org.kreognenberg.dao.UserDao;
import org.kreognenberg.model.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public UsersEntity register(UsersEntity newUser) throws Exception {
        List<UsersEntity> users = getAll();
        for (UsersEntity user : users) {
            if (user.equals(newUser)) {
                throw new Exception("User already exists !");
            }
        }
        userDao.save(newUser);
        return newUser;
    }


    public UsersEntity logUser(String username, String password) throws Exception {
        UsersEntity user = getByName(username);
        if(user.getPassword().equals(password)) {
            return user;
        } else {
            throw new Exception("Id or password doesn't exit !");
        }
    }

    public List<UsersEntity> getAll() {
        return userDao.findAll();
    }

    public UsersEntity getById(Integer id) {
        return userDao.findById(id);
    }

    private UsersEntity getByName(String name) {
        return userDao.findByName(name);
    }
}

/*
@Service
public class UserServiceImpl implements UserService {
    private HashMap<String, UsersEntity> users = new HashMap<>();

    public UsersEntity register(UsersEntity newUser) throws Exception {
        if (!users.containsKey(newUser.getName())) {
            users.put(newUser.getName(), newUser);
            return newUser;

        } else {
            throw new Exception("User already exists !");
        }
    }


    public UsersEntity logUser(String username, String password) throws Exception {
        if (users.get(username).getPassword().equals(password)) {
            return users.get(username);
        } else {
            throw new Exception("Id or password doesn't exit !");
        }
    }

    public List<UsersEntity> getAll() {
        return new ArrayList<>(users.values());
    }

    public UsersEntity getById(Integer id) {
        for (Map.Entry<String, UsersEntity> entry : users.entrySet()) {
            if (entry.getValue().getId() == id) {
                return entry.getValue();
            }
        }
        return null;
    }
}
*/