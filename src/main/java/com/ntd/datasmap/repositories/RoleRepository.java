package com.ntd.datasmap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ntd.datasmap.models.Type;

public interface RoleRepository extends JpaRepository<Type,Integer > {

	
}
