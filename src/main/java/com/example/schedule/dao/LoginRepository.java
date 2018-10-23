package com.example.schedule.dao;

import com.example.schedule.entity.Sporter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface LoginRepository extends JpaRepository<Sporter,Integer> {
    Sporter findByAccountAndPassword(String account, String password);
    Sporter findByAccount(String account);
}
