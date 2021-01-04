package exam.spring.backend.controller;


import exam.spring.backend.model.Student;
import exam.spring.backend.model.Supervisor;
import exam.spring.backend.repository.StudentRepository;
import exam.spring.backend.repository.SupervisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
//@RequestMapping("/students")
public class HController {

//    @Autowired
//    StudentService studentService;
//
//    @Autowired
//    SupervisorService supervisorService;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    SupervisorRepository supervisorRepository;

    @GetMapping("/students")
    public String index(Model model) {
        model.addAttribute("studentList", studentRepository.findAll());
        model.addAttribute("supervisorList", supervisorRepository.findAll());

        Student student = new Student();
        model.addAttribute("newS", student);

        return "index";
    }


    @PostMapping("/create")
    public String create(@ModelAttribute Student student) {
        studentRepository.save(student);

        return "redirect:/students";
    }


//    @GetMapping("/{studentId}")
//    public String showUpdate(@PathVariable("id") long studentId, Model model) {
//        Optional<Student> student = studentRepository.findById(studentId);
//        model.addAttribute("student", student);
//        return "updateStudent";
//    }



    @PostMapping("/updateStudent")
    public String update(@ModelAttribute Student student) {
        studentRepository.save(student);

        return "redirect:/students";
    }


    @PostMapping("/deleteStudent/{studentId}")
    public String deleteStudent(@PathVariable("studentId") long studentId) {
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new IllegalArgumentException("Invalid id" + studentId));
        studentRepository.delete(student);

        return "redirect:/students";
    }


}
