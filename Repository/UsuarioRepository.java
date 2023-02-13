package org.lojagame.game_eumsegredo.Repository;



import java.util.Optional;

import org.lojagame.game_eumsegredo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByUsuario(String usuario);
	
} 
