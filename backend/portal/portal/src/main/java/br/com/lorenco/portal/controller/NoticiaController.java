package br.com.lorenco.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.lorenco.portal.model.Categoria;
import br.com.lorenco.portal.model.Noticia;
import br.com.lorenco.portal.repository.CategoriaRepository;
import br.com.lorenco.portal.repository.NoticiaRepository;


@RestController
@RequestMapping(value = "noticia")
public class NoticiaController extends GenericController<Noticia, Integer> {

    @Autowired
    NoticiaRepository noticiaRepository;

    @Autowired
    CategoriaRepository categoriaRepository;

    @RequestMapping(value = "listarNoticiasPorCategoria/{id_categoria}", method = RequestMethod.GET)
    public ResponseEntity<List<Noticia>> listarNoticiasPorCategoria(@PathVariable(value = "id_categoria") Integer id_categoria) {
        Categoria categoria = categoriaRepository.findById(id_categoria).get();
        return ResponseEntity.ok((List<Noticia>) noticiaRepository.findAllNoticiasByCategoria(categoria));
    }

    @RequestMapping(value = "findTopByCategoriaIdOrderByDataPublicacaoDesc/{id_categoria}", method = RequestMethod.GET)
    public ResponseEntity<Noticia> findOneByUltimaNoticiaByCategoria(@PathVariable(value = "id_categoria") Integer id_categoria) {
        Categoria categoria = categoriaRepository.findById(id_categoria).get();
        return ResponseEntity.ok((Noticia) noticiaRepository.findTopByCategoriaIdOrderByDataPublicacaoDesc(id_categoria));
    }

    @RequestMapping(value = "findTopByOrderByDataPublicacaoDesc", method = RequestMethod.GET)
    public ResponseEntity<Noticia> findOneByUltimaNoticiaByTodas() {
        return ResponseEntity.ok((Noticia) noticiaRepository.findTopByOrderByDataPublicacaoDesc());
    }

}