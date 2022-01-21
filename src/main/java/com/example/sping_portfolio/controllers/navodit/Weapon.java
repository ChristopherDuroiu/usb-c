package com.example.sping_portfolio.controllers.navodit;

public class Weapon {
    private Double damage;
    private String gunType;
    private String gunName;
    private static int playerMaxHealth = 200;

    public Weapon(){
        gunName = "";
        gunType = "";
        damage = 0.0;

    }

    public Weapon(String name, String type, Double damage){
        gunName = "";
        gunType = "";
        damage = damage;

    }


}
