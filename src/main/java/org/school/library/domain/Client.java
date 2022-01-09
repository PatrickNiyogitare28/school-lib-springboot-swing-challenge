package org.school.library.domain;

import org.school.library.enums.EClientCategory;
import org.school.library.enums.EGender;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Client {
    @Id
    @GeneratedValue
    @Column(name = "regId")
    private UUID id;

    private String firstName;

    private String lastName;

    private String phone;

    private String email;

    private EClientCategory category;

    private Byte photo;

    public Client() {
    }

    public Client(UUID id, String firstName, String lastName, String phone, String email, EClientCategory category, Byte photo) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.category = category;
        this.photo = photo;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EClientCategory getCategory() {
        return category;
    }

    public void setCategory(EClientCategory category) {
        this.category = category;
    }

    public Byte getPhoto() {
        return photo;
    }

    public void setPhoto(Byte photo) {
        this.photo = photo;
    }
}
