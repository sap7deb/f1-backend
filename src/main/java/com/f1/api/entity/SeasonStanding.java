package com.f1.api.entity;

import com.f1.api.entityData.SeasonStandingId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "season_driver_standing")
@IdClass(SeasonStandingId.class)
public class SeasonStanding {

    @Id
    @Column(name = "year")
    private Integer year;

    @Id
    @Column(name = "position_display_order")
    private Integer position;

    private Integer position_number;
    @Column(name = "driver_id")
    private String driverId;

    @Column(name = "points")
    private Integer points;

}
