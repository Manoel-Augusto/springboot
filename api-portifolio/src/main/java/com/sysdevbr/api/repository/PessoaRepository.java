package com.sysdevbr.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sysdevbr.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
