package br.com.projeto.vida.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import br.com.projeto.vida.model.ClientesModel;

public interface ClientesRepository extends CrudRepository<ClientesModel, Long> {
      Optional<ClientesModel> findById(Long codigo); 
}
