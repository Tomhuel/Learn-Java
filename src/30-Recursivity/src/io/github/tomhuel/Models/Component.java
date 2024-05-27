package io.github.tomhuel.Models;

import java.util.ArrayList;
import java.util.List;

public class Component {
    private String name;
    private List<Component> children;

    public Component(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Component> getChildren() {
        return children;
    }

    public void setChildren(List<Component> children) {
        this.children = children;
    }

    public Component addComponent(Component component) {
        this.children.add(component);
        return this;
    }

    public boolean hasChildren() {
        return !this.children.isEmpty();
    }


}
