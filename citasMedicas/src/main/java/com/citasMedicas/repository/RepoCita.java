package com.citasMedicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citasMedicas.entity.Cita;

@Repository
public interface RepoCita extends JpaRepository<Cita, Integer> 
{

}
