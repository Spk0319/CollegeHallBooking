// Head.java
package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Head extends User {
    private String dept;
    private String expertise;
    @JsonIgnore
    @OneToMany(mappedBy = "head")
    private List<Faculty> faculty;
}
