package ar.edu.utn.frba.dds;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class PruebaPersistencia {

    @Id @GeneratedValue
    public Integer id;

    @Column
    public String nombre;
}
