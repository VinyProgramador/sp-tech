package com.github.vinyprogramador.loginlogoff01221125viniciusnunes.Model;
//Nome: Vinicius A Nunes
//RA:01221125
public class UserAuthenticated {

    private String name;
    private String email;
    private Boolean isAuthenticated;

    public boolean getAuthenticated() {

        return isAuthenticated;
    }

    public void setAuthenticated(Boolean authenticated) {

        isAuthenticated = authenticated;
    }

    public UserAuthenticated(String name, String email, Boolean isAuthenticated) {
        this.name = name;
        this.email = email;
        this.isAuthenticated = isAuthenticated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
