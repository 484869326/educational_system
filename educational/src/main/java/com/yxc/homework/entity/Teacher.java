package com.yxc.homework.entity;
public class Teacher {
    private Integer id;
    private String tno;
    private String name;
    private char gender;
    private String password;
    private String email;
    private String telephone;
    private String address;
    private String portrait_path;
    private String clazz_name;

    public Teacher() {
    }
    public Teacher(String name, String clazz_name) {
        this.name = name;
        this.clazz_name = clazz_name;
    }

    public Teacher(Integer id, String tno, String name, char gender, String password, String email, String telephone, String address, String portrait_path, String clazz_name) {
        this.id = id;
        this.tno = tno;
        this.name = name;
        this.gender = gender;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
        this.portrait_path = portrait_path;
        this.clazz_name = clazz_name;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPortrait_path() {
        return portrait_path;
    }

    public void setPortrait_path(String portrait_path) {
        this.portrait_path = portrait_path;
    }

    public String getClazz_name() {
        return clazz_name;
    }

    public void setClazz_name(String clazz_name) {
        this.clazz_name = clazz_name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", tno='" + tno + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", portrait_path='" + portrait_path + '\'' +
                ", clazz_name='" + clazz_name + '\'' +
                '}';
    }
}