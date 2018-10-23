package com.example.schedule.dao;

import com.example.schedule.entity.Walks;
import org.hibernate.sql.Insert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WalksRepository extends JpaRepository<Walks,Integer> {
//    @Query("select u from Walks u order by u.walkCount desc ")
//    List<Walks> getSports();
    List<Walks>findAll();
}
