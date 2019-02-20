package de.bora.flaschenserver;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class FlascheEntity {
    @Id
    @GeneratedValue
    Long id;

    String name;
    double pfand;

    public FlascheEntity() {

    }

    public FlascheEntity(String name, double pfand) {
        this.name = name;
        this.pfand = pfand;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPfand() {
        return pfand;
    }

    @Override
    public String toString() {
        return "FlascheEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pfand=" + pfand +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlascheEntity)) return false;
        FlascheEntity that = (FlascheEntity) o;
        return Double.compare(that.getPfand(), getPfand()) == 0 &&
                Objects.equals(getId(), that.getId()) &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPfand());
    }
}
