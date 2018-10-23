package com.example.schedule.service.serverimpl;

import com.example.schedule.dao.WalksRepository;
import com.example.schedule.entity.Walks;
import com.example.schedule.service.WalksService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class WalksServiceImpl implements WalksService{
    @Resource
    private WalksRepository walksRepository;
    @Override
    public void updateWalks() {
        List<Walks> list = walksRepository.findAll();
        Random random = new Random();
        for (int i=0;i<list.size();i++){
            Walks walks = list.get(i);
            System.out.println(walks);
            walks.setWalkCount(random.nextInt(20000)+20000);
            walks.setCreateTime(new Date());
            walksRepository.saveAndFlush(walks);
        }
    }
}
