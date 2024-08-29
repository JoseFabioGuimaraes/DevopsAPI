package br.com.jfabio.crudUsuario.usuario.repository;

import br.com.jfabio.crudUsuario.usuario.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
