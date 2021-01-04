package exam.spring.backend.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
// without specfiying the @Table, the table name in sql will be the class name (student)
//@Table(name = "students")
public class Student {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;

    //@Column(name = "name")
    private String name;

    //@Column(name = "email")
    private String email;

    //@Column(name = "supervisor_id")
    private Supervisor supervisorBySupervisorId;


    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id", nullable = false)
    public long getStudentId() {
        return studentId;
    }
    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    @ManyToOne
    @JoinColumn(name = "supervisor_id", referencedColumnName = "supervisor_id", nullable = false)
    public Supervisor getSupervisorBySupervisorId()
    {return supervisorBySupervisorId;}

    public void setSupervisorBySupervisorId(Supervisor supervisorBySupervisorId)
    {this.supervisorBySupervisorId = supervisorBySupervisorId;}

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", supervisorBySupervisorId=" + supervisorBySupervisorId +
                '}';
    }
}
