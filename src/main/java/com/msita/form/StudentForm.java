package com.msita.form;

import java.util.List;

public class StudentForm {

    private String name;

    private float score;

    private String major;

    private String gender;

    private List<String> languages;

    private List<String> hobbies;

    public StudentForm(final String name, final float score, final String major,
                       final String gender, final List<String> languages,
                       final List<String> hobbies) {
        this.name = name;
        this.score = score;
        this.major = major;
        this.gender = gender;
        this.languages = languages;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(final float score) {
        this.score = score;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(final String major) {
        this.major = major;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(final String gender) {
        this.gender = gender;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(final List<String> languages) {
        this.languages = languages;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(final List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
