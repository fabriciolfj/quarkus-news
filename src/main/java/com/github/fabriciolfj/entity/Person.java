package com.github.fabriciolfj.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "person")
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id", nullable = false, updatable = false)
    private Long actorId;

    @Column(name = "first_name", nullable = false, columnDefinition = "varchar(45)")
    private String firstName;

    @Column(name = "last_name", nullable = false, columnDefinition = "varchar(45)")
    private String lastName;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
}
