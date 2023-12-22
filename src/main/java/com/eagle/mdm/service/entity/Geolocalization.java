package com.eagle.mdm.service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Data
@Entity
@Table(name = "TB_PERMISSIONS")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Geolocalization {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;
    @Column(name = "imei", updatable = true, unique = false, nullable = false)
    private String imei;
    @Column(name = "iccid", updatable = true, unique = false, nullable = false)
    private String iccid;
    @Column(name = "number", updatable = true, unique = false, nullable = false)
    private String number;
    @Column(name = "localAreaCode", updatable = true, unique = false, nullable = false)
    private String localAreaCode;
    @Column(name = "internationalCode", updatable = true, unique = false, nullable = false)
    private String internationalCode;
    private long longitude;

    private long latitude;
}
