package ru.job4j.proffesions;

public class Doctor extends Professions {
    private String colorUniform;
    private String medicalEducation;

    public Doctor(String name, int age, int expirience) {
        super(name, age, expirience);
    }

    public String healPeople(Professions professions) {
        return "Я здоров";
    }

    public void giveAdvice() {

    }

}
