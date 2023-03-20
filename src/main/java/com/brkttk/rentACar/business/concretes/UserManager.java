package com.brkttk.rentACar.business.concretes;

import com.brkttk.rentACar.business.abstracts.UserService;
import com.brkttk.rentACar.core.dataAccess.UserDao;
import com.brkttk.rentACar.core.entities.User;
import com.brkttk.rentACar.core.utilities.results.DataResult;
import com.brkttk.rentACar.core.utilities.results.Result;
import com.brkttk.rentACar.core.utilities.results.SuccessDataResult;
import com.brkttk.rentACar.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {
    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult(user.getEmail() + " kullanıcı eklendi.");
    }

    @Override
    public DataResult<User> getByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.getByEmail(email), "Kullanıcı bulundu.");
    }
}
