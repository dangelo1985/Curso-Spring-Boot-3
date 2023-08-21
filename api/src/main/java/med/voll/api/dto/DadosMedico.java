package med.voll.api.dto;

import med.voll.api.entity.Medico;
import med.voll.api.enuns.EspecialidadeEnun;

public record DadosMedico(Long id, String nome, String email, String crm, EspecialidadeEnun especialidade ) {
	
	public DadosMedico(Medico medico) {
		this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
	}
}
