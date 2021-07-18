package Banco.Reserva.Conta.Repository;

import Banco.Reserva.Conta.Domain.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface ReservaRepository extends MongoRepository<Reserva, String> {
    @Query("{'_id': ?0}")
    Optional<Reserva> findByReserva(int reserva);
}
