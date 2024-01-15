package com.api.projetojavaspring.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
@Table(name = "TB_USER")
@Getter
@Setter
public class UserModel extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(nullable = false, unique = false, length = 70)
    private String name;

    @Column(nullable = false, unique = false, length = 100)
    private String email;

    @Column(nullable = false, unique = false, length = 9)
    private String numberPhone;

    @Column(nullable = false,unique = false, length = 2)
    private String dddPhone;

    @Column(nullable = false, unique = false)
    private String password;

    public void setPassword(String senha) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        this.password = passwordEncoder.encode(senha);
    }

    public boolean checkPassword(String senha) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.matches(senha, this.password);
    }
}
