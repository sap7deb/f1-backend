package com.f1.api.entity;

import com.f1.api.entityData.ConstructorStandingId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "season_constructor_standing")
@IdClass(ConstructorStandingId.class)
public class ConstructorStanding {

    @Id
    @Column(name = "year")
    private Integer year;

    @Id
    @Column(name = "position_display_order")
    private Integer position;

    private Integer position_number;
    @Column(name = "constructor_id")
    private String constructor_id;

    @Column(name = "engine_manufacturer_id")
    private String engine_manufacturer_id;

    @Column(name = "points")
    private Integer points;
}
