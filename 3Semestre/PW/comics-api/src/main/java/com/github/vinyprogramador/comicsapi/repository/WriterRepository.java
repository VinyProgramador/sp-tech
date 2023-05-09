package com.github.vinyprogramador.comicsapi.repository;

import com.github.vinyprogramador.comicsapi.entity.Writer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WriterRepository extends JpaRepository<Writer, Integer> {
}
