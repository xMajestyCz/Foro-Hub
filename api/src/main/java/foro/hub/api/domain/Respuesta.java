package foro.hub.api.domain;

import foro.hub.api.domain.Autor.Autor;
import foro.hub.api.domain.topico.Topico;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "respuestas")
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensaje;
    @ManyToOne
    @JoinColumn(name = "topico_id")
    private Topico topico;
    private LocalDateTime fechaDeCreacion;
    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;
    private String solucion;

    public Respuesta(){

    }

    public Long getId() {
        return id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Topico getTopico() {
        return topico;
    }

    public LocalDateTime getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getSolucion() {
        return solucion;
    }
}
