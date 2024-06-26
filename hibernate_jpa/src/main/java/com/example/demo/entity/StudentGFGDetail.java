package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_gfg_detail")
public class StudentGFGDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "college")
    private String college;

    @Column(name = "no_of_problems_solved")
    private String noOfProblemsSolved;

    @OneToOne(mappedBy = Student_.STUDENT_GF_GDETAIL, cascade = CascadeType.ALL)
    private Student student;

    public StudentGFGDetail() {
    }

    public StudentGFGDetail(String college, String noOfProblemsSolved) {
        this.college = college;
        this.noOfProblemsSolved = noOfProblemsSolved;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getNoOfProblemsSolved() {
        return noOfProblemsSolved;
    }

    public void setNoOfProblemsSolved(String noOfProblemsSolved) {
        this.noOfProblemsSolved = noOfProblemsSolved;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
