package dev.patrickoconnell.bird.birdspecies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class BirdSpeciesService {
    private final BirdSpeciesRepository birdSpeciesRepository;
    @Autowired
    public BirdSpeciesService(BirdSpeciesRepository birdSpeciesRepository) {
        this.birdSpeciesRepository = birdSpeciesRepository;
    }

    // Return species record by id if exists
    public BirdSpecies getBirdSpecies(Integer i){
        if (birdSpeciesRepository.existsById(i)){
            return birdSpeciesRepository.findById(i).get();
        }
        else {
            return null;
        }
    }

    // Return all species records
    public List<BirdSpecies> getBirdSpecies(){
        return birdSpeciesRepository.findAll();
    }

    // Return all BirdSpecies with a common name containing the passed String
    public List<BirdSpecies> getBirdSpecies(String name){
        String pass = "%" + name + "%"; // Add wildcards to return all matches containing the name string
        return birdSpeciesRepository.getBirdSpecies(pass);
    }


    // Return the count of all species in the list
    public Long getTotalSpeciesCount() {return birdSpeciesRepository.count();}

    // Call repository to get count of
    public Long getTotalCount(String type) {return birdSpeciesRepository.countofType(type);}

}
