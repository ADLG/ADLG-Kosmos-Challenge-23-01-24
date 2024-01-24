package com.citasMedicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citasMedicas.entity.Consultorio;

@Repository
public interface RepoConsultorio extends JpaRepository<Consultorio, Integer>
{

}
