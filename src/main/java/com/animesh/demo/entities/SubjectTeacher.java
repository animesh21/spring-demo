package com.animesh.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.NonNull;


@Entity
public class SubjectTeacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @ManyToOne
    @JoinColumn(name="teacher_id", nullable = false)
    private Teacher teacher;

    @NonNull
    @ManyToOne
    @JoinColumn(name="subject_id", nullable = false)
    private Subject subject;

    @NonNull
    @ManyToOne
    @JoinColumn(name="student_group_id", nullable = false)
    private StudentGroup studentGroup;
}
