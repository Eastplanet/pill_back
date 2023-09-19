package com.pillProject.demo.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter @Setter
@Table(name = "users")
public class User {

    @Id
    private String id;

    @NotEmpty
    private String pw;

}
