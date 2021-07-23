package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.setDefense("Physical");
        System.out.println("health:"+boss.getHealth() + " damage: "+boss.getDamage() +" defence: "+ boss.getDefense());

    }
}
