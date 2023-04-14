package br.unisul.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unisul.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
