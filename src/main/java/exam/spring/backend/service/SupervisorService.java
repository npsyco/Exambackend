package exam.spring.backend.service;

import exam.spring.backend.model.Supervisor;
import exam.spring.backend.repository.SupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupervisorService {

    @Autowired
    SupervisorRepository supervisorRepository;

    public List<Supervisor> getAll() {
        return supervisorRepository.findAll();
    }

    public Supervisor getById(long id) {
        Optional<Supervisor> supervisor = supervisorRepository.findById(id);
        if (supervisor.isPresent()) {
            return supervisor.get();
        }
        return null;
    }
}
