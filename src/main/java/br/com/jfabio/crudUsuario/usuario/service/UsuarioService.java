package br.com.jfabio.crudUsuario.usuario.service;

import br.com.jfabio.crudUsuario.usuario.domain.Usuario;
import br.com.jfabio.crudUsuario.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario createUser(Usuario usuario){
        return usuarioRepository.save(usuario);
    }



}
