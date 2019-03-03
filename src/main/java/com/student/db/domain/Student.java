package com.student.db.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Arun Kaushik
 * @implNote Entity Class
 */
@Entity
@Table(name = "student")
public class Student extends IdentityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String firstName;
    private String lastName;
    private String address;
    private String username;
    private String email;
    private long contactNumber;

    /**
     * Getter
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter
     *
     * @param firstName : firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter
     *
     * @param lastName : lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter
     *
     * @param address : address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter
     *
     * @param username : username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter
     *
     * @param email : email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter
     *
     * @return contactNumber
     */
    public long getContactNumber() {
        return contactNumber;
    }

    /**
     * Setter
     *
     * @param contactNumber : contactNumber
     */
    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }
}
