package foro.hub.api.domain.topico;

import foro.hub.api.domain.Autor.Autor;
import foro.hub.api.domain.Curso;

import java.time.LocalDateTime;

public record DatosListadoTopico(
        String titulo,
        String mensaje,
        LocalDateTime fechaDeCreacion,
        Boolean estado,
        Autor autor,
        Curso curso
) {
    public DatosListadoTopico(Topico topico) {
        this(topico.getTitulo(), topico.getMensaje(), topico.getFechaDeCreacion(), topico.getEstado(), topico.getAutor(), topico.getCurso());
    }
}
