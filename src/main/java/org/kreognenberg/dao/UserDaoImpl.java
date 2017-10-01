package org.kreognenberg.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.kreognenberg.model.UsersEntity;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class UserDaoImpl implements UserDao{
    private SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
    private UsersEntity user = new UsersEntity();

    public UsersEntity findById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        user = session.get(UsersEntity.class, id);
        session.close();
        return user;
    }

    public List<UsersEntity> findAll() {
        Session session = sessionFactory.getCurrentSession();
        List<UsersEntity> users = new ArrayList<>();
        users = session.createQuery("FROM UsersEntity").list();
        session.close();
        return users;
    }

    public void save(UsersEntity user) {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    public void update(UsersEntity user) {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
    }

    public void delete(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        user = findById(id);
        session.delete(user);
        transaction.commit();
        session.close();
    }

    @Override
    public UsersEntity findByName(String name) {
        Session session = sessionFactory.getCurrentSession();
        user = session.get(UsersEntity.class, name);
        session.close();
        return user;
    }
}