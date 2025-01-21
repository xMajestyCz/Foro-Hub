package foro.hub.api.domain.topico;

import foro.hub.api.domain.Autor.Autor;
import foro.hub.api.domain.Curso;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosActualizarTopico(
        @NotNull
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaDeCreacion,
        Boolean estado,
        Autor autor,
        Curso curso
) {
}
