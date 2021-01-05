package exam.spring.backend.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity

public class Supervisor {

    private long supervisorId;
    private String name;
    //private Collection<Student> studentsById;
    private Collection<Student> studentsBySupervisorId;

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "supervisor_id", nullable = false)
    public long getSupervisorId() {
        return supervisorId;
    }
    public void setSupervisorId(long supervisorId) {
        this.supervisorId = supervisorId;
    }


    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @OneToMany(mappedBy = "supervisorBySupervisorId", cascade = CascadeType.REMOVE, orphanRemoval = true)
    public Collection<Student> getStudentsBySupervisorId() {
        return studentsBySupervisorId;
    }

    public void setStudentsBySupervisorId(Collection<Student> studentsBySupervisorId) {
        this.studentsBySupervisorId = studentsBySupervisorId;
    }

//    public Collection<Student> getStudentsById() {
//        return studentsById;
//    }

//    public void setStudentsBySupervisorId(Collection<Student> setStudentsBySupervisorId) {
//        this.studentsById = studentsById;
//        this.studentsById.forEach(student -> student.setSupervisorBySupervisorId(this));
//    }

//    public Collection<Student> getStudentsById() {
//        return studentsById;
//    }
//    public void setStudentsById(Collection<Student> studentsById) {
//        this.studentsById = studentsById;
//    }

}