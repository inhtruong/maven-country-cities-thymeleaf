package com.cg.model;

import jdk.jfr.Unsigned;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name="cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "The name is required.")
    @Column(unique = true, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private Country country;

    @Unsigned
    private Long area;

    @Unsigned
    private Long population;

    @Unsigned
    private Long gdp;

    private String intro;
}
