package com.github.vinyprogramador.heroesapi.controller;

import com.github.vinyprogramador.heroesapi.entity.Company;
import com.github.vinyprogramador.heroesapi.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
//Nome: Vinicius A Nunes
//RA: 01221125
@RestController
@RequestMapping("/companys")
public class CompanyController {
    @Autowired
    CompanyRepository companyRepository;

    //Add a new company
    @PostMapping
    public ResponseEntity<Company> newCompanyEndpoint(@RequestBody Company company) {
        companyRepository.save(company);
        return ResponseEntity.status(201).body(company);
    }

    //Show all comapnies
    @GetMapping
    public ResponseEntity<List<Company>> showAllComapnies() {
        List<Company> companies = companyRepository.findAll();
        if (companies.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(companies);
    }

}
