//package exam.spring.backend.service;
//
//import com.fasterxml.jackson.annotation.OptBoolean;
//import exam.spring.backend.model.Student;
//import exam.spring.backend.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class StudentService {
//
//
//    @Autowired
//    StudentRepository studentRepository;
//
//    public List<Student> findAll() { return studentRepository.findAll(); }
//
//    public Student findById(long id) {
//        Optional<Student> studentData = studentRepository.findById(id);
//        if (studentData.isPresent()) {
//            Student student = studentData.get();
//            return student;
//        }
//        return null;
//    }
//
//    public Student add(Student student) {return studentRepository.save(student); }
//
//    public void update(Student student) {studentRepository.save(student); }
//
//    public void delete(long id) { studentRepository.deleteById(Long.valueOf(id)); }
//
//
//
//}
