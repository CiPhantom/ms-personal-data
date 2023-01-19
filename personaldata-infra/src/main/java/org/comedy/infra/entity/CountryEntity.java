package org.comedy.infra.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "country")
public class CountryEntity {

    @Id
    private int id;

    @Column(nullable = false, unique = true)
    private int code;

    @Column(nullable = false, unique = true)
    private String alpha2;

    @Column(nullable = false, unique = true)
    private String alpha3;

    @Column(nullable = false)
    private String englishName;

    @Column(nullable = false)
    private String frenchName;
}
