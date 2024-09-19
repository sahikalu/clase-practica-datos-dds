package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorValue("MAGO")
public class Mago  extends Personaje{

  @Column(name = "nivelDeMagia", columnDefinition = "INTEGER")
  private Integer nivelDeMagia;

  @Column(name = "tieneAlas", columnDefinition = "TINYINT")
  private Boolean tieneAlas;

  public void atacar(Personaje personaje) {
 //TODO
  }


}
