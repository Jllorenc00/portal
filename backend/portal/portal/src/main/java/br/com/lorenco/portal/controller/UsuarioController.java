package br.com.lorenco.portal.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lorenco.portal.model.Usuario;

@RestController
@RequestMapping(value = "usuario")
public class UsuarioController extends GenericController<Usuario, Integer> {

}