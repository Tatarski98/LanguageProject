package com.example.Language.LanguageLogic;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class TranslateController {

    private final TranslateService translateService;

    public TranslateController(TranslateService translateService) {
        this.translateService = translateService;
    }


    @PostMapping
    public void NewWord(@RequestBody Translate translate) {
        translateService.addNewWord(translate);
    }
    // return random word
    @GetMapping
    public Translate GetRandomWord() {
        return translateService.getWord();
    }

    @GetMapping(path = "/list")
    public List<Translate> GetRandomWordsList() {
        return translateService.getWordsList();
    }

    @PutMapping(path = "{id}/{spanish}/{english}")
    public void updateWord(@PathVariable("id")int id,@PathVariable("spanish")String spanish,@PathVariable("english")String english) {
        translateService.updateWords(id,spanish,english);
    }

    @DeleteMapping(path = "delete/{id_word}")
    public void deleteWord(@PathVariable("id_word")int word) {
        translateService.deleteWord(word);
    }


}
