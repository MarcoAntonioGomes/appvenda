package br.edu.infnet.appvenda.model.repository;



import br.edu.infnet.appvenda.model.domain.Automovel;
import br.edu.infnet.appvenda.model.domain.Motocicleta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface MotocicletaRepository extends CrudRepository<Motocicleta, Integer> {


    @Query("from Motocicleta m where m.usuario.id = :idUsuario")
    Collection<Motocicleta> findAll(Integer idUsuario);


}
