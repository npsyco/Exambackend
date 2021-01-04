//package exam.spring.backend.controller;
//
//
//import exam.spring.backend.model.Student;
//import exam.spring.backend.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
////@CrossOrigin(origins = "http://localhost:3000")
//@Controller
////@RequestMapping("/student")
//public class StudentController {
//
//    @Autowired
//    StudentRepository studentRepository;
//
//
//    @GetMapping("/students")
//    public String index(){ return "index.html"; }
//
////    public String student(Model model)
////        List<Student> studentList = studentRepository.findAll();
////        model.addAttribute("students", studentList);
////    public List<Student> getAllStudents() {
////        return studentRepository.findAll();
////    }
////    public ResponseEntity<List<Student>> getAllStudents(){
////        try {
////            List<Student> students = studentRepository.findAll();
////            if (students.isEmpty())
////                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
////
////            return new ResponseEntity<>(students, HttpStatus.OK);
////        } catch (Exception e) {
////            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
////        }
//    }
//
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Student> getStudentById(@PathVariable("id") long id){
//        Optional<Student> studentData = studentRepository.findById(id);
//        if (studentData.isPresent())
//            return new ResponseEntity<>(studentData.get(), HttpStatus.OK);
//        else
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//
//    @PostMapping("/create")
//    public Student createStudent(@RequestBody Student student){
//        return studentRepository.save(student);
////    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
////        try {
////            Student student1 = studentRepository.save(student);
////            return new ResponseEntity<>(student1, HttpStatus.CREATED);
////        } catch (Exception e) {
////            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
////        }
//    }
//
//
//    @PutMapping("/update/{id}")
//    public ResponseEntity<Student> updateStudent(@PathVariable("id") long id, @RequestBody Student student) {
//        Optional<Student> studentData = studentRepository.findById(id);
//
//        if (studentData.isPresent()) {
//            Student student1 = studentData.get();
//            student1.setName(student.getName());
//            student1.setEmail(student.getEmail());
//            student1.setSupervisor(student.getSupervisor());
//            return new ResponseEntity<>(studentRepository.saveAndFlush(student1), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable("id") long id) {
//        try {
//            studentRepository.deleteById(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } catch (Exception e){
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//
//    @DeleteMapping("/")
//    public ResponseEntity<HttpStatus> deleteAllStudents() {
//        try {
//            studentRepository.deleteAll();
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//}
