package com.f1.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "race_data")
@Table(name = "race_data")
public class Result {
    @Id
    @Column(name = "resultId")
    private Integer id;

    @Column(name = "race_id")
    private Integer raceId;

    @Column(name = "driver_id")
    private Integer driverId;

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

    @Column(name = "position_display_order")
    private Integer position;
    @Column(name = "race_points")
    private Float points;
    @Column(name = "race_laps")
    private Integer laps;
    @Column(name = "race_time")
    private String time;
    @Column(name = "fastest_lap_lap")
    private Integer fastestLap;
    private Integer rank;
    @Column(name = "fastest_lap_time")
    private String fastestLapTime;


    @Column(name = "statusId")
    private Integer statusId;

    @ManyToOne
    @JoinColumn(name = "statusId", referencedColumnName = "statusId", insertable = false, updatable = false)
    private Status status;
}