package br.com.diegobufalo.forum.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.diegobufalo.forum.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	 Optional<Usuario> findByEmail(String email);

}
