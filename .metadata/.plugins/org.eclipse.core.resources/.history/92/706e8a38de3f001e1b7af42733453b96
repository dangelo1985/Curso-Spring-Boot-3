package med.voll.core.mapper;

import org.springframework.stereotype.Component;

import med.voll.api.dto.MedicoDTO;
import med.voll.api.entity.Endereco;
import med.voll.api.entity.Medico;

@Component
public class MedicoMapper {
	
	//@Autowired
	//private ModelMapper mapper;
	
	 
	public Medico getMedicoModel(MedicoDTO dto) {
	      Medico medico = new Medico();
	      Endereco endereco = new Endereco();
	      
	      medico.setNome(dto.nome());
	      medico.setEmail(dto.email());
	      medico.setCrm(dto.crm());
	      medico.setTelefone(dto.telefone());
	      medico.setEspecialidade(dto.especialidade());
	      medico.setEndereco(getEnderecoModel(endereco, dto));
	      
	      return medico;
	}

	public Endereco getEnderecoModel(Endereco endereco, MedicoDTO dto) {

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
