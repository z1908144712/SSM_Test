package com.test.dao;

import com.test.model.User;

public interface UserDao {
    User selectUser(long id);
}
