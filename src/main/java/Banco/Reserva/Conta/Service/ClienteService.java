package Banco.Reserva.Conta.Service;

import Banco.Reserva.Conta.Domain.Cliente;
import Banco.Reserva.Conta.Repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClientesRepository _repository;

    public Cliente retornaCliente(int id)
    {
        Optional<Cliente> cliente = _repository.findById(id);
        return cliente.get();
    }

    public Cliente createCliente(Cliente cliente)
    {
        _repository.save(cliente);
        return cliente;
    }
}
