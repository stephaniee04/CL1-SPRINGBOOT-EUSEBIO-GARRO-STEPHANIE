package pe.edu.i202223576.cl1_jpa_data_Eusebio_Stephanie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202223576.cl1_jpa_data_Eusebio_Stephanie.Repository.CountryRepository;
import pe.edu.i202223576.cl1_jpa_data_Eusebio_Stephanie.entity.Country;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class Cl1JpaDataEusebioStephanieApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataEusebioStephanieApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//ifPresentOrElse()

		/*Map<String, List<String>> lenguajesPorPais = new HashMap<>();
		lenguajesPorPais.put("ARG", Arrays.asList("Español", "Guaraní"));
		lenguajesPorPais.put("PER", Arrays.asList("Español", "Quechua"));

		// País a buscar
		String paisArgentina = "ARG";
		String paisPeru = "PER";

		// Buscar los lenguajes de Argentina
		Optional<List<String>> lenguajesDeArgentina = Optional.ofNullable(lenguajesPorPais.get(paisArgentina));

		// Usar ifPresentOrElse() para imprimir los lenguajes de Argentina o, si no existe, los de Perú
		lenguajesDeArgentina.ifPresentOrElse(
				// Si existen lenguajes para Argentina
				lenguajes -> {
					System.out.println("Lenguajes hablados en Argentina:");
					lenguajes.forEach(System.out::println);
				},
				// Si no existen lenguajes para Argentina, imprimir los de Perú
				() -> {
					System.out.println("Lenguajes hablados en Perú:");
					Optional.ofNullable(lenguajesPorPais.get(paisPeru))
							.ifPresentOrElse(
									lenguajes -> lenguajes.forEach(System.out::println),
									() -> System.out.println("No se encontraron lenguajes para el país solicitado")
							);
				}
		);*/

		//deleteAllById()
/*
		List<Integer> lista = List.of("COL", "ARG");
      lista.stream().filter((item) -> {
           return countryRepository.existsById(item);
        }).collect(Collectors.toList());
        lista.stream().filter(countryRepository::existsById).collect(Collectors.toList());

		countryRepository.deleteAllById(lista);
	}
	*/
	}
}




