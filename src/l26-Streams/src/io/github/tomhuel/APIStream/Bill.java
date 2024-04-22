package io.github.tomhuel.APIStream;

public class Bill {
    private String description;

    public Bill(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
