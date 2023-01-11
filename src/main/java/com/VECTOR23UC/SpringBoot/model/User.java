package com.VECTOR23UC.SpringBoot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NotEmpty(message = "Необходимо ввести мия!")
    @Size(min = 2, max = 20, message = "Уложись от 2 до 20 символов! ")
    private String name;

    @Column(name = "surname")
    @NotEmpty(message = "Необходимо ввести фамилию!))")
    @Size(min = 3, max = 30, message = "Уложись от 3 до 30 символов! ")
    private String surname;

    @Column(name = "age")
    @Min(value = 18, message = "До 18 нельзя!")
    private Integer age;

    @Column(name = "email")
    @NotEmpty(message = "Не забудь оставить мыло, для связи!")
    @Email(message = "Напиши валидный адресс!")
    private String email;

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return id == user.id && age == user.age && Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, age, email);
    }
}
