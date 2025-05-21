package com.f1.api.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Table(name = "race")
@Getter
@Setter
@NoArgsConstructor
public class Race {
    @Id
    @Column(name = "id")
    private Integer raceId;

    private Integer year;
    private Integer round;
    @Column(name = "circuit_id")
    private String circuitId;
    @Column(name = "official_name")
    private String name;
    private String date;
    private String time;

    @ManyToOne
    @JoinColumn(name = "circuit_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Circuit circuit;
}