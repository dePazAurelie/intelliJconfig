package org.kreognenberg.model;

public class User {
    private String password;
    private String name;
    private String email;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
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
}

/*
public class User {
    private String inputName;
    private String inputEmail;
    private String inputPassword;
    private String gender;
    private String[] beer;
    private String buy;
    private String brew;
    private String look;

    public String getInputName() {
        return inputName;
    }

    public String getInputEmail() {
        return inputEmail;
    }

    public String getInputPassword() {
        return inputPassword;
    }

    public String getGender() {
        return gender;
    }

    public String[] getBeer() {
        return beer;
    }

    public String getBuy() {
        return buy;
    }

    public String getBrew() {
        return brew;
    }

    public String getLook() {
        return look;
    }
}
*/
