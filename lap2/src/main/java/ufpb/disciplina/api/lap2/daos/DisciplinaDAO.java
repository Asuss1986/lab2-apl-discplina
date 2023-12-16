package ufpb.disciplina.api.lap2.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ufpb.disciplina.api.lap2.entidades.*;
@Repository
public interface DisciplinaDAO extends JpaRepository<Disciplina, Long>{
	
    List<Disciplina> findByOrderByNota();
    List<Disciplina> findByOrderByCurtidas();
}
