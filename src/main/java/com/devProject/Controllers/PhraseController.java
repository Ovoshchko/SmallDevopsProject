package com.devProject.Controllers;


import com.devProject.Model.Phrase;
import com.devProject.Repositories.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/phrases")
@Component
public class PhraseController {

    @Autowired
    private PhraseRepository phraseRepository;

    @GetMapping
    public Phrase getRandom() {
        List<Phrase> phrases = phraseRepository.findAll();
        int index = new Random().nextInt(phrases.size());
        return phrases.get(index);
    }

    @PostMapping
    public Phrase savePhrase(@RequestBody Phrase phrase) {
        return phraseRepository.save(phrase);
    }

}
