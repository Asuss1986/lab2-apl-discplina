package ufpb.disciplina.api.lap2.br.dtos;

import ufpb.disciplina.api.lap2.entidades.*;
import lombok.Data;

@Data
public class DisciplinaDTO {

	 private Long id;
	    private String nome;

	    public DisciplinaDTO(Disciplina disciplina) {
	        this.id = disciplina.getId();
	        this.nome = disciplina.getNome();
	    }
}
