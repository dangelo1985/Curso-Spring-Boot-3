package med.voll.api.dto;

import jakarta.validation.constraints.NotNull;

public record MedicoDTOEditar(
		@NotNull
		Long id,
		
		String nome,
		
		String telefone,
		
		EnderecoDTO endereco
		
		) {

}
