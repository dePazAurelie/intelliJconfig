package org.kreognenberg.dao;

import org.kreognenberg.model.UsersEntity;
import java.util.List;

public interface UserDao {
    UsersEntity findById(Integer id);
    List findAll();
    void save(UsersEntity user);
    void update(UsersEntity user);
    void delete(Integer id);
    UsersEntity findByName(String name);
}
