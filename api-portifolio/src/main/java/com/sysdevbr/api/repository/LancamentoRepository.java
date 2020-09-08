package com.sysdevbr.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sysdevbr.api.model.Lancamento;
import com.sysdevbr.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

}
