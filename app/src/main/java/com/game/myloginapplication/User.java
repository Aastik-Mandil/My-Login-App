package com.game.myloginapplication;

public class User {
    private String Displayname;
    private String Email;
    private long createdAt;

    public User (){};

    public User(String displayname,String email,long createdAt){
        this.Displayname=displayname;
        this.Email=email;
        this.createdAt=createdAt;
    }

    public String getDisplayname() {
        return Displayname;
    }

    public String getEmail() {
        return Email;
    }

    public long getCreatedAt() {
        return createdAt;
    }

}
