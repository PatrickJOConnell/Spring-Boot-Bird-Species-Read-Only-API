package dev.patrickoconnell.bird.birdspecies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/birdlist")
public class BirdSpeciesController {

    private final BirdSpeciesService birdSpeciesService;
    @Autowired
    public BirdSpeciesController(BirdSpeciesService birdSpeciesService){
        this.birdSpeciesService = birdSpeciesService;
    }
    // Return the total count of bird species in the db
    @GetMapping(path = "count")
    public Long getCounts()  {
        return birdSpeciesService.getTotalSpeciesCount();
    }

    // Return the count of all species of specified type (e.g. "species", "hybrid", "issf", "spuh", "domestic", "slash", "intergrade")
    @GetMapping(path = "count/{type}")
    public Long getCountHybrids(@PathVariable("type") String type)  {
        return birdSpeciesService.getTotalCount(type);
    }

    // Return the Json of all species
    @GetMapping(path = "species")
    public List<BirdSpecies> getBirdSpecies()  {
        return birdSpeciesService.getBirdSpecies();
    }

    // Return the list of species with name containing the string specified in the path
    @GetMapping(path = "species/contains/{name}")
    public List<BirdSpecies> getBirdSpecies(@PathVariable("name") String name)  {
        return birdSpeciesService.getBirdSpecies(name);
    }

    // Return the Json of a single species, given the id number
    @GetMapping(path = "species/{id}" )
    public BirdSpecies getBirdSpeciesById(@PathVariable("id") Integer id){
        return birdSpeciesService.getBirdSpecies(id);
    }

}
