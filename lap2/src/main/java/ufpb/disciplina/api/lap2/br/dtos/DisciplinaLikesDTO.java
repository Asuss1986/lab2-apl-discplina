package ufpb.disciplina.api.lap2.br.dtos;

import ufpb.disciplina.api.lap2.entidades.*;
import lombok.Data;

@Data
public class DisciplinaLikesDTO {

	private Long id;
    private String nome;
    private int curtidas;

    public DisciplinaLikesDTO(Disciplina disciplina) {
        this.id = disciplina.getId();
        this.nome = disciplina.getNome();
        this.curtidas = disciplina.getCurtidas();
    }
}
