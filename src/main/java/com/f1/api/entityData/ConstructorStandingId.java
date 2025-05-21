package com.f1.api.entityData;

import lombok.Data;

import java.util.Objects;

@Data
public class ConstructorStandingId {
    private Integer year;
    private Integer position;

    // equals and hashCode are needed
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConstructorStandingId constructorStandingId)) return false;
        return Objects.equals(year, constructorStandingId.year) &&
                Objects.equals(position, constructorStandingId.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, position);
    }
}
