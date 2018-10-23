package com.example.schedule.service;

import com.example.schedule.dao.WalksRepository;
import com.example.schedule.entity.Walks;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class WalksServiceTest {
    @Resource
    private WalksRepository walksRepository;
    @Test
    public void updateWalks() {
        List<Walks> list = walksRepository.findAll();
        Random random = new Random();
        for (int i=0;i<list.size();i++){
            Walks walks = list.get(i);
            walks.setWalkCount(random.nextInt(20000)+20000);
            walks.setCreateTime(new Date());
            walksRepository.saveAndFlush(walks);
        }
    }

}