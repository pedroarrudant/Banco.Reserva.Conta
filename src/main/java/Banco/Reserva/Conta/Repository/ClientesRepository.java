package Banco.Reserva.Conta.Repository;

import Banco.Reserva.Conta.Domain.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientesRepository extends MongoRepository<Cliente, String> {
    @Query("{'_id': ?0}")
    Optional<Cliente> findById(int id);
}