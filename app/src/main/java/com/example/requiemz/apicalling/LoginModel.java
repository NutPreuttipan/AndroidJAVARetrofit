package com.example.requiemz.apicalling;

import java.util.List;

//Request
public class LoginModel {

    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

//Response
class apiResponseModel {
    private apiResponse apiResponse;
    private List<LoginData> data;

    public com.example.requiemz.apicalling.apiResponse getApiResponse() {
        return apiResponse;
    }

    public List<com.example.requiemz.apicalling.LoginData> getData() {
        return data;
    }
}

class LoginData {
    private String name;
    private String lastName;
    private String age;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }
}
