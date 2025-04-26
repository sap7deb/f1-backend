package com.f1.api.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "race_data")
@IdClass(ResultId.class)
public class Result {

    @Id
    @Column(name = "race_id")
    private Integer raceId;

    @Id
    private String type;

    @Column(name = "driver_id")
    private String driverId;

    @Column(name = "constructor_id")
    private Integer constructorId;

    @ManyToOne
    @JoinColumn(name = "driver_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Driver driver;

    @ManyToOne
    @JoinColumn(name = "constructor_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Constructor constructor;

    @ManyToOne
    @JoinColumn(name = "race_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Race race;

    @Id
    @Column(name = "position_display_order")
    private Integer position;
    @Column(name = "race_points")
    private Integer points;
    @Column(name = "race_laps")
    private Integer laps;
    @Column(name = "race_time")
    private String time;
    @Column(name = "fastest_lap_lap")
    private Integer fastestLap;
    @Column(name = "fastest_lap_time")
    private String fastestLapTime;
}