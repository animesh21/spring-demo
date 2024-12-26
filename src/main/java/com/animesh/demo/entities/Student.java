package com.animesh.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;


@Entity
public class Student {
    // Getters and Setters
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    private String firstName;

    @Setter
    @Getter
    private String lastName;

    @NonNull
    @ManyToOne
    @JoinColumn(name="group_id", nullable = false)
    private StudentGroup group;


}
