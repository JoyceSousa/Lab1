package br.com.lab1.controladores;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import servicos.DisciplinaServicos;
import dtos.DisciplinaDtos;
import dtos.AtualizacaoDisciplina;
import entidades.Disciplina;

@RestController
public class DisciplinaController {

	@Autowired
	private DisciplinaServicos disciplinaServicos;
	
	@PostMapping("/v1/api/disciplina")
	public ResponseEntity<Disciplina> addDisciplina(@RequestBody DisciplinaDtos disciplina){
		return new ResponseEntity<Disciplina>(disciplinaServicos.addListaDisciplina(disciplina), HttpStatus.CREATED); 
	}
	
	@GetMapping("/v1/api/disciplina")
	public ResponseEntity<Collection<Disciplina>> recuperaTodasAsDisciplinas(@RequestParam(value="busca", required=false) String padrao){
		return new ResponseEntity<Collection<Disciplina>>(disciplinaServicos.recuperaDisciplinas(Optional.ofNullable(padrao)), HttpStatus.OK);
	}

	@GetMapping("/v1/api/disciplina/{id}")
	public ResponseEntity<Disciplina> recuperaDisciplina(@PathVariable long id){
		return new ResponseEntity<Disciplina>(disciplinaServicos.recuperaDisciplina(id), HttpStatus.OK);
	}
	
	@PatchMapping("/v1/api/disciplina/{id}/nome")
	public ResponseEntity<Disciplina> atualizaDisciplina(@PathVariable long id, @RequestBody AtualizacaoDisciplina Atualizacao){
		return new ResponseEntity<Disciplina>(disciplinaServicos.atualizaDisciplina(id, Atualizacao), HttpStatus.OK);
	}
}
