package com.joseflores.dojosyninjas.models;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import lombok.NoArgsConstructor;
import jakarta.persistence.Table;

@NoArgsConstructor
@Entity
@Table(name = "dojos")
public class Dojos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NotEmpty(message = "El nombre del dojo no puede quedar vacío")
    private String name;
    @Column(updatable = false)
    private Date createdAt;  

    private Date updatedAt;
    @OneToMany(mappedBy = "dojos", fetch = FetchType.LAZY)
    private List<Ninja> ninjas;
    
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public List<Ninja> getNinjas() {
        return ninjas;
    }
    public void setNinjas(List<Ninja> ninjas) {
        this.ninjas = ninjas;
    }
    
}
