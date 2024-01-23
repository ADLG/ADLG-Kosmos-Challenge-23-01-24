package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Consultorio;

@Repository
public interface RepoConsultorio extends JpaRepository<Consultorio, Integer>
{

}
