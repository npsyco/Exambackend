package exam.spring.backend.repository;

import exam.spring.backend.model.Supervisor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupervisorRepository extends JpaRepository<Supervisor, Long> {


}
