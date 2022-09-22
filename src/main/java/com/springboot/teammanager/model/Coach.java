package com.springboot.teammanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Coach implements Serializable {
    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(nullable = false, updatable = false)
private Long id;
    private String name;
    private String email;
}