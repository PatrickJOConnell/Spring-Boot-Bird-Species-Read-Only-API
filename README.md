# Back-End-Java-Sample-Bird-Repo-
A read only java API built with Spring Boot

DB contains records or 16,000+ bird species. Relevant enpoints are defined in the BirdSpeciesController Class.

Spring Security Password (Basic HTTP Auth)
Username: apiuser
Password: UnsecurePassword

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
