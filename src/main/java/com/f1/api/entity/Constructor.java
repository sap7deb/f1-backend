package com.f1.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name = "constructors")
@Getter
@Setter
@NoArgsConstructor
public class Constructor {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "country_id")
    private String country;

    private String name;
    private String full_name;
}