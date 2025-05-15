package br.edu.unichristus.repository;

import br.edu.unichristus.domain.model.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
}