package br.com.jfabio.crudUsuario.usuario.resources;

import br.com.jfabio.crudUsuario.usuario.domain.Usuario;
import br.com.jfabio.crudUsuario.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> createUser(@RequestBody Usuario usuario){
        Usuario newUser =  usuarioService.createUser(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }

}
