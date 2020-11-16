package com.company.demo2;

public class Hero {
    private String name;
    private Skill skill;

    public Hero() {
    }

    public void attack(){
        System.out.print(name+"使用了");
        skill.use();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
