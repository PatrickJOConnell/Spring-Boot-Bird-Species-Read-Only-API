package dev.patrickoconnell.bird.birdspecies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BirdSpeciesRepository extends JpaRepository<BirdSpecies,Integer> {
    // Get the total count of species with type in passed string e.g. "hybrid"
    @Query(value = "SELECT COUNT(*) FROM species where category = ?1",nativeQuery=true)
    Long countofType(String type);

    // Get all species with a common name containing the passed string
    @Query(value = "SELECT * FROM species where common_name like ?1",nativeQuery=true)
    List<BirdSpecies> getBirdSpecies(String type);

}

