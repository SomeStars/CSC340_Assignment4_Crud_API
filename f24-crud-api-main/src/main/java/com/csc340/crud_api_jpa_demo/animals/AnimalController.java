package com.csc340.crud_api_jpa_demo.animals;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * AnimalController.java.
 * Includes all REST API endpoInteger mappings for the Animal object.
 */
@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService service;

    /**
     * Get a list of all Animals in the database.
     * http://localhost:8080/animals/all
     *
     * @return a list of Animals  objects.
     */
    @GetMapping("/all")
    public List<Animal> getAllAnimals() {
        return service.getAllAnimals();
    }

    /**
     * Get a list of Animals with the same string in their name
     * http://localhost:8080/animals?string={name}
     *
     * @param string the search key.
     * @return A list of Student objects matching the search key.
     */

    @GetMapping("")
    public List<Animal> getAnimalsByString(@RequestParam(name = "string") String string) {
        return service.getAnimalsByString(string);
    }


    @GetMapping("")
    public List<Animal> getAnimalsBySpecies(@RequestParam(name = "species") String species) {
        return service.getAnimalsBySpecies(species);
    }

    /**
     * Get a specific Animal by Id.
     * http://localhost:8080/animals/2
     *
     * @param animalId the unique Id for a Animal.
     * @return One Animal object.
     */
    @GetMapping("/{animalId}") // Change the path here to avoid ambiguity
    public Animal getOneAnimal(@PathVariable Integer animalId) {
        return service.getAnimalById(animalId);
    }


    /**
     * Create a new Animal entry.
     * http://localhost:8080/animals/new
     *
     * @param animal the new Animal object.
     * @return the updated list of Animals.
     */

    @PostMapping("/new")
    public List<Animal> addNewAnimal(@RequestBody Animal animal) {
        service.addNewAnimal(animal);
        return service.getAllAnimals();
    }

    /**
     * Update an existing Animal object.
     * http://localhost:8080/animals/update/2
     *
     * @param animalId the unique Animal Id.
     * @param animal   the new update Animal details.
     * @return the updated Animal object.
     */
    @PutMapping("/update/{animalId}")
    public Animal updateAnimal(@PathVariable Integer animalId, @RequestBody Animal animal) {
        service.updateAnimal(animalId, animal);
        return service.getAnimalById(animalId);
    }

    /**
     * Delete a Animal object.
     * http://localhost:8080/animals/delete/2
     *
     * @param animalId the unique Animal Id.
     * @return the updated list of Animals.
     */
    @DeleteMapping("/delete/{animalId}")
    public List<Animal> deleteAnimalById(@PathVariable Integer animalId) {
        service.deleteAnimalById(animalId);
        return service.getAllAnimals();
    }


}