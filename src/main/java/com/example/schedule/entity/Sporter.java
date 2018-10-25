package com.example.schedule.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Sporter {
    @Id
    @GeneratedValue
    private Integer id;
    private String account;
    private String avatar;
    private String password;
    private String bgpic;
    /**
     * 一对多关系，另一张表的外键
     */
    @OneToMany(fetch = FetchType.EAGER , cascade = CascadeType.REMOVE)
    @JoinColumn(name = "sporter_id")
    private List<Walks> walksList = new ArrayList<>();

    public Sporter() {

    }

    public Sporter(String account, String avatar, String password, String bgpic) {
        this.account = account;
        this.avatar = avatar;
        this.password = password;
        this.bgpic = bgpic;
    }

    public Sporter(String account, String avatar, String password, String bgpic, List<Walks> walksList) {
        this.account = account;
        this.avatar = avatar;
        this.password = password;
        this.bgpic = bgpic;
        this.walksList = walksList;
    }
}
