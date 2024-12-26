package com.animesh.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Collection;


@Entity
public class StudentGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Getter
    @OneToMany(mappedBy = "group")
    private Collection<Student> students;

}
