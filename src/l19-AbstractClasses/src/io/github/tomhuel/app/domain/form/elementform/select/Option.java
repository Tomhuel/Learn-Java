package io.github.tomhuel.app.domain.form.elementform.select;

public class Option {
    private String key;
    private String value;
    private boolean selected = false;

    public Option() {
    }

    public Option(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @Override
    public boolean equals(Object obj) {
        Option option = (Option) obj;
        return this.selected == option.selected && this.key.equals(option.getKey()) && this.value.equals(option.getValue());
    }
}
