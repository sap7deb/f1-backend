package com.f1.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name = "driver")
@Getter
@Setter
@NoArgsConstructor
public class Driver {
    @Id
    @Column(name = "id")
    private String driverId;
    @Column(name = "permanent_number")
    private String code;
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String lastname;
    @Column(name = "date_of_birth")
    private String dob;
    @Column(name = "nationality_country_id")
    private String nationality;

//    @ManyToOne
//    @JoinColumn(name = "id", referencedColumnName = "driver_id", insertable = false, updatable = false)
//    private RaceDriverStanding raceDriverStanding;
}