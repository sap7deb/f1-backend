package com.f1.api.entityData;

import lombok.Data;

import java.util.Objects;

@Data
public class SeasonStandingId {
    private Integer year;
    private Integer position;

    // equals and hashCode are needed
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SeasonStandingId seasonStandingId)) return false;
        return Objects.equals(year, seasonStandingId.year) &&
                Objects.equals(position, seasonStandingId.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, position);
    }
}
