package com.brkttk.rentACar.business.abstracts;

import com.brkttk.rentACar.core.entities.User;
import com.brkttk.rentACar.core.utilities.results.DataResult;
import com.brkttk.rentACar.core.utilities.results.Result;

public interface UserService {
    Result add(User user);

    DataResult<User> getByEmail(String email);
}
