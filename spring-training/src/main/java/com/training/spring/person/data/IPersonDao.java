package com.training.spring.person.data;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.training.spring.person.services.PersonDTO;

public interface IPersonDao extends CrudRepository<PersonDTO, Long> {

    List<PersonDTO> findByName(String name);

    List<PersonDTO> findByNameAndSurname(String name,
                                         String surname);

    List<PersonDTO> findByNameIn(List<String> name);

    List<PersonDTO> findByNameOrderByNameAsc(String name);

    @Query("select p from PersonDTO p where p.name=?1")
    List<PersonDTO> searchName(String name);

    @Query("select p from PersonDTO p where p.name=:isim and p.surname=:soy")
    List<PersonDTO> searchName3(@Param("soy") String surname,
                                @Param("isim") String name);

    @Query(value = "select * from person where name=?1", nativeQuery = true)
    List<PersonDTO> searchName2(String name);

}
