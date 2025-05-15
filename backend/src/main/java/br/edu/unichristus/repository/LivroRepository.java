package br.edu.unichristus.repository;

import br.edu.unichristus.domain.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
