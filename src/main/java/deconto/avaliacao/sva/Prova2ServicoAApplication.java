package deconto.avaliacao.sva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Prova2ServicoAApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prova2ServicoAApplication.class, args);
	}

}
