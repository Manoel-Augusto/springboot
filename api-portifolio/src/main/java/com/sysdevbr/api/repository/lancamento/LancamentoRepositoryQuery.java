package com.sysdevbr.api.repository.lancamento;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;

import com.sysdevbr.api.model.Lancamento;
import com.sysdevbr.api.repository.filter.LancamentoFilter;
import com.sysdevbr.api.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, org.springframework.data.domain.Pageable pageable);

	Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, org.springframework.data.domain.Pageable pageable);
	

}
