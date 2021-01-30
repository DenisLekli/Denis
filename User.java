package com.company;

public class User {
    private String name;
    private String password;
    public User(String fn, String pw){
        name = fn;

        password = pw;
    }

    public String getName() { return name; }
    public String getPassword() {return password;}
}
