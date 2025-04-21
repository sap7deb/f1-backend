package com.f1.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "circuits")
@Getter
@Setter
@NoArgsConstructor
public class Circuit {
    @Id
    private Integer circuitId;
    private String circuitRef;
    private String name;
    private String location;
    private String country;
    private Double lat;
    private Double lng;
    private Integer alt;
    private String url;
}
