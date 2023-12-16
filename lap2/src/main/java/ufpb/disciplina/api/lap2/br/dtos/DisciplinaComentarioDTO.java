package ufpb.disciplina.api.lap2.br.dtos;
import java.util.List;

import ufpb.disciplina.api.lap2.entidades.*;
import lombok.Data;

@Data
public class DisciplinaComentarioDTO {
	private Long id;
    private String nome;
    private List<Comentario> comentarios;

    public DisciplinaComentarioDTO(Disciplina disciplina) {
        this.id = disciplina.getId();
        this.nome = disciplina.getNome();
        this.comentarios = disciplina.getComentarios();
    }

}
