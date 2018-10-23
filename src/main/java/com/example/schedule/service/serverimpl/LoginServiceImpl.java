package com.example.schedule.service.serverimpl;

import com.example.schedule.dao.LoginRepository;
import com.example.schedule.entity.Sporter;
import com.example.schedule.service.LoginService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginRepository loginRepository;
    @Override
    public Sporter findone(String account, String password) {
        return loginRepository.findByAccountAndPassword(account,password);
    }
    @Override
    public Sporter getOne(String account) {
        return loginRepository.findByAccount(account);
    }
    @Override
    public List<Sporter> getAll() {
        return loginRepository.findAll();
    }
}
