package br.com.makersweb.demo.service;

import br.com.makersweb.demo.model.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author aaristides
 */
public interface IClienteService {

    Cliente buscar(Long codigo);

    Cliente salvar(Cliente cliente);

    Cliente editar(Long codigo, Cliente cliente);

    Page<Cliente> filtrar(Cliente clienteFilter, Pageable pageable);

    void remover(Long codigo);

    void atualizaPropriedadeAtivo(Long codigo, Boolean ativo);

}
