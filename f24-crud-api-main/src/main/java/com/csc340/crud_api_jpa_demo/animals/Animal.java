package com.csc340.crud_api_jpa_demo.animals;

import jakarta.persistence.*;

@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @Column(nullable = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer animal_id;

    @Column(nullable = false)
    private String name;

    private String species;

    private String habitat;

    @Column(nullable = true)
    private String scientific_name;

    private String description;

    public Animal(Integer animalId, String name, String scientificName, String species, String habitat, String description) {
        this.animal_id = animalId;
        this.name = name;
        this.scientific_name = scientificName;
        this.species = species;
        this.habitat = habitat;
        this.description = description;
    }

    public Animal(String name, String scientificName, String species, String habitat, String description) {
        this.name = name;
        this.scientific_name = scientificName;
        this.species = species;
        this.habitat = habitat;
        this.description = description;
    }

    public Animal() {
    }

    public Integer getAnimalId() {
        return animal_id;
    }

    public void setAnimalId(Integer animalId) {
        this.animal_id = animalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientificName() {
        return scientific_name;
    }

    public void setScientificName(String scientificName) {
        this.scientific_name = scientificName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHabitat() {return habitat; }

    public void setHabitat(String habitat) {this.habitat = habitat; }

    public String getDescription() {return description; }

    public void setDescription(String description) {this.description = description; }
}