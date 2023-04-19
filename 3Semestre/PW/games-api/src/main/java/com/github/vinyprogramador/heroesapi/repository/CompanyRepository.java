package com.github.vinyprogramador.heroesapi.repository;

import com.github.vinyprogramador.heroesapi.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
