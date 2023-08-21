package med.voll.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import med.voll.api.dto.DadosPaciente;
import med.voll.api.dto.PacienteDTO;
import med.voll.api.dto.PacienteDTOEditar;
import med.voll.core.service.PacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
	
	//@Autowired
	//private PacienteMapper mapper;
	
	@Autowired
	private PacienteService service;
	
	
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid PacienteDTO dto) {
		service.salvar(dto);
	}
	
	@GetMapping
	public Page<DadosPaciente> listar(Pageable paginacao){
		
		return service.listar(paginacao);
		
	}
	
	@PutMapping
	@Transactional
	public void editar(@RequestBody @Valid PacienteDTOEditar dto){
		
		service.editar(dto);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public void editar(@PathVariable Long id){
		
		service.excluir(id);
	}
	
}
