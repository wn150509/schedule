package com.example.schedule.dao;

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
public class WalksRepositoryTest {
    @Resource
    private WalksRepository walksRepository;
    @Test
    public void findAll() throws Exception {
        List<Walks>walksList=walksRepository.findAll();
        walksList.forEach(walks -> System.out.println(walks));
//        Walks walks=walksRepository.getOne(1);
//        System.out.println(walks);
//        walks.setWalkCount(2000);
//        walks.setCreateTime(new Date());
//        walksRepository.saveAndFlush(walks);
    }
    @Test
    public void update()throws Exception{
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