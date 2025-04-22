package com.f1.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "status")
public class Status {
    @Id
    @Column(name = "statusId")
    private Integer id;

    private String status;
}

