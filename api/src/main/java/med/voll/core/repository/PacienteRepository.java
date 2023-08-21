package med.voll.core.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import med.voll.api.dto.DadosPaciente;
import med.voll.api.entity.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

	Page<DadosPaciente> findAllByAtivoTrue(Pageable paginacao);

}
