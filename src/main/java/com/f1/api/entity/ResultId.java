package com.f1.api.entity;

import lombok.Data;
import java.io.Serializable;
import java.util.Objects;

@Data
public class ResultId implements Serializable {
    private Integer raceId;
    private String type;
    private Integer position;

    // equals and hashCode are needed
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResultId)) return false;
        ResultId resultId = (ResultId) o;
        return Objects.equals(raceId, resultId.raceId) &&
                Objects.equals(type, resultId.type) &&
                Objects.equals(position, resultId.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raceId, type, position);
    }
}