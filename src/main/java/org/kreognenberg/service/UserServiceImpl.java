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
        UsersEntity user = getByUsername(username);
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

    private UsersEntity getByUsername(String username) {
        return userDao.findByName(username);
    }

}