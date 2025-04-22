package com.f1.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "circuit")
@Getter
@Setter
@NoArgsConstructor
public class Circuit {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "place_name")
    private String placeName;

    private String name;
    @Column(name = "country_id")
    private String location;
    private String country;
    private Double latitude;
    private Double longitude;
    private Double turns;
}
