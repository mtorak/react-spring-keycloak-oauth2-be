package com.keycloak.rest.entity;

public class CardEntity {

    private String name;
    private String color;
    private Long experience;

    public CardEntity(String name, String color, Long experience) {
        this.name = name;
        this.color = color;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getExperience() {
        return experience;
    }

    public void setExperience(Long experience) {
        this.experience = experience;
    }
}
