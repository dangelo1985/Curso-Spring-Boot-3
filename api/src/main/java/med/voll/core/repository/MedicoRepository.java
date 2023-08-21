package med.voll.core.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import med.voll.api.dto.DadosMedico;
import med.voll.api.entity.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

	Page<DadosMedico> findAllByAtivoTrue(Pageable paginacao);
}
