/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_6_xo_file;

/**
 *
 * @author 65160230 Piyapong
 */
public class Friend {

    private String name;
    private int age;
    private String tel;

    public Friend() {
        this.name = "unknown";
        this.age = 0;
        this.tel = "000-0000000";
    }

    public Friend(String name, int age, String tel) {
        this.name = name;
        this.age = age;
        String newTel = tel.substring(0, 3) + "-" + tel.substring(3);
        this.tel = newTel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Friend : " + name + "\nAge : " + age + "\nTel : " + tel;
    }
}
