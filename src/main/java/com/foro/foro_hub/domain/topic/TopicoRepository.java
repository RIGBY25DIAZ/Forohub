package com.foro.foro_hub.domain.topic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
     Optional<Topico> findByTitulo ( String titulo );
     
     Optional<Topico> findByMensaje ( String mensaje );
     
     Page<Topico> findAllByFechaTrue ( Pageable paginacion );
}

