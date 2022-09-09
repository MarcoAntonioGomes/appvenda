package br.edu.infnet.appvenda;


import br.edu.infnet.appvenda.model.domain.Usuario;
import br.edu.infnet.appvenda.service.UsuarioService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class UsuarioTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        Usuario usuario = new Usuario();
        usuario.setEmail("admin@admin.com");
        usuario.setNome("Administrador");
        usuario.setSenha("123");

        UsuarioService usuarioService = new UsuarioService();
        usuarioService.incluir(usuario);
    }
}
