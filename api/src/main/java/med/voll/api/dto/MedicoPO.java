package med.voll.api.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.enuns.EspecialidadeEnun;

public class MedicoPO {
	
	@NotBlank
	String nome;
	
	@NotBlank
	@Email
	String email;
	
	@NotBlank
	@Pattern(regexp = "\\d{4,6}")
	String crm;
	
	@NotNull
	EspecialidadeEnun especialidade; 
	
	@NotNull
	@Valid
	EnderecoDTO endereco; 

}
