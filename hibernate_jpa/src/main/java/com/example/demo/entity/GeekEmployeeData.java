package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "geek_employee_data")
public class GeekEmployeeData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "salary")
    private int salary;

    @ManyToMany()
    @JoinTable( name = "geek_employee_data_skill_set_data",
            joinColumns = { @JoinColumn(name = "geek_employee_data_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "skill_set_data_id", referencedColumnName = "id") })
    private Set<SkillSetData> skillSetData;

    public GeekEmployeeData() {
    }

    public GeekEmployeeData(String firstName, String lastName, int salary, Set<SkillSetData> skillSetData) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.skillSetData = skillSetData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Set<SkillSetData> getSkillSetData() {
        return skillSetData;
    }

    public void setSkillSetData(Set<SkillSetData> skillSetData) {
        this.skillSetData = skillSetData;
    }
}
