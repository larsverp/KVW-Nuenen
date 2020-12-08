package com.example.KVWNuenen.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class Volunteers {

    @Id
    private String id;
    private String first_name;
    private String insertion;
    private String last_name;
    private Character gender;
    private Date birth_date;
    private String address;
    private String postal_code;
    private String house_number;
    private String city;
    private String number_1;
    private String number_2;
    private String occupation;
    private String preferred_age;
    private String study;
    private String size;
    private String allergy;
    private String notes;

    public Volunteers(String first_name, String insertion, String last_name, Character gender, Date birth_date, String address, String postal_code, String house_number, String city, String number_1, String number_2, String occupation, String preferred_age, String study, String size, String allergy, String notes) {
        this.id = UUID.randomUUID().toString();
        this.first_name = first_name;
        this.insertion = insertion;
        this.last_name = last_name;
        this.gender = gender;
        this.birth_date = birth_date;
        this.address = address;
        this.postal_code = postal_code;
        this.house_number = house_number;
        this.city = city;
        this.number_1 = number_1;
        this.number_2 = number_2;
        this.occupation = occupation;
        this.preferred_age = preferred_age;
        this.study = study;
        this.size = size;
        this.allergy = allergy;
        this.notes = notes;
    }

    public Volunteers(){
        this.id = UUID.randomUUID().toString();
    }


    public String getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getInsertion() {
        return insertion;
    }

    public void setInsertion(String insertion) {
        this.insertion = insertion;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getHouse_number() {
        return house_number;
    }

    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumber_1() {
        return number_1;
    }

    public void setNumber_1(String number_1) {
        this.number_1 = number_1;
    }

    public String getNumber_2() {
        return number_2;
    }

    public void setNumber_2(String number_2) {
        this.number_2 = number_2;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPreferred_age() {
        return preferred_age;
    }

    public void setPreferred_age(String preferred_age) {
        this.preferred_age = preferred_age;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
