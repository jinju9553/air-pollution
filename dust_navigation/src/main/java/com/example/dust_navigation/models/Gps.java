package com.example.dust_navigation.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
@Table(name="gps",schema = "raspberry")
public class Gps {
    @Id
    @Column(nullable = false,name="gps_id")
    private int gps_id;

    @Column(nullable = false)
    private int latitude;

    @Column(nullable = false)
    private int longitude;

    public Gps(int gps_id, int latitude, int longitude) {
        this.gps_id = gps_id;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
