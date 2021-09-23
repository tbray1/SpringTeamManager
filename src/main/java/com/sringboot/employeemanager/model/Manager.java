package com.sringboot.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Manager implements Serializable {
    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(nullable = false, updatable = false)
private Long id;
    private String name;
    private String email;
}