package com.apap.tutorial4.com.apap.tutorial4.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "pilot")
public class PilotModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Size(max = 50)
    @Column(name = "license_number", nullable = false, unique = true)
    private  String licenseNumber;

    @NotNull
    @Size(max = 50)
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "fly_hour", nullable = false)
    private String flyHour;

    @OneToMany(mappedBy = "pilot", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<FlightModel> pilotFilght;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlyHour() {
        return flyHour;
    }

    public void setFlyHour(String flyHour) {
        this.flyHour = flyHour;
    }

    public List<FlightModel> getPilotFilght() {
        return pilotFilght;
    }

    public void setPilotFilght(List<FlightModel> pilotFilght) {
        this.pilotFilght = pilotFilght;
    }
}
