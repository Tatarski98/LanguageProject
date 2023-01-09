package com.example.Language.LanguageLogic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class TranslateService {
    Random random = new Random();
    private final TranslateRepository translateRepository;

    public TranslateService(TranslateRepository translateRepository) {
        this.translateRepository = translateRepository;
    }

    public void addNewWord(Translate translate){

        translateRepository.save(translate);
    }

    public Translate getWord(){
        List<Translate> number_of_words = translateRepository.findAll();
        Translate translate = translateRepository.getReferenceById((int)(Math.random()*(number_of_words.size()-1+1)+1));
        return translate;
    }

    public void updateWords(int id,String spanish, String english) {
        Optional<Translate> word = translateRepository.findById(id);
        if(word.isPresent()) {
        Translate update_word = word.get();
        update_word.setSpa_word(spanish);
        update_word.setEng_word(english);
        update_word.setId(id);
        translateRepository.save(update_word);
        }
    }

    public void deleteWord(int id_word) {
        Optional<Translate> delete_word = translateRepository.findById(id_word);
       if(delete_word.isPresent()) {
           Translate word = delete_word.get();
            translateRepository.delete(word);
        }
    }


    public List<Translate> getWordsList() {
        List<Translate> list_of_words = translateRepository.findAll();
        return list_of_words;
    }

}
