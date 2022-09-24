package br.edu.infnet.appvenda.model.repository;


import br.edu.infnet.appvenda.model.domain.Automovel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface AutomovelRepository extends CrudRepository<Automovel, Integer> {

    @Query("from Automovel a where a.usuario.id = :idUsuario")
    Collection<Automovel> findAll(Integer idUsuario);

}
