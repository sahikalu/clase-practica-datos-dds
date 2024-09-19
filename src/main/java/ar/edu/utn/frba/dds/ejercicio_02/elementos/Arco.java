package ar.edu.utn.frba.dds.ejercicio_02.elementos;

import ar.edu.utn.frba.dds.ejercicio_02.Persistente;
import ar.edu.utn.frba.dds.ejercicio_02.personajes.Personaje;

import javax.persistence.Entity;

@Entity
public class Arco extends Persistente implements ElementoDefensor {

  @Override
  public void defenderA(Personaje personaje) {
      
  }
}
