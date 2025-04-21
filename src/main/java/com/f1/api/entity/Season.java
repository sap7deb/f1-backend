package com.f1.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "season")
@Getter
@Setter
@NoArgsConstructor
public class Season {
    @Id
    private Integer year;
}
