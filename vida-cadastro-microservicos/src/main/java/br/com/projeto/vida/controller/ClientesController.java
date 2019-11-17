package br.com.projeto.vida.controller;

import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.projeto.vida.controller.dto.ClienteDto;
import br.com.projeto.vida.model.ClientesModel;
import br.com.projeto.vida.repository.ClientesRepository;

@RestController
@RequestMapping("/api/v1")
public class ClientesController {

	@Autowired
	private ClientesRepository clientesRepository;

	@GetMapping("/hello")
	@ResponseBody
	public String retornaMicroservico() {
		return "Microserviço está no ar !";
	}

	@PostMapping("/cadastrocliente")
	@ResponseBody
	public ResponseEntity<ClientesModel> cadastrar(@RequestBody @Valid ClientesModel clientesmodel,
			BindingResult bindingResult) {
		clientesRepository.save(clientesmodel);
		return new ResponseEntity<ClientesModel>(HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<ClienteDto> buscar(@PathVariable Long id) {
		Optional<ClientesModel> buscarId = clientesRepository.findById(id);
		if (buscarId.isPresent()) {
			return ResponseEntity.ok(new ClienteDto(buscarId.get()));

		}

		return ResponseEntity.notFound().build();

	}

	@PutMapping("/{id}")
	@ResponseBody
	public ResponseEntity<ClientesModel> alterar(@PathVariable Long id, @Valid @RequestBody ClientesModel cliente) {
		if (!clientesRepository.findById(id).isPresent()) {
			ResponseEntity.badRequest().build();
		}

		cliente.setCodigo(id);
		return ResponseEntity.ok(clientesRepository.save(cliente));

	}

	@DeleteMapping("/{id}")
	@ResponseBody
	public ResponseEntity<?> deletar(@PathVariable Long id) {
		Optional<ClientesModel> optional = clientesRepository.findById(id);
		if (optional.isPresent()) {
			clientesRepository.deleteById(id);
			return ResponseEntity.ok().build();

		}

		return ResponseEntity.notFound().build();

	}

}
