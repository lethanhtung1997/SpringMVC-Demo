package com.msita.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "majors")
public class Major {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "major", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Student> students;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(final List<Student> students) {
        this.students = students;
    }
}
