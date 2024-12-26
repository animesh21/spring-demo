package com.animesh.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.NonNull;

import java.util.Date;


@Entity
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @ManyToOne
    @JoinColumn(name="student_id", nullable = false)
    private Student student;

    @NonNull
    @ManyToOne
    @JoinColumn(name="subject_id", nullable = false)
    private Subject subject;

    private Date date;

    private Integer mark;
}
