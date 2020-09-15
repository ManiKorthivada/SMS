package com.application.sms.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "sample")
@Data
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "owner")
    private String owner;
}
