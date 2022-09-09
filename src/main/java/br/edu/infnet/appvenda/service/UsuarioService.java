package br.edu.infnet.appvenda.service;


import br.edu.infnet.appvenda.model.domain.Usuario;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UsuarioService {


    private static Map<String, Usuario> mapaUsuario = new HashMap<>();


    public  Usuario validar(String email, String senha){

        Usuario usuario = mapaUsuario.get(email);
        if(usuario != null && usuario.getSenha().equals(senha)){
            return usuario;
        }

        return null;

    }


    public void incluir(Usuario usuario){
        mapaUsuario.put(usuario.getEmail(), usuario);
        new AppImpressao().relatorio(usuario,"Inclusão do usuario " +usuario.getNome() + " realizada com sucesso!!!");
    }


    public  void excluir(String email){
        mapaUsuario.remove(email);
    }

    public  Collection<Usuario> obterLista(){
        return mapaUsuario.values();
    }

}
