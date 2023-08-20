package med.voll.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import med.voll.api.entity.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
