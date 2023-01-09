package com.example.Language.LanguageLogic;

import jakarta.persistence.*;

@Entity
@Table(name = "Words")
public class Translate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String eng_word;
    private String spa_word;

    public Translate() {}

    public String getEng_word() {
        return eng_word;
    }

    public void setEng_word(String eng_word) {
        this.eng_word = eng_word;
    }

    public String getSpa_word() {
        return spa_word;
    }

    public void setSpa_word(String spa_word) {
        this.spa_word = spa_word;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Translate{"+
                "eng_word='" + eng_word + '\'' +
                ", spa_word='" + spa_word + '\'' +
                '}';
    }



}
