package med.voll.core.mapper;

import org.springframework.stereotype.Component;

import med.voll.api.dto.PacienteDTO;
import med.voll.api.entity.Endereco;
import med.voll.api.entity.Paciente;

@Component
public class PacienteMapper {

	public Paciente getPacienteModel(PacienteDTO dto) {
		Paciente paciente = new Paciente();
		Endereco endereco = new Endereco();

		paciente.setNome(dto.nome());
		paciente.setEmail(dto.email());
		paciente.setCpf(dto.cpf());
		paciente.setTelefone(dto.telefone());
		paciente.setEndereco(getEnderecoModel(endereco, dto));

		return paciente;
	}
	
	public Endereco getEnderecoModel(Endereco endereco, PacienteDTO dto) {

		endereco.setLogradouro(dto.endereco().logradouro());
		endereco.setNumero(dto.endereco().numero());
		endereco.setBairro(dto.endereco().bairro());
		endereco.setComplemento(dto.endereco().complemento());
		endereco.setCep(dto.endereco().cep());
		endereco.setCidade(dto.endereco().cidade());
		endereco.setUf(dto.endereco().uf());

		return endereco;
	}
	
	

}
