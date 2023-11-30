package com.devProject.Repositories;

import com.devProject.Model.Phrase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhraseRepository extends CrudRepository<Phrase, Long> {

    List<Phrase> findAll();

}
