package com.github.fabriciolfj;

import com.github.fabriciolfj.entity.Person;
import com.github.fabriciolfj.repository.PersonRepository;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import lombok.RequiredArgsConstructor;

@Path("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository personRepository;

    @GET
    @Path("/{id}")
    public Person findById( @PathParam("id") final Long id) {
        return personRepository.getPersonById(id)
                .orElseThrow();
    }
}
