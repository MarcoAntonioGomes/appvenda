package br.edu.infnet.appvenda;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.edu.infnet.appvenda.exceptions.CpfInvalidoException;
import br.edu.infnet.appvenda.model.domain.Automovel;
import br.edu.infnet.appvenda.model.domain.Caminhao;
import br.edu.infnet.appvenda.model.domain.Comprador;
import br.edu.infnet.appvenda.model.domain.Usuario;
import br.edu.infnet.appvenda.model.repository.AutomovelRepository;
import br.edu.infnet.appvenda.model.repository.CaminhaoRepository;
import br.edu.infnet.appvenda.model.repository.CompradorRepository;

@SpringBootApplication
public class AppvendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppvendaApplication.class, args);
	}

	@Bean(name = "caminhao")
	public CommandLineRunner run(CaminhaoRepository caminhaoRepository) {
		return (args) -> {
			Usuario usuario = new Usuario();
			usuario.setId(1);
			
			Caminhao caminhao = salvarCaminhao(caminhaoRepository, usuario);

			List<Caminhao> listaCaminhoes = (List<Caminhao>) caminhaoRepository.findAll(usuario.getId());

			int pos = 1;
			for (Caminhao caminhao1 : listaCaminhoes) {
				caminhao1.setNome(caminhao1.getNome() + pos++);
				caminhaoRepository.save(caminhao1);
			}
			caminhaoRepository.deleteById(caminhao.getId());

		};
	}
	
	@Bean(name = "comprador")
	public CommandLineRunner run(CompradorRepository compradorRepository) {
		return (args) -> {
			Usuario usuario = new Usuario();
			usuario.setId(1);
			
			Comprador comprador = salvarComprador(compradorRepository, usuario);
			
			System.out.println(compradorRepository.count());
			
			comprador.setNome("Marcos Célio");
			compradorRepository.save(comprador);
			
			List<Comprador> lista = compradorRepository.obterLista(usuario.getId());
			System.out.println(lista.size());

		};
	}

	private Comprador salvarComprador(CompradorRepository compradorRepository, Usuario usuario) throws CpfInvalidoException {
		Comprador comprador = new Comprador("Marco Antonio", "01234567891", "marco@gmail.com");
		comprador.setUsuario(usuario);
		return compradorRepository.save(comprador);
	}

	private Caminhao salvarCaminhao(CaminhaoRepository caminhaoRepository, Usuario usuario) {
		Caminhao caminhao = new Caminhao();
		caminhao.setCapacidadeDeTransporte(5.6f);
		caminhao.setTipoCarroceria("Cegonha");
		caminhao.setTorque(2.2f);
		caminhao.setNome("Revoada");
		caminhao.setMarca("Mercedes");
		caminhao.setValor(100000.99f);
		caminhao.setUsuario(usuario);
		caminhaoRepository.save(caminhao);
		return caminhao;
	}

}
