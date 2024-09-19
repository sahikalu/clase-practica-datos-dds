package ar.edu.utn.frba.dds.ejercicio_02;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
public class Persistente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "estaActivo", columnDefinition = "TINYINT(1)")
    private Boolean estaActivo;

    @Column(name = "fechaAlta", columnDefinition = "TIMESTAMP")
    private LocalDateTime fechaDeAlta;

    @Column(name = "fechaBaja", columnDefinition = "TIMESTAMP")
    private LocalDateTime fechaBaja;

    @Column(name = "fechaUltimaModificacion", columnDefinition = "TIMESTAMP")
    private LocalDateTime fechaUltimaModificacion;
}
