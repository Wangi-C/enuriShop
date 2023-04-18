package com.enrui.enurishop.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class EnuriMember {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private long id;
    private String name;
    private String sex;
    private int age;
}
