package ufpb.disciplina.api.lap2.br.dtos;

import ufpb.disciplina.api.lap2.entidades.*;
import lombok.Data;

@Data
public class DisciplinaNotasDTO {
	 private Long id;
	    private String nome;
	    private double nota;

	    public DisciplinaNotasDTO(Disciplina disciplina) {
	        this.id = disciplina.getId();
	        this.nome = disciplina.getNome();
	        this.nota = disciplina.getNota();
	    }
}
