package com.ntd.datasmap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ntd.datasmap.models.Event;

public interface EventRepository extends JpaRepository<Event,Integer > {

	
}
