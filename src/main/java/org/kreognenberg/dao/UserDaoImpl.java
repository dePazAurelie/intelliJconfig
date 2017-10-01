package org.kreognenberg.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import org.kreognenberg.model.UsersEntity;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    private UsersEntity user = new UsersEntity();

    public void save(UsersEntity user) {
        Session session = startSession();
        session.save(user);
        closeSession(session);
    }

    public void update(UsersEntity user) {
        Session session = startSession();
        session.update(user);
        closeSession(session);
    }

    public void delete(Integer id) {
        Session session = startSession();
        session.delete(user);
        closeSession(session);
    }

    public UsersEntity findById(Integer id) {
        Session session = startSession();
        user = session.get(UsersEntity.class, id);

        closeSession(session);
        return user;
    }

    public UsersEntity findByName(String name) {
        Session session = startSession();
        user = session.get(UsersEntity.class, name);

        closeSession(session);
        return user;
    }

    public List<UsersEntity> findAll() {
        Session session = startSession();
        List<UsersEntity> users = session.createQuery("from UsersEntity ").list();
        closeSession(session);
        return users;
    }

    private Session startSession() {
        final SessionFactory sessionFactory = buildSessionFactory();
        return sessionFactory.openSession();
    }

    private void closeSession(Session session) {
        session.close();
    }

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();

            configuration.configure();
            configuration.addAnnotatedClass(UsersEntity.class);
            ServiceRegistry serviceRegistry =
                    new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            return configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
