package br.edu.infnet.appvenda.model.repository;


import br.edu.infnet.appvenda.model.domain.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}
