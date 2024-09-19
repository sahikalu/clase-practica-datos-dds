package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import ar.edu.utn.frba.dds.ejercicio_02.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@DiscriminatorValue("LADRON")
public class Ladron extends Personaje {

  @Column(name = "nivelSiniestro", columnDefinition = "INTEGER")
  private Integer nivelSiniestro;

  @Column(name = "tieneNavaja", columnDefinition = "TINYINT")
  private Boolean tieneNavaja;

  public void atacar(Personaje personaje) {
 //TODO
  }
}
