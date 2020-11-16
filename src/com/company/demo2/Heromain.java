package com.company.demo2;

public class Heromain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("万箭齐发");
            }
        };
        hero.setSkill(skill);
        hero.attack();
    }
}
