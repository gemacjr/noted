package com.swiftbeard.repository;

import com.swiftbeard.model.Note;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by edmac on 6/20/17.
 */

@Repository
public interface NoteRepository extends CrudRepository <Note, Long>{


    List<Note> findAllByBodyContains(String body);
}
