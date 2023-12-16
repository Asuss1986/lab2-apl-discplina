package ufpb.disciplina.api.lap2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ufpb.disciplina.api.lap2.br.dtos.*;
import ufpb.disciplina.api.lap2.entidades.*;
import ufpb.disciplina.api.lap2.service.*;

@RestController
@RequestMapping("/v1/api/disciplinas")
public class DisciplinaController {

    private DisciplinaService disciplinaService;

    @Autowired
    private DisciplinaController(DisciplinaService disciplinaService) {
        this.disciplinaService = disciplinaService;
    }

    @GetMapping
    public ResponseEntity<List<DisciplinaDTO>> getDisciplinas() {
        return new ResponseEntity<>(disciplinaService.getDisciplinas(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Disciplina> getDisciplinaById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(disciplinaService.getDisciplinaById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping("/likes/{id}")
    public ResponseEntity<DisciplinaLikesDTO> adicionarCurtida(@PathVariable Long id) throws Exception {
        try {
            return new ResponseEntity<>(disciplinaService.adicionarCurtida(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping("/nota/{id}")
    public ResponseEntity<DisciplinaNotasDTO> adicionarNota(@PathVariable Long id, @RequestBody NotaDTO notaDTO) throws Exception {
        try {
            return new ResponseEntity<>(disciplinaService.adicionarNota(id, notaDTO), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping("/comentarios/{id}")
    public ResponseEntity<DisciplinaComentarioDTO> adicionarComentario(@PathVariable Long id, @RequestBody ComentarioDTO comentarioDTO) throws Exception {
        try {

            return new ResponseEntity<>(disciplinaService.adicionarComentario(id, comentarioDTO), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/ranking/likes")
    public ResponseEntity<List<Disciplina>> ranquearLikeDisciplinas() {
        return new ResponseEntity<>(disciplinaService.ranquearLikesDisciplina(), HttpStatus.OK);
    }

    @GetMapping("/ranking/notas")
    public ResponseEntity<List<Disciplina>> ranquearNotaDisciplinas() {
        return new ResponseEntity<>(disciplinaService.ranquearNotasDisciplina(), HttpStatus.OK);
    }
}
