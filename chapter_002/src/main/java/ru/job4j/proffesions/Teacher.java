package ru.job4j.proffesions;

public class Teacher extends Professions {

    private String subject;
    private String hobby;

    public Teacher(String name, int age, int expirience) {
        super(name, age, expirience);

    }

    public String teach(Professions professions) {

        return "Буду тебя учить уму разуму";
    }

    public void fillDiary() {

    }
}
