package com.ntd.datasmap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ntd.datasmap.models.Site;


public interface SiteRepository extends JpaRepository<Site,Integer > {

	
}
