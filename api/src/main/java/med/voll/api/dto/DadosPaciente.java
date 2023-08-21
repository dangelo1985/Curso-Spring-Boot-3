package med.voll.api.dto;

import med.voll.api.entity.Paciente;

public record DadosPaciente(Long id, String nome, String email, String cpf) {
	
	public DadosPaciente(Paciente paciente) {
		this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
	}

}
