package org.nzcn.services;

import org.kin.common.DAO;
import org.nzcn.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kindai on 9/07/16.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDao")
    DAO<User> dao;

    @Override
    public User getObject(String userId) {
        return dao.getObject(userId);
    }

    @Override
    public User createUser(User u){
        return dao.create(u);
    }

    @Override
    public User updateUser(User user) {
        return dao.update(user);
    }

    @Override
    public List<User> getAll() {
        return dao.getAll();
    }
}
