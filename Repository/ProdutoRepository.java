package org.lojagame.game_eumsegredo.Repository;

import java.util.List;

import org.lojagame.game_eumsegredo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List <Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}
