package br.edu.infnet.appvenda.model.repository;



import br.edu.infnet.appvenda.model.domain.Veiculo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface VeiculoRepository extends CrudRepository<Veiculo, Integer> {

    @Query("from Veiculo v where v.usuario.id = :idUsuario")
    Collection<Veiculo> findAll(Integer idUsuario);

}
