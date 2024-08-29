package br.com.jfabio.crudUsuario.usuario.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USUARIOS")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private Long idUsuario;
    @Column(name = "NOME_USUARIO")
    private String nomeUsuario;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "TELEFONE")
    private String Telefone;
    @Column(name = "CPF")
    private String  cpf;
//    @Column(name = "PERMISSAO")
//    private Premissao permissao;

   public Usuario(){
  }

}
