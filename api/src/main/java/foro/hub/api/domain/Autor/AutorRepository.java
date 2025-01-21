package foro.hub.api.domain.Autor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    UserDetails findByCorreoElectronico(String username);
}
