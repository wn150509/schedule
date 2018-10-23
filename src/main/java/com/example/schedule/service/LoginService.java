package com.example.schedule.service;

import com.example.schedule.entity.Sporter;
import java.util.List;

public interface LoginService {
    Sporter findone(String account, String password);
    Sporter getOne(String account);
    /**
     * 查找所有用户的信息，以及该用户下的步数信息
     * @return
     */
    List<Sporter> getAll();
}
