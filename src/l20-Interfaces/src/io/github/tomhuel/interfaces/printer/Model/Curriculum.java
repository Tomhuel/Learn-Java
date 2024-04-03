package io.github.tomhuel.interfaces.printer.Model;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Paper {

    private String person;
    private String career;
    private List<String> experience;

    public Curriculum(String person, String career, String content) {
        super(content);
        this.career = career;
        this.person = person;
        this.experience = new ArrayList<>();
    }

    public Curriculum addExperience(String experience) {
        this.experience.add(experience);
        return this;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curriculum:\n")
                .append("Name: ").append(this.person)
                .append("\nCareer: ").append(this.career)
                .append("\nAbout: ").append(this.content)
                .append("\nExperience: ");
        for (String experience : this.experience) {
            sb.append("\n\t").append(experience);
        }
        return sb.toString();
    }
}
