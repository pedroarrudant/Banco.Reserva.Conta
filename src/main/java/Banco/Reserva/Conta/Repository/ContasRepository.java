package Banco.Reserva.Conta.Repository;

import Banco.Reserva.Conta.Domain.Conta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContasRepository extends MongoRepository<Conta, String> {
    @Query("{'conta': ?0}")
    Optional<Conta> findByConta(int conta);
}
