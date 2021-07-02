package Banco.Reserva.Conta.Service;

import Banco.Reserva.Conta.Domain.Conta;
import Banco.Reserva.Conta.Repository.ContaRepository;
import Banco.Reserva.Conta.Repository.ContasRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContaService {

    @Autowired
    private ContasRepository _repository;

    public Conta retornaConta(int id)
    {
        Optional<Conta> conta = _repository.findByConta(id);
        return conta.get();
    }

    public Conta createConta(Conta conta)
    {
        _repository.save(conta);
        return conta;
    }
}
