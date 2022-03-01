package domain;

import care.AnimalCare;
import marketing.AnimalMarketing;

public class Animal implements AnimalCare, AnimalMarketing{

    private String name;
    private String type;
    private int age;

    public Animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getCareInfo() {
        return String.format("%s, %s, %s",name,type,age);
    }

    @Override
    public String getCareOnlyName() {
        return String.format("%s",name);
    }

    @Override
    public String getMarketingInfo() {
        return String.format("Animal type: %s",type);
    }
}
