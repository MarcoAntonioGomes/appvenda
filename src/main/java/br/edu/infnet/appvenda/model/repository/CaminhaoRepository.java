package br.edu.infnet.appvenda.model.repository;




import br.edu.infnet.appvenda.model.domain.Caminhao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface CaminhaoRepository extends CrudRepository<Caminhao, Integer> {

    @Query("from Caminhao c where c.usuario.id = :idUsuario")
    Collection<Caminhao> findAll(Integer idUsuario);

}
