package Banco.Reserva.Conta.Repository;

import Banco.Reserva.Conta.Domain.Conta;
import org.springframework.stereotype.Repository;

@Repository
public class ContaRepository {

    public Conta RetornaContaCliente(int id)
    {
        return new Conta();
    }
}
