package servicos;

import java.util.Collection;
import java.util.Optional;
import org.springframework.stereotype.Service;

import dtos.DisciplinaDtos;
import entidades.Disciplina;
import excecoes.*;
import dtos.AtualizacaoDisciplina;
import repositorio.*;

@Service
public class DisciplinaServicos {
	private static DisciplinaDAO disciplinas;

	DadosDiciplina dadosdisc = new DadosDiciplina();
	

	public DisciplinaServicos () {
		super();
	}
	
	
	public Disciplina addListaDisciplina(DisciplinaDtos disciplina) {
		return dadosdisc.adicionaDisciplinas(Disciplina.criaDisciplina(disciplina));
	}
	
	public Collection<Disciplina> recuperaDisciplinas(Optional<String> padraoDeBusca){
		return dadosdisc.getDisciplinas(padraoDeBusca);
	}
	
	public Disciplina recuperaDisciplina(long id) {
		return dadosdisc.getDisciplina(id);
	}
	
	public Disciplina atualizaDisciplina(long id, AtualizacaoDisciplina Atualizacao){
		if(dadosdisc.recuperaPorId(id).isEmpty())
			throw new DisciplinaNaoEncontradaException("Disciplina não encontrada. ","Não há disciplinas com este ID ");
		
		return dadosdisc.atualizaDaDisciplina(id, Atualizacao);
	}
}
