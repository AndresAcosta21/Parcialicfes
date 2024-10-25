package com.pruebas.demoandres.app.repository;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.pruebas.demoandres.app.entity.Estudiante;

public interface EstudianteRepository extends MongoRepository<Estudiante, String> {
	@Query("SELECT e FROM Estudiante e ORDER BY e.puntaje DESC") 
    List<Estudiante> findTop3ByOrderByPuntajeDesc();

}
