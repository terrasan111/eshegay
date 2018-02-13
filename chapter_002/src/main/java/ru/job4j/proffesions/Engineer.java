package ru.job4j.proffesions;

public class Engineer extends Professions {

    private String education;
    private String speakLanguage;

    public void repairEqupment() {

    }

    public void driveCar() {

    }

    public Engineer(String name, int age, int expirience) {
        super(name, age, expirience);
    }

    public String repair(Professions professions) {
        return "Все исправлено";
    }
}
