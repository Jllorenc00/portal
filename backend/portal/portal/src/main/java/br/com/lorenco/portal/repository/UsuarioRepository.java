package br.com.lorenco.portal.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.lorenco.portal.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}
