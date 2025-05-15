package br.edu.unichristus.repository;

import br.edu.unichristus.domain.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}