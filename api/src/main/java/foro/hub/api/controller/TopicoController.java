package foro.hub.api.controller;

import foro.hub.api.domain.topico.*;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("topicos")
@SecurityRequirement(name = "bearer-key")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    @PostMapping
    @Transactional
    public void registrar(@RequestBody @Valid DatosRegistrarTopico datos) {
        repository.save(new Topico(datos));
    }

    @GetMapping
    public Page<DatosListadoTopico> listar(@PageableDefault(size = 10, sort = {"titulo"}) Pageable paginacion) {
        return repository.findAllByEstadoTrue(paginacion).map(DatosListadoTopico::new);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatosListadoTopico> retornaDatostopico(@PathVariable Long id) {
        Topico topico = repository.getReferenceById(id);
        var datosTopico = new DatosListadoTopico(topico.getTitulo(),
                topico.getMensaje(), topico.getFechaDeCreacion(),
                topico.getEstado(), topico.getAutor(), topico.getCurso());
        return ResponseEntity.ok(datosTopico);
    }

    @PutMapping
    @Transactional
    public void actualizar(@RequestBody @Valid DatosActualizarTopico datos) {
        var topico = repository.getReferenceById(datos.id());
        topico.actualizarInformaciones(datos);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void eliminar(@PathVariable Long id) {
        var topico = repository.getReferenceById(id);
        topico.eliminar();
    }
}
