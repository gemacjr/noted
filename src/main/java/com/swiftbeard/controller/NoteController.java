package com.swiftbeard.controller;

import com.swiftbeard.model.Note;
import com.swiftbeard.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by edmac on 6/20/17.
 */

@RestController
@RequestMapping("api/notes")
public class NoteController {

    private final NoteRepository repository;

    @Autowired
    public NoteController(NoteRepository repository){
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable findAll(){
        return repository.findAll();
    }

    @RequestMapping( value = "/{id}")
    public Note findOne(@PathVariable("id") Long id){
        return repository.findOne(id);
    }

    @RequestMapping(params = "body")
    public List<Note> findAllByBodyContains(String body){
        return repository.findAllByBodyContains(body);
    }




    @RequestMapping(method = RequestMethod.POST)
    public Note create(@RequestBody Note note){
        return repository.save(note);
    }
}
