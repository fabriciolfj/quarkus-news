package com.github.fabriciolfj.repository;

import com.github.fabriciolfj.entity.Person;
import com.speedment.jpastreamer.application.JPAStreamer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;

import java.util.Optional;

@ApplicationScoped
public class PersonRepository {

    @PersistenceContext
    EntityManagerFactory entityManagerFactory;

    private final JPAStreamer jpaStreamer;

    public PersonRepository (EntityManagerFactory entityManagerFactory) {
        jpaStreamer = JPAStreamer.of(entityManagerFactory);
    }

    public Optional<Person> getPersonById(final Long id) {
        return this.jpaStreamer.stream(Person.class)
                .filter(p -> p.getActorId().equals(id))
                //.skip(10)
                .limit(5)
                .findAny();
    }

}