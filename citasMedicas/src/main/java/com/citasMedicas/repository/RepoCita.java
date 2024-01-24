package com.citasMedicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.citasMedicas.entity.Cita;

import jakarta.transaction.Transactional;

@Repository
public interface RepoCita extends JpaRepository<Cita, Integer> 
{
	@Transactional
	@Query(value ="SELECT MAX(id_cita) FROM citas", nativeQuery = true)
    int ultimaCita();

	@Modifying
	@Transactional
	@Query(value ="INSERT INTO citas (id_cita, consultorio, doctor, horario_consulta, nombre_paciente, fecha_consulta) VALUES (:id_cita, :consultorio, :doctor, :horario_consulta, :nombre_paciente, :fecha_consulta)", nativeQuery = true)
    Integer insertCita(@Param("id_cita") int id_cita,@Param("consultorio") String consultorio, @Param("doctor") String doctor, 
    	@Param("horario_consulta") String horario_consulta, @Param("nombre_paciente") String nombre_paciente, @Param("fecha_consulta") String fecha_consulta);

}
