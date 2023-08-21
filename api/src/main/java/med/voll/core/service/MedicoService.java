package med.voll.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;

import med.voll.api.dto.DadosMedico;
import med.voll.api.dto.MedicoDTO;
import med.voll.api.dto.MedicoDTOEditar;
import med.voll.api.entity.Medico;
import med.voll.core.repository.MedicoRepository;

@Service
public class MedicoService {

	@Autowired
	private MedicoRepository repository;

	public boolean salvar(MedicoDTO dto) {
		Medico medico = new Medico(dto);
		try {
			repository.save(medico);
			return true;
		} catch (Exception e) {
			System.out.println("Erro ao salvar medico" + e.getMessage());
		}

		return false;
	}

	public Page<DadosMedico> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {

		return repository.findAll(paginacao).map(DadosMedico::new);

	}

	public void editar(MedicoDTOEditar dto) {
		var medico = repository.getReferenceById(dto.id());

		medico.atualizarMedico(dto);

	}

	public void excluir(Long id) {
		var medico = repository.getReferenceById(id);
		medico.excluir(id);
	}

}
