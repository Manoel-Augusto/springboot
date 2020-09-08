package com.sysdevbr.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sysdevbr.api.model.Lancamento;
import com.sysdevbr.api.model.Pessoa;
import com.sysdevbr.api.repository.LancamentoRepository;
import com.sysdevbr.api.repository.PessoaRepository;
import com.sysdevbr.api.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {

	@Autowired
	private PessoaRepository pessoaRepository;

	@Autowired
	private LancamentoRepository lancamentoRepository;

	public Lancamento salvar(Lancamento lancamento) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo());

		if (pessoa == null || pessoa.get().isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		return lancamentoRepository.save(lancamento);

	}

}
