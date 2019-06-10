package com.example.requiemz.apicalling;

import java.util.List;

public class ProfileRequestModel {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}

class ProfileResponseModel {
    private apiResponse apiResponse;
    private List<ProfileData> data;

    public com.example.requiemz.apicalling.apiResponse getApiResponse() {
        return apiResponse;
    }

    public List<ProfileData> getData() {
        return data;
    }
}

class ProfileData {
    private int id;
    private String name;
    private String lastname;
    private ProfileAddress address;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public ProfileAddress getAddress() {
        return address;
    }
}

class ProfileAddress {
    private List<ProfileAddressDetail> home;
    private List<ProfileAddressDetail> work;

    public List<ProfileAddressDetail> getHome() {
        return home;
    }

    public List<ProfileAddressDetail> getWork() {
        return work;
    }
}

class ProfileAddressDetail {
    private int id;
    private String address1;
    private String district;
    private String province;
    private String zipcode;

    public int getId() {
        return id;
    }

    public String getAddress1() {
        return address1;
    }

    public String getDistrict() {
        return district;
    }

    public String getProvince() {
        return province;
    }

    public String getZipcode() {
        return zipcode;
    }
}