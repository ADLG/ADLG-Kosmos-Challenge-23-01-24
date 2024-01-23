package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Doctor;

@Repository
public interface RepoDoctor extends JpaRepository<Doctor, Integer>
{

}
