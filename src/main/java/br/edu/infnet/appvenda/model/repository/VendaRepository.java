package br.edu.infnet.appvenda.model.repository;


import br.edu.infnet.appvenda.model.domain.Venda;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface VendaRepository extends CrudRepository<Venda, Integer> {

    @Query("from Venda v where v.usuario.id = :idUsuario")
    Collection<Venda> findAll(Integer idUsuario);

}
