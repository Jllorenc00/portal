package br.com.lorenco.portal.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.lorenco.portal.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {

}