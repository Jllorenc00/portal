package br.com.lorenco.portal.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.lorenco.portal.model.Categoria;

import java.util.List;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
    List<Categoria> findByDestaque(boolean destaque);
}
