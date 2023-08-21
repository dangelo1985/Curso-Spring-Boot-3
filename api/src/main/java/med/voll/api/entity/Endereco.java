package med.voll.api.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import med.voll.api.dto.EnderecoDTO;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
	
	private String logradouro;
	private String bairro;
	private String cep;
	private String cidade;
	private String uf;
	private String numero;
	private String complemento;
	
	public Endereco(EnderecoDTO dto) {
		this.logradouro = dto.logradouro();
		this.bairro = dto.bairro();
		this.cep = dto.cep();
		this.cidade = dto.cidade();
		this.uf = dto.uf();
		this.numero = dto.numero();
		this.complemento = dto.complemento();
	}
	
	public void atualizarEndereco(EnderecoDTO dto) {
		if (dto.logradouro() != null) {
			this.logradouro = dto.logradouro();
		}
		if (dto.numero() != null) {
			this.numero = dto.numero();
		}
		if (dto.bairro() != null) {
			this.bairro = dto.bairro();
		}
		if (dto.complemento() != null) {
			this.complemento = dto.complemento();
		}
		if (dto.cep() != null) {
			this.cep = dto.cep();
		}
		if (dto.cidade() != null) {
			this.cidade = dto.cidade();
		}
		if (dto.uf() != null) {
			this.uf = dto.uf();
		}

	}

}
