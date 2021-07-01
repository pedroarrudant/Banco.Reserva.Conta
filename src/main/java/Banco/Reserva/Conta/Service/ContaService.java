package Banco.Reserva.Conta.Service;

import Banco.Reserva.Conta.Domain.Conta;
import Banco.Reserva.Conta.Repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    @Autowired
    private ContaRepository _repository;

    public Conta retornaConta(int id)
    {
        return _repository.RetornaContaCliente(id);
    }
}
