package Banco.Reserva.Conta.Repository;

import Banco.Reserva.Conta.Domain.Reservas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface ReservasRepository extends MongoRepository<Reservas, String> {
    @Query("{'_id': ?0}")
    Optional<Reservas> findByReservas(int reserva);
}
