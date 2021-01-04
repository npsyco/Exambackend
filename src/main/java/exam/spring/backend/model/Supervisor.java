package exam.spring.backend.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

@Entity

public class Supervisor {

    private long supervisorId;
    private String name;
    private Collection<Student> studentsById;


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


//    @JsonBackReference
//    @OneToMany(mappedBy = "supervisorBySupervisorId")
//    public Collection<Student> getStudentsBySupervisorId() {return studentsBySupervisorId;}
//
//    public void setStudentsBySupervisorId(Collection<Student> studentsBySupervisorId) {
//        this.studentsBySupervisorId = studentsBySupervisorId;
//    }


    @OneToMany(mappedBy = "supervisorBySupervisorId")
    public Collection<Student> getStudentsById() {
        return studentsById;
    }

    public void setStudentsById(Collection<Student> studentsById) {
        this.studentsById = studentsById;
    }





//    public Supervisor(){}
//
//    public Supervisor(int supervisorId, String name, Set<Student> students) {
//        this.supervisorId = supervisorId;
//        this.name = name;
//        this.students = students;
//    }

//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }


}