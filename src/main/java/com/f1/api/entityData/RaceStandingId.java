package com.f1.api.entityData;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class RaceStandingId implements Serializable {

    private Integer raceId;
    private Integer position;

    // equals and hashCode are needed
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RaceStandingId raceStandingId)) return false;
        return Objects.equals(raceId, raceStandingId.raceId) &&
                Objects.equals(position, raceStandingId.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raceId, position);
    }
}

