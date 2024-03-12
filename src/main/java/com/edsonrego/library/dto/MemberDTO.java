package com.edsonrego.library.dto;

import com.edsonrego.library.entities.Member;

import java.io.Serializable;

public class MemberDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    private Long id;
    private String name;
    private String email;
    private String password;

    public MemberDTO() {
    }

    public MemberDTO(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public MemberDTO(Member entity) {
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        password = entity.getPassword();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
