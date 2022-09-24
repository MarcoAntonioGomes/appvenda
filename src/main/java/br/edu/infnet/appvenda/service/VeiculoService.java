package br.edu.infnet.appvenda.service;


import br.edu.infnet.appvenda.model.domain.Usuario;
import br.edu.infnet.appvenda.model.domain.Veiculo;
import br.edu.infnet.appvenda.model.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;


    public List<Veiculo> obterLista(){
        return (List<Veiculo>) veiculoRepository.findAll();
    }


    public List<Veiculo> obterLista(Usuario usuario){
        return (List<Veiculo>) veiculoRepository.findAll(usuario.getId());
    }

    public void excluir(Integer id){
        veiculoRepository.deleteById(id);
    }
}
