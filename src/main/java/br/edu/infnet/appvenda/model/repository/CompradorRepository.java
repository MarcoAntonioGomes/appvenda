package br.edu.infnet.appvenda.model.repository;

import br.edu.infnet.appvenda.model.domain.Comprador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompradorRepository  extends CrudRepository<Comprador, Integer> {

    @Query("from Comprador c where c.usuario.id = :userId")
    List<Comprador> obterLista(Integer userId);

}
