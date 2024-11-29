package com.mycompany.address.model;

import java.util.Objects;
import java.util.UUID;

public class Address {
    private UUID id;
    private String country;
    private String city;
    private String address;

    public Address() {
    }

    public Address(UUID id, String country, String city, String address) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Address address1 = (Address) o;
        return Objects.equals(id, address1.id) && Objects.equals(country, address1.country) && Objects.equals(city, address1.city) && Objects.equals(address, address1.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCountry(), getCity(), getAddress());
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
