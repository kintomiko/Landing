package org.nzcn.services;

import org.nzcn.models.User;

import java.util.List;

/**
 * Created by kindai on 9/07/16.
 */
public interface UserService {
    User getObject(String userId);

    User createUser(User u);

    User updateUser(User user);

    List<User> getAll();
}
