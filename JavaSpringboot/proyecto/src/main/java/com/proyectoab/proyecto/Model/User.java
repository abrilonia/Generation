package com.proyectoab.proyecto.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/* import com.fasterxml.jackson.annotation.JsonBackReference; */

@Entity(name = "User")
public class User {
    @Id
    
    @GeneratedValue
    private Integer id;
    private String name;

    @Column(name="last_name")
    private String lastName;
    private String correo;

    //relacion uno a uno, one to one
   /*  @JsonBackReference */
    @OneToOne(mappedBy = "user" , cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

    private License license;

    //relacion one to many
    /* @JsonBackReference */
    //en muchos a muchos empieza con EAGER
    @OneToMany(mappedBy = "user", cascade =CascadeType.ALL, fetch= FetchType.EAGER)
    

    private List<BuySell> BuySell;
    
    public User() {
    }

    
    public User(Integer id, String name, String lastName, String correo) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.correo = correo;
    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }


    
}
