package med.voll.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import med.voll.api.dto.DadosPaciente;
import med.voll.api.entity.Paciente;
import med.voll.core.repository.PacienteRepository;

@Service
public class PacienteService {

	@Autowired
	private PacienteRepository repository;

	public boolean salvar(Paciente paciente) {

		try {
			repository.save(paciente);
			return true;
		} catch (Exception e) {
			System.out.println("Erro ao salvar paciente" + e.getMessage());
		}

		return false;
	}

	public Page<DadosPaciente> listar(Pageable paginacao) {

		return repository.findAll(paginacao).map(DadosPaciente::new);

	}

}
