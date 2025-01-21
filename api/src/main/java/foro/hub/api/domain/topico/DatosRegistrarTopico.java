package foro.hub.api.domain.topico;

import foro.hub.api.domain.Autor.Autor;
import foro.hub.api.domain.Curso;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistrarTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        Autor autor,
        @NotNull
        Curso curso
) {
}
