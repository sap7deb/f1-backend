package com.f1.api.entity;

import com.f1.api.entityData.RaceStandingId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "race_driver_standing")
@IdClass(RaceStandingId.class)
public class RaceDriverStanding {
    @Id
    @Column(name = "race_id")
    private Integer raceId;

    @Id
    @Column(name = "position_display_order")
    private Integer position;

    private Integer position_number;
    @Column(name = "driver_id")
    private String driverId;

    @Column(name = "points")
    private Integer points;

    @Column(name = "positions_gained")
    private Integer positions_gained;

    @ManyToOne
    @JoinColumn(name = "driver_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Driver driver;

}
