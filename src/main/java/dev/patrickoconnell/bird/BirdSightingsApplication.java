/**--------------------------------------------------------------------------------------------------
Author: Patrick O'Connell
 Date: 02/06/2022
 Purpose: A simple java API code sample built with Spring Boot
 Files:
     package dev.patrickoconnell.bird.birdspecies
 		BirdSightingsApplication: Application Entry and initialization point
 		    package dev.patrickoconnell.bird.birdspecies
 				BirdSpecies Class: Uses existing table entity and maps to column names.  Also provide getters and setters which are unused.
 				BirdSpeciesController Class: Defines the REST API endpoints and calls the related service methods
 				BirdSpeciesService Class: Defines the Service methods and utilizes the BirdSpeciesRepository Interface
 				BirdSpeciesRepository Interface: Extends the JpaRepository interface which is used to reduce boilerplate code in the Data Access Layer
 --------------------------------------------------------------------------------------------------**/
package dev.patrickoconnell.bird;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BirdSightingsApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(BirdSightingsApplication.class, args);
	}
}
