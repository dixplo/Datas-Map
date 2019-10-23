package com.ntd.datasmap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ntd.datasmap.models.Place;



public interface PlaceRepository extends JpaRepository<Place,Integer > {

	
}
