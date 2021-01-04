//package exam.spring.backend.controller;
//
//
//import exam.spring.backend.model.Supervisor;
//import exam.spring.backend.repository.SupervisorRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import javax.crypto.spec.OAEPParameterSpec;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@CrossOrigin(origins = "http://localhost:3000")
//@RestController
//@RequestMapping("/supervisor")
//public class SupervisorController {
//
//    @Autowired
//    SupervisorRepository supervisorRepository;
//
//
//    @GetMapping("/all")
//    public List<Supervisor> getAllSupervisors() {
//        return supervisorRepository.findAll();
//    }
//
//        //        try {
////            List<Supervisor> supervisors = new ArrayList<>();
////
////            if (name == null)
////                supervisors = supervisorRepository.findAll();
////
////            if (supervisors.isEmpty())
////                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
////
////            return new ResponseEntity<>(supervisors, HttpStatus.OK);
////        } catch (Exception e) {
////            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
////        }
////    }
//
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Supervisor> getSupervisorById(@PathVariable("id") long id) {
//        Optional<Supervisor> supervisorData = supervisorRepository.findById(id);
//        if (supervisorData.isPresent())
//            return new ResponseEntity<>(supervisorData.get(), HttpStatus.OK);
//        else
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//
//    @PostMapping("/create")
//    public ResponseEntity<Supervisor> createSupervisor(@RequestBody Supervisor supervisor) {
//        try {
//            Supervisor supervisor1 = supervisorRepository.saveAndFlush(supervisor);
//            return new ResponseEntity<>(supervisor1, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//
//    @PutMapping("/update/{id}")
//    public ResponseEntity<Supervisor> updateSupervisor(@PathVariable("id") long id, @RequestBody Supervisor supervisor) {
//        Optional<Supervisor> supervisorData = supervisorRepository.findById(id);
//
//        if (supervisorData.isPresent()) {
//            Supervisor supervisor1 = supervisorData.get();
//            supervisor1.setName(supervisor.getName());
//            //supervisor1.setStudentsBySu(supervisor.getStudents());
//            return new ResponseEntity<>(supervisorRepository.saveAndFlush(supervisor1), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<HttpStatus> deleteSupervisor(@PathVariable("id") long id) {
//        try {
//            supervisorRepository.deleteById(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//
//    @DeleteMapping("/")
//    public ResponseEntity<HttpStatus> deleteAllSupervisors() {
//        try {
//            supervisorRepository.deleteAll();
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//}
